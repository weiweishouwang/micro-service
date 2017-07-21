package com.zhw.ms.demo.fallback;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.zhw.ms.commons.bean.Result;
import com.zhw.ms.demo.client.DemoClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hongweizou on 16/9/12.
 */
//@Component
public class DemoClientFallback /*implements DemoClient*/ {
    private static final Logger logger = LoggerFactory
            .getLogger(DemoClientFallback.class);

    //@Override
    public Result<Object> getAdmin(Long id) {
        return null;
    }

}
