package com.magic.batch.service.apollo;

import lombok.Data;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Classname CronParams
 * @Description Cronexpression apollo参数配置读取
 * @Date 2021/10/11 5:42 下午
 * @Created by yanchang
 */
@Service
@Data
public class CronParamsService {

    @Value("${firstCron:defaultValue}")
    private String firstCron;
}
