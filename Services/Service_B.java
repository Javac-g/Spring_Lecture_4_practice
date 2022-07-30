package com.company.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "Service_B")
public class Service_B implements myService {
    @Value("${prop.C}")
    private String one;
    @Override
    public String getOne(){
        return one;
    }

}
