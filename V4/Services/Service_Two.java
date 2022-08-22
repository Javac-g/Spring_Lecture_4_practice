package com.company.V4.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Primary
@Service("Service_Two")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_Two implements ServiceImpl {
    @Value("${prop.C}")
    private String one;

    @Override
    public String getOne() {
        return one;
    }
}
