package com.company.V5.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

@Service("Servise_B")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Servise_B {
    @Value("${prop.A}")
    private String one;

    public String getOne() {
        return one;
    }
}
