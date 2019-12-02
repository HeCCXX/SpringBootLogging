package com.hcx.springbootlogging;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DemoApplicationTests {


    Logger logger = LoggerFactory.getLogger(DemoApplication.class);

    @Test
    void contextLoads() {
        logger.info("hello");
    }

}
