package com.company.V5.Controllers;

import com.company.V5.Model.UserEntity;
import com.company.V5.Services.ServiceAimpl;
import com.company.V5.Services.ServiceImpl;
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

@RequestMapping("/Main")
public class Controller {

    @Autowired
    private ApplicationContext applicationContext;

    @Autowired
    private ServiceAimpl serviceAimpl;

    @Autowired
    private ServiceImpl B;

    @Autowired
    @Qualifier("Service_C")
    private ServiceImpl C;

    private static final Logger log = LoggerFactory.getLogger(Controller.class);

    @PostConstruct
    public void init(){
        log.info("PostConstruct call");
    }
    @PreDestroy
    public void destroy(){
        log.info("PreDestroy call");
    }
    @RequestMapping(value ="/shutdown",method = RequestMethod.GET,produces = MediaType.APPLICATION_JSON_VALUE)
    public void stop(){
        log.info("http://192.168.0.104:8090/Main/shutdown");
        ((ConfigurableApplicationContext)applicationContext).close();
    }
    @PostMapping(value = "/set",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public String setPerson(@RequestBody UserDTO userDTO){
        log.info("http://192.168.0.104:8090/Main/set");
        serviceAimpl.setData(userDTO);
        return "Was added: " + userDTO.getName();
    }
    @GetMapping(value = "/get",produces = MediaType.APPLICATION_JSON_VALUE)
    @ResponseBody
    public List<UserEntity> getAll(){
        log.info("http://192.168.0.104:8090/Main/get");
        return serviceAimpl.getData();
    }
    public String server(){
        log.info("http://192.168.0.104:8090/Main/Server");
        log.info("B: " + B);
        log.info("C: " + C);
        return "\n" + B.getOne() + "\n" + C.getOne();
    }
}
