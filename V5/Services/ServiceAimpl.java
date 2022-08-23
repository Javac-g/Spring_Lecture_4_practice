package com.company.V5.Services;

import com.company.V5.Controllers.UserDTO;
import com.company.V5.Model.UserEntity;

import java.util.List;

public interface ServiceAimpl {
    void setData(UserDTO userDTO);
    List<UserEntity> getData();
}
