package com.company.v3.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service("Service_A")
public class Service_A {
    @Value("${prop.E}")
    private String one;

    public String getOne(){
        return one;
    }

}
