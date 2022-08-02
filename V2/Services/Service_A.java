package com.company.V2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service(value = "Service_A")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_A implements MyService {
    @Value("${prop.D}")
    private String one;
    @Override
    public String getOne(){
        return one;
    }

}
