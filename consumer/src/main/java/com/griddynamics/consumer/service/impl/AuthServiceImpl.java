package com.griddynamics.producer.service.impl;

import org.springframework.stereotype.Service;

@Service
public class AuthServiceImpl /*implements AuthService*/ {

    /*private static final Logger LOGGER = LoggerFactory.getLogger(AuthServiceImpl.class);

    private final UserRepository userRepository;

    @Autowired
    public AuthServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User save(User product) {
        LOGGER.info("Save user: {}", product);
        return userRepository.save(product);
    }

    @Override
    public User update(UUID id, User updated) {
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
    */

}
