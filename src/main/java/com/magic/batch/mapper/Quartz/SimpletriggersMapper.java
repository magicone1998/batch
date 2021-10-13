package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname SimpletriggersMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface SimpletriggersMapper {

    /**
     * 清理QRTZ_SIMPLE_TRIGGERS表
     *
     * @return
     */
    @Delete("delete from QRTZ_SIMPLE_TRIGGERS")
    int deleteSimpleTriggers();
}
