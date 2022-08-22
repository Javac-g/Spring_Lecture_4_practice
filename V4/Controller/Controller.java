package com.company.V4.Controller;

import com.company.V4.Model.UserEntity;
import com.company.V4.Services.MyService;
import com.company.V4.Services.ServiceImpl;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@RestController
@RequestMapping("/Main")
public class Controller {

    private static final Logger logger = LoggerFactory.getLogger(Controller.class);

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ServiceImpl A;

    @Autowired
    @Qualifier("Service_Three")
    private ServiceImpl B;

    @Autowired
    private MyService myService;

    @PostConstruct
    public void init(){
        logger.info("Post construct called");
    }
    @PreDestroy
    public void destroy(){
        logger.info("http://192.168.0.104:8090/Main");
        logger.info("A: " + A);
        logger.info("B: " + B);
        logger.info("\n" + A.getOne() + "\n" + B.getOne());
        logger.info("Pre destroy called");
    }

    @RequestMapping(value = "/shutdown",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    private String stop(){
        ((ConfigurableApplicationContext)applicationContext).close();
        return "Application stopped";

    }
    @GetMapping(value = "/server",produces = MediaType.APPLICATION_JSON_VALUE)
    public String serv(){
        logger.info("http://192.168.0.104:8090/Main");
        logger.info("A: " + A);
        logger.info("B: " + B);
        return "\n" + A.getOne() + "\n" + B.getOne();
    }
    @PostMapping(value = "/set",produces = MediaType.APPLICATION_JSON_VALUE)
    public void setData(@RequestBody UserDTO user){
        myService.setData(user);
        logger.info("Added new user");
    }
    @GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    public List<UserEntity> getData(){
        logger.info("database been reached");
        return myService.getData();
    }




}
