package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname LocksMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface LocksMapper {

    /**
     * 清理QRTZ_LOCKS表
     *
     * @return
     */
    @Delete("delete from QRTZ_LOCKS where SCHED_NAME is not null")
    int deleteLocaks();
}
