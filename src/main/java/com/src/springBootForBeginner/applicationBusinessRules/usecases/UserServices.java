package com.src.springBootForBeginner.applicationBusinessRules.usecases;

import com.src.springBootForBeginner.applicationBusinessRules.dto.UserDTO;
import com.src.springBootForBeginner.enterpriseBusinessRules.entities.User;

import java.util.List;

public interface UserServices {
    List<User> getAllUsers();
    void addUser(UserDTO userDTO);
}