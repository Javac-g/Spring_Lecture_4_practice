package com.company.V5.Services;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service("Servise_B")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
@Primary
public class Service_B implements ServiceImpl{
    @Value("${prop.B}")
    private String one;

    @Override
    public String getOne() {
        return one;
    }
}
