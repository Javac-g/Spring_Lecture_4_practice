package com.company.V5.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service("Service_C")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_C {
    @Value("${prop.B}")
    private String one;

    public String getOne() {
        return one;
    }
}