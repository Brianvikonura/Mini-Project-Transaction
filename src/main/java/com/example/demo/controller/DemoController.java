package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/v1")
public class DemoController {
    @Autowired
    UserService userService;

    @PostMapping("/createUser")
    public ResponseEntity<User> create (@RequestBody User request) {
        User response = request;

        response = userService.createUser(request);

        return ResponseEntity.ok(response);
    }

    @GetMapping("/getUser")
    public ResponseEntity<User> getUser (@RequestParam String param) {
        User response = new User();

        response = userService.getUser(param);

        return ResponseEntity.ok(response);
    }
}
