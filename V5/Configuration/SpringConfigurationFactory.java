package com.company.V5.Configuration;

import com.company.V5.Controllers.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean("Controller")
    public Controller controller(){
        return new Controller();
    }
}
