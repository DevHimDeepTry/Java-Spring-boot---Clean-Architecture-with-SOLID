package com.src.springBootForBeginner.applicationBusinessRules.mapper;

import com.src.springBootForBeginner.applicationBusinessRules.dto.UserDTO;
import com.src.springBootForBeginner.enterpriseBusinessRules.entities.User;

public final class UserMapper {

    private UserMapper() {
        // Private constructor to prevent instantiation
    }

    public static UserDTO toDTO(User user) {
        return new UserDTO(user.getUsername(), user.getPassword());
    }

    public static User toEntity(UserDTO userDTO) {
        return new User(null, userDTO.getUsername(), userDTO.getPassword());
    }
}