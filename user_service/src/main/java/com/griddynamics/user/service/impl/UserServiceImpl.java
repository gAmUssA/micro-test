package com.griddynamics.user.service.impl;

import com.griddynamics.user.domain.User;
import com.griddynamics.user.repository.UserRepository;
import com.griddynamics.user.service.UserService;
import org.apache.commons.collections4.IteratorUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
public class UserServiceImpl implements UserService {

    private static final Logger LOGGER = LoggerFactory.getLogger(UserServiceImpl.class);

    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User product) {
        LOGGER.info("Save user: {}", product);
        return userRepository.save(product);
    }

    @Override
    public User update(UUID id, User updated) {
        LOGGER.info("Update user, id: {}, {}", id, updated);
        User product = userRepository.findOne(id);
        product.setFirstName(updated.getFirstName());
        product.setLastName(updated.getLastName());
        product.setEmail(updated.getEmail());
        return userRepository.save(product);
    }

    @Override
    public User findOne(UUID id) {
        LOGGER.info("Find user, id: {}", id);
        return userRepository.findOne(id);
    }

    @Override
    public List<User> findAll() {
        LOGGER.info("Find all users");
        Iterable<User> products = userRepository.findAll();
        return IteratorUtils.toList(products.iterator());
    }

    @Override
    public void delete(UUID id) {
        LOGGER.info("Delete user, id: {}", id);
        userRepository.delete(id);
    }

}
