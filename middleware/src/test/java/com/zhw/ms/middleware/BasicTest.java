package com.zhw.ms.middleware;

import com.zhw.ms.commons.spring.SpringUtil;
import com.zhw.ms.commons.utils.DateUtil;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.boot.test.WebIntegrationTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

/**
 * Created by Administrator on 2015/12/31 0031.
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class BasicTest {

    @Test
    public void test01() throws InterruptedException {
        System.out.println(DateUtil.format(new Date(), DateUtil.YYYYMMDDHHMMSSMS));
    }

}
