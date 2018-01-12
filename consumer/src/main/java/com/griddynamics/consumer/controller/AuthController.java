package com.griddynamics.producer.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("api/users")
public class AuthController {

   /* private final AuthService authService;

    @Autowired
    public AuthController(AuthService authService) {
        this.authService = authService;
    }

    @GetMapping(value = "/")
    public List<User> getAll() {
        return authService.findAll();
    }

    @GetMapping(value = "/{id}")
    public User getOne(@PathVariable UUID id) {
        return authService.findOne(id);
    }

    @PostMapping(value = "/")
    public User create(@RequestBody User product) {
        return authService.save(product);
    }

    @PutMapping(value = "/{id}")
    public User update(@PathVariable UUID id, @RequestBody User product) {
        return authService.update(id, product);
    }

    @DeleteMapping(value = "/{id}")
    public void delete(@PathVariable UUID id) {
        authService.delete(id);
    }*/

}
