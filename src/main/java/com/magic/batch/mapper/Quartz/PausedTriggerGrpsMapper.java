package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname PausedTriggerGrpsMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface PausedTriggerGrpsMapper {

    /**
     * 清理QRTZ_PAUSED_TRIGGER_GRPS表
     *
     * @return
     */
    @Delete("delete from QRTZ_PAUSED_TRIGGER_GRPS")
    int deletePausedTriggerGrps();
}
