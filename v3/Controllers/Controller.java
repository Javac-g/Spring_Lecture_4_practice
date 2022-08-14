package com.company.v3.Controllers;

import com.company.v3.Services.MyServiceImpl;
import com.company.v3.Services.Service_A;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Three")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    @Qualifier("Service_A")
    private MyServiceImpl A;

    @Qualifier("Service_B")
    @Autowired
    private MyServiceImpl B;


    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String server(){
        logger.info("https://192.168.0.104:8090/Three/Server");
        logger.info("A: " + A);
        logger.info("B: " + B);

        return "\n" + A.getOne() + "\n" + B.getOne();
    }

}
