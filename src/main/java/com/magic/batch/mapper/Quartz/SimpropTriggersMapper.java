package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname SimpropTriggersMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface SimpropTriggersMapper {

    /**
     * 清理QRTZ_SIMPROP_TRIGGERS表
     *
     * @return
     */
    @Delete("delete from QRTZ_SIMPROP_TRIGGERS")
    int deleteSimpropTriggers();
}
