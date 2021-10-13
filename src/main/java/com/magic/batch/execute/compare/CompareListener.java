package com.magic.batch.execute.compare;

import com.magic.batch.service.apollo.CronParamsService;
import com.magic.batch.service.quartz.InitializationJobDataService;
import com.magic.batch.task.compare.CompareJob;
import lombok.SneakyThrows;
import org.quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextClosedEvent;
import org.springframework.stereotype.Component;

/**
 * @Classname QuartzListener
 * @Description 该类用来触发对账相关任务
 * @Date 2021/10/11 3:32 下午
 * @Created by yanchang
 */
@Component
public class CompareListener implements ApplicationListener<ContextClosedEvent> {

    @Autowired
    private Scheduler scheduler;

    @Autowired
    private CronParamsService cronParamsService;

    @Autowired
    private InitializationJobDataService initializationJobDataService;

    @SneakyThrows
    @Override
    public void onApplicationEvent(ContextClosedEvent event) {
        //initializationJobDataService.initQuartzData();
        unionpaySchedule();
    }


    /**
     * 通道1对账调度器
     * @throws SchedulerException
     */
    public void unionpaySchedule() throws SchedulerException {
        String firstCron = cronParamsService.getFirstCron();
        System.out.println(firstCron);
        TriggerKey triggerKey = TriggerKey.triggerKey("trigger1", "group1");
        Trigger trigger = scheduler.getTrigger(triggerKey);
        if (trigger == null) {
            trigger = TriggerBuilder.newTrigger()
                    .withIdentity(triggerKey)
                    .withSchedule(CronScheduleBuilder.cronSchedule(firstCron))
                    .build();
            JobDetail jobDetail = JobBuilder.newJob(CompareJob.class)
                    .withIdentity("job1", "group1")
                    .build();
            scheduler.scheduleJob(jobDetail, trigger);
            scheduler.start();
        }
    }
}
