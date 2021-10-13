package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname CalendarsMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface CalendarsMapper {

    /**
     * 清理QRTZ_CALENDARS表
     *
     * @return
     */
    @Delete("delete from QRTZ_CALENDARS")
    int deleteCalendars();
}
