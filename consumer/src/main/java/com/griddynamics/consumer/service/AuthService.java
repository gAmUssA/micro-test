package com.griddynamics.producer.service;

import com.griddynamics.producer.domain.User;

import java.util.List;
import java.util.UUID;

public interface AuthService {

    User save(User product);

    User update(UUID id, User product);

    User findOne(UUID id);

    List<User> findAll();

    void delete(UUID id);

}
