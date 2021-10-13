package com.magic.batch.service.quartz;

import com.magic.batch.mapper.Quartz.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Classname InitializationJobDataService
 * @Description 初始化数据库表任务参数
 * @Date 2021/10/12 11:08 上午
 * @Created by yanchang
 */
@Service
public class InitializationJobDataService {

    @Autowired
    private BlobTriggersMapper blobTriggersMapper;

    @Autowired
    private CalendarsMapper calendarsMapper;

    @Autowired
    private CronTriggersMapper cronTriggersMapper;

    @Autowired
    private FiredTriggersMapper firedTriggersMapper;

    @Autowired
    private JobDetailsMapper jobDetailsMapper;

    @Autowired
    private  LocksMapper locksMapper;

    @Autowired
    private PausedTriggerGrpsMapper pausedTriggerGrpsMapper;

    @Autowired
    private SchedulerStateMapper schedulerStateMapper;

    @Autowired
    private SimpletriggersMapper simpletriggersMapper;

    @Autowired
    private SimpropTriggersMapper simpropTriggersMapper;

    @Autowired
    private TriggersMapper triggersMapper;

    /**
     * 此方法用来任务启动时清空Quartz自带的11张表数据，删除顺序不能改变，否则可能会删除失败
     *
     */
    public void initQuartzData(){
        locksMapper.deleteLocaks();
        schedulerStateMapper.deleteSchedulerState();
        firedTriggersMapper.deleteFiredTriggers();
        pausedTriggerGrpsMapper.deletePausedTriggerGrps();
        calendarsMapper.deleteCalendars();
        blobTriggersMapper.deleteBlobTriggers();
        simpropTriggersMapper.deleteSimpropTriggers();
        cronTriggersMapper.deleteCronTriggers();
        simpletriggersMapper.deleteSimpleTriggers();
        triggersMapper.deleteTriggers();
        jobDetailsMapper.deleteJobDetails();
    }
}
