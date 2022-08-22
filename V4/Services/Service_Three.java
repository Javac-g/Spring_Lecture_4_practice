package com.company.V4.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service("Service_Three")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_Three implements ServiceImpl {
    @Value("${prop.E}")
    private String one;

    @Override
    public String getOne() {
        return one;
    }
}
