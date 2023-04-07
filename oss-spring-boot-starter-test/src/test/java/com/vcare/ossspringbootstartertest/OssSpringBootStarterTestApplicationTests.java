package com.vcare.ossspringbootstartertest;

import com.qing.oss.core.OssTemplate;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class OssSpringBootStarterTestApplicationTests {
    @Autowired
    private OssTemplate ossTemplate;
    @Test
    void contextLoads() {
        ossTemplate.createBucket("oss02");
    }

}
