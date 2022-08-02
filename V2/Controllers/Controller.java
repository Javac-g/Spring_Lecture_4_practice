package com.company.V2.Controllers;

import com.company.V2.Services.MyService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Main")
public class Controller {

    @Autowired
    @Qualifier("Service_A")
    private MyService A;

    @Autowired
    @Qualifier("Service_B")
    private MyService B;

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @GetMapping(value = "/S",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String service(){
        logger.info("https://192.168.0.104:8090/Main/S");
        logger.info("A: " + A);
        logger.info("B: " + B);

        return "\nA: " + A.getOne() + "\nB: " + B.getOne();

    }



}
