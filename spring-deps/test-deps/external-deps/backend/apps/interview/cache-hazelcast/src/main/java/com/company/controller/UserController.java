package com.company.controller;

import com.company.model.User;
import com.company.service.UserService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/cache-api")
public class UserController {

    private final UserService userService;

    public UserController(final UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/getAllUsers")
    public List<User> getAllUsers() {
        return userService.getUsers();
    }

    @GetMapping("/getUserById/{id}")
    public User getUser(@PathVariable int id) {
        return userService.getUser(id);
    }

    @DeleteMapping("/deleteUser/{id}")
    public String deleteUser(@PathVariable int id) {
        return userService.delete(id);
    }

}