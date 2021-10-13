package com.magic.batch.mapper.Quartz;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.magic.batch.entity.quartz.QrtzBlobTriggers;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;

/**
 * @Classname QuartzMapper
 * @Description TODO
 * @Date 2021/10/12 11:25 上午
 * @Created by yanchang
 */
@Mapper
public interface BlobTriggersMapper{

    /**
     * 清理QRTZ_BLOB_TRIGGERS表
     *
     * @return
     */
    @Delete("delete from QRTZ_BLOB_TRIGGERS")
    int deleteBlobTriggers();
}
