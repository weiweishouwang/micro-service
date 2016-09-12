package com.zhw.ms.commons.properties;

import com.zhw.ms.commons.consts.JccConst;
import com.zhw.ms.commons.utils.JccUtil;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;

/**
 * Created by Administrator on 2015/12/29 0029.
 */
@Component
@ConfigurationProperties(prefix = "jcc.service")
public class ServiceProperties {
    private String whiteIps;

    public List<String> getWhiteips() {
        String[] ips = JccUtil.toArray(whiteIps, JccConst.SPLIT_COMMA);
        return Arrays.asList(ips);
    }

    public void setWhiteips(String whiteips) {
        this.whiteIps = whiteips;
    }
}
