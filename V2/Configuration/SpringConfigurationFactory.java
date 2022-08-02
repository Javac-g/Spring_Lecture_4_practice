package com.company.V2.Configuration;

import com.company.V2.Controllers.Controller;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SpringConfigurationFactory {

    @Bean(name = "Controller")
    public Controller controller(){

        return new Controller();
    }


}
