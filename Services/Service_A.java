package com.company.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "Service_A")

public class Service_A implements myService {
    @Value("${prop.A}")
    private String one;
    @Override
    public String getOne(){
        return one;
    }
}
