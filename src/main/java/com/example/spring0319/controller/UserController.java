package com.example.spring0319.controller;

import com.example.spring0319.entiry.User;
import com.example.spring0319.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/user")
public class UserController {
    @Autowired
    private UserRepository userRepository;

    @PostMapping("")
    public String addUser(@RequestParam String name, @RequestParam String email) {
        User n = new User();
        n.setName(name);
        n.setEmail(email);
        userRepository.save(n);
        return "Saved: " + n.getId();
    }

    @GetMapping("")
    public Iterable<User> getAll() {
        return userRepository.findAll();
    }

}
