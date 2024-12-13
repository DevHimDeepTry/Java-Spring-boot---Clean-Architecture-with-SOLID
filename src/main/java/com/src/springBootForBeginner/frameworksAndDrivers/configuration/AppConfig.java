package com.src.springBootForBeginner.frameworksAndDrivers.configuration;

import com.src.springBootForBeginner.applicationBusinessRules.usecases.UserServices;
import com.src.springBootForBeginner.InterfaceAdapters.gateways.UserServiceImpl;
import com.src.springBootForBeginner.enterpriseBusinessRules.repositories.IUserRepository;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public UserServices userServices(IUserRepository userRepository) {
        return new UserServiceImpl(userRepository);
    }
}