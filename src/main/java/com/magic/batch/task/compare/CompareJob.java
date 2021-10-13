package com.magic.batch.task.compare;

import org.quartz.DisallowConcurrentExecution;
import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.scheduling.quartz.QuartzJobBean;

/**
 * @Classname CompareJob
 * @Description 该类用来执行对账逻辑
 * @Date 2021/10/11 2:35 下午
 * @Created by yanchang
 */
@DisallowConcurrentExecution
public class CompareJob extends QuartzJobBean {

    @Override
    protected void executeInternal(JobExecutionContext context) throws JobExecutionException {
        //-- 具体执行的任务程序
        System.out.println("=====yanchang======");
    }
}
