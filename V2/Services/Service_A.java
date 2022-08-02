package com.company.V2.Services;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service(value = "Service_A")
public class Service_A {
    @Value("${prop.D}")
    private String one;

}
