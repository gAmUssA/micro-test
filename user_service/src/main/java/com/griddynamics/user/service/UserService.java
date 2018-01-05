package com.griddynamics.user.service;

import com.griddynamics.user.domain.User;

import java.util.List;
import java.util.UUID;

public interface UserService {

    User save(User product);

    User update(UUID id, User product);

    User findOne(UUID id);

    List<User> findAll();

    void delete(UUID id);

}
