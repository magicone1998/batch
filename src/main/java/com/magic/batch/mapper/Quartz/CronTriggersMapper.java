package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname CronTriggersMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface CronTriggersMapper {

    /**
     * 清理QRTZ_CRON_TRIGGERS表
     *
     * @return
     */
    @Delete("delete from QRTZ_CRON_TRIGGERS")
    int deleteCronTriggers();
}
