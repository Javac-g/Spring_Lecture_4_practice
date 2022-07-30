package com.company.Services;

import org.springframework.stereotype.Service;

@Service(value = "Service_A")

public class Service_A {

    private String one;

    public String getOne(){
        return one;
    }
}
