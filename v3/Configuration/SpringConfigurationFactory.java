package com.company.v3.Configuration;

import com.company.v3.Controllers.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean(name = "Controller")
    public Controller controllerBean(){
        return new Controller();
    }


}
