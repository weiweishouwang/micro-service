package com.zhw.ms.demo.hystrix;

import com.zhw.ms.demo.client.DemoClient;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

/**
 * Created by hongweizou on 16/9/12.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class DemoClientProxyTest {
    @Autowired
    private DemoClientProxy demoClientProxy;

    @Test
    public void test01() {
        Assert.assertTrue(demoClientProxy.getAdmin(1).isSuccess());
    }
}
