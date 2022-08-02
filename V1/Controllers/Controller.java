package com.company.V1.Controllers;

import com.company.V1.Services.myService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/Main")
public class Controller { 
    
    private static final Logger logger = LoggerFactory.getLogger(Controller.class);
    
    @Autowired
   @Qualifier("Service_A")
   private myService A;
   @Autowired
   @Qualifier("Service_B")
   private myService B;
   
   @RequestMapping(value = "/S",method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
   @ResponseBody
   public String server(){
       logger.info("https://192.168.0.104:8080/Main/S");
       logger.info("A: " + A);
       logger.info("B: " + B);
       return A.getOne() + "\n" + B.getOne();
   }
}
