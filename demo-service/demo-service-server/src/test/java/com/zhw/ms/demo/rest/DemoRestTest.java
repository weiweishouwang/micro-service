package com.zhw.ms.demo.rest;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hongweizou on 16/9/12.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoRestTest {
    @Autowired
    private DemoRest demoRest;

    @Test
    public void test01() {
        Assert.assertTrue(demoRest.getAdmin(1).isSuccess());
    }
}
