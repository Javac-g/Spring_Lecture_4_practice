package com.company.V1.Configuration;

import com.company.V1.Controllers.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {


    @Bean("Controller")
    public Controller controller(){
        return new Controller();
    }
}
