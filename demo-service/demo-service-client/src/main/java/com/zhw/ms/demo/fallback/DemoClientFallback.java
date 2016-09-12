package com.zhw.ms.demo.fallback;

import com.zhw.ms.commons.bean.Result;
import com.zhw.ms.demo.client.DemoClient;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by hongweizou on 16/9/12.
 */
public class DemoClientFallback implements DemoClient {
    @Override
    public Result<Object> getAdmin(@RequestParam("id") Integer id) {
        return null;
    }
}
