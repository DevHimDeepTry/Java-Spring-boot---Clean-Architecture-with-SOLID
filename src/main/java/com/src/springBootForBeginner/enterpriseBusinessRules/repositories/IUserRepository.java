package com.src.springBootForBeginner.enterpriseBusinessRules.repositories;

import com.src.springBootForBeginner.enterpriseBusinessRules.entities.User;
import java.util.Optional;

public interface IUserRepository extends IBaseRepository<User, Long> {
    Optional<User> findByUsername(String username);
}