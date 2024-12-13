package com.src.springBootForBeginner.InterfaceAdapters.gateways;

import com.src.springBootForBeginner.applicationBusinessRules.dto.UserDTO;
import com.src.springBootForBeginner.applicationBusinessRules.mapper.UserMapper;
import com.src.springBootForBeginner.applicationBusinessRules.usecases.UserServices;
import com.src.springBootForBeginner.enterpriseBusinessRules.entities.User;
import com.src.springBootForBeginner.enterpriseBusinessRules.repositories.IUserRepository;
import jakarta.transaction.Transactional;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImpl implements UserServices {
    private final IUserRepository userRepository;

    public UserServiceImpl(IUserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> getAllUsers() {
        return this.userRepository.findAll();
    }

    @Override
    @Transactional
    public void addUser(UserDTO userDTO) {
        User user = UserMapper.toEntity(userDTO);
        this.userRepository.save(user);
    }
}