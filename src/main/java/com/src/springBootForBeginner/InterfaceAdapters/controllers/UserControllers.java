package com.src.springBootForBeginner.InterfaceAdapters.controllers;

import com.src.springBootForBeginner.applicationBusinessRules.constants.ApiResponseWithData;
import com.src.springBootForBeginner.applicationBusinessRules.constants.ApiResponseWithoutData;
import com.src.springBootForBeginner.applicationBusinessRules.constants.MessageApiResponse;
import com.src.springBootForBeginner.applicationBusinessRules.dto.UserDTO;
import com.src.springBootForBeginner.applicationBusinessRules.usecases.UserServices;
import com.src.springBootForBeginner.applicationBusinessRules.utils.ApiResponseUtil;
import com.src.springBootForBeginner.enterpriseBusinessRules.entities.User;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/users")
public class UserControllers {
    private final UserServices userServices;

    public UserControllers(UserServices userServices) {
        this.userServices = userServices;
    }

    @PostMapping
    public ResponseEntity<ApiResponseWithoutData> createUser(@RequestBody UserDTO userDTO) {
        userServices.addUser(userDTO);
        return ApiResponseUtil.createResponse(201, MessageApiResponse.CREATE_SUCCESS);
    }

    @GetMapping
    public ResponseEntity<ApiResponseWithData<List<User>>> getAllUsers() {
        List<User> users = userServices.getAllUsers();
        return ApiResponseUtil.createResponse(200,MessageApiResponse.READ_SUCCESS,users);
    }
}