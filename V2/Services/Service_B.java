package com.company.V2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "Service_B")
public class Service_B implements MyService {

    @Value("${prop.E}")
    private String one;

    @Override
    public String getOne(){
        return one;
    }


}
