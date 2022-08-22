package com.company.V4.Services;

import com.company.V4.Controller.UserDTO;
import com.company.V4.Model.UserEntity;
import com.company.V4.Repository.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("Service_One")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_One implements MyService {
    @Autowired
    private DataRepository dataRepository;

    @Override
    public void setData(UserDTO user){
        UserEntity userEntity = new UserEntity();
        userEntity.setId(user.getId());
        userEntity.setName(user.getName());
        userEntity.setSalary(user.getSalary());
        dataRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> getData(){

        return dataRepository.findAll();

    }
}
