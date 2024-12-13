package com.src.springBootForBeginner.enterpriseBusinessRules.repositories;

import java.util.List;
import java.util.Optional;

public interface IBaseRepository<T, ID> {
    T save(T entity);
    void deleteById(ID id);
    Optional<T> findById(ID id);
    List<T> findAll();
}