package com.zhw.ms.middleware;

import com.zhw.ms.commons.utils.DateUtil;
import com.zhw.ms.middleware.cache.RedisUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/31 0031.
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
public class BasicTest {

    @Test
    public void test01() throws InterruptedException {
        RedisUtil.setValue("test", "test", 1);
        System.out.println(RedisUtil.getValue("test"));
        System.out.println(DateUtil.format(new Date(), DateUtil.YYYYMMDDHHMMSSMS));
    }

}
