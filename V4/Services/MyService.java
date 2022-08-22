package com.company.V4.Services;

import com.company.V4.Controller.UserDTO;
import com.company.V4.Model.UserEntity;

import java.util.List;

public interface MyService {
    void setData(UserDTO user);
    List<UserEntity> getData();
}
