package com.magic.batch.mapper.Quartz;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname JobDetailsMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface JobDetailsMapper {

    /**
     * 清理QRTZ_JOB_DETAILS表
     *
     * @return
     */
    @Delete("delete from QRTZ_JOB_DETAILS")
    int deleteJobDetails();
}
