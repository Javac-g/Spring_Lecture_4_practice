package com.company.Services;

import org.springframework.stereotype.Service;

@Service(value = "Service_B")
public class Service_B {
    private String one;
    public String getOne(){
        return one;
    }

}
