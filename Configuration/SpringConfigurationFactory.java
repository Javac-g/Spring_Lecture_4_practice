package com.company.Configuration;

import com.company.Controllers.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {


    @Bean("Controller")
    public Controller controller(){
        return new Controller();
    }
}
