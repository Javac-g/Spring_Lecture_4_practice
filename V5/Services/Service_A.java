package com.company.V5.Services;

import com.company.V5.Model.UserEntity;
import com.company.V5.Controllers.UserDTO;
import com.company.V5.Reposytory.DataRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Service;

import java.util.List;
@Service("Service_A")
@Scope(value = "prototype",proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Service_A implements ServiceAimpl {

    @Autowired
    private DataRepository dataRepository;

    @Override
    public void setData(UserDTO userDTO){
        UserEntity user = new UserEntity();
        user.setId(userDTO.getId());
        user.setName(userDTO.getName());
        user.setSalary(userDTO.getSalary());
        dataRepository.save(user);
    }

    @Override
    public List<UserEntity> getData() {

        return dataRepository.findAll();
    }
}
