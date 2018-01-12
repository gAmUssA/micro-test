package com.griddynamics.producer.controller;

import com.griddynamics.producer.Producer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api")
public class AuthController {

    @Autowired
    private Producer producer;

    @GetMapping(value = "/")
    public void getAll() {
        producer.send("kafka_topic", "test");
    }

}
