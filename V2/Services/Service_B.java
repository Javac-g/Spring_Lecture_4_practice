package com.company.V2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

//@Primary
@Service(value = "Service_B")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_B implements MyService {

    @Value("${prop.E}")
    private String one;

    @Override
    public String getOne(){
        return one;
    }


}
