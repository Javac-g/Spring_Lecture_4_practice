package com.company.v3.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service("Service_B")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_B {
    @Value("${prop.F}")
    private String one;
    public String getOne(){
        return one;
    }
}
