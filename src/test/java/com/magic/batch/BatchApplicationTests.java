package com.magic.batch;

import com.magic.batch.mapper.Quartz.JobDetailsMapper;
import com.magic.batch.mapper.Quartz.LocksMapper;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class BatchApplicationTests {

    @Autowired
    private LocksMapper locksMapper;

    @Autowired
    private JobDetailsMapper jobDetailsMapper;

    @Test
    void contextLoads() {

        int i = locksMapper.deleteLocaks();
        System.out.println("删除个数="+i);

    }

}
