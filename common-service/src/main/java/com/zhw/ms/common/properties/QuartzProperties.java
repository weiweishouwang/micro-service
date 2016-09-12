package com.zhw.ms.common.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * Created by Administrator on 2015/12/29 0029.
 */
//@Component
//@ConfigurationProperties(prefix = "jcc.quartz")
public class QuartzProperties {
    private String schedulerName = "tctest";

    public String getSchedulerName() {
        return schedulerName;
    }

    public void setSchedulerName(String schedulerName) {
        this.schedulerName = schedulerName;
    }
}
