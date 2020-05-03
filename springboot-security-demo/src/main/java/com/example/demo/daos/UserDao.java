package com.example.demo.daos;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entities.UserEntity;

public interface UserDao  extends CrudRepository<UserEntity, String>{

}
