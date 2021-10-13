package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname FiredTriggersMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface FiredTriggersMapper {

    /**
     * 清理QQRTZ_FIRED_TRIGGERS表
     *
     * @return
     */
    @Delete("delete from QRTZ_FIRED_TRIGGERS")
    int deleteFiredTriggers();
}
