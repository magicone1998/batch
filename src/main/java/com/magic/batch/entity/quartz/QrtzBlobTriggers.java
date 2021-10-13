package com.magic.batch.entity.quartz;

import lombok.Data;

/**
 * @Classname QrtzBlobTriggers
 * @Description TODO
 * @Date 2021/10/12 11:16 上午
 * @Created by yanchang
 */
@Data
public class QrtzBlobTriggers {
    private String schedName;
    private String triggerName;
    private String triggerGroup;
    private String blobData;
}
