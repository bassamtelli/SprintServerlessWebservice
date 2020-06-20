package com.example.demo.userservice.controler;

import com.example.demo.userservice.model.User;
import com.example.demo.userservice.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserRepository repository;

    @GetMapping(value="/findByEmail")
    public User getUserByEmail(@RequestParam String email) {
        return repository.findByEmail(email);
    }

    @GetMapping(value="/findByFirstname")
    public User getUserByFirstname(@RequestParam String firstname) {
        return repository.findByFirstname(firstname);
    }
    @GetMapping(value="/findByLastname")
    public User getUserByLastname(@RequestParam String lastname) {
        return repository.findByLastname(lastname);
    }
}