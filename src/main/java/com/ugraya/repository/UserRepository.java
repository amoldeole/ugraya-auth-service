package com.ugraya.repository;

import org.springframework.data.repository.CrudRepository;

import com.ugraya.entities.UserDao;
public interface UserRepository extends CrudRepository<UserDao, Integer> {
    UserDao findByUsername(String username);
}
