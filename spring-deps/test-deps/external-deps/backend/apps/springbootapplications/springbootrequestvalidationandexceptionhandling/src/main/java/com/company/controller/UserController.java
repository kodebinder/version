package com.company.controller;

import com.company.entity.User;
import com.company.exception.UserNotFoundException;
import com.company.request.UserRequest;
import com.company.service.UserService;
import jakarta.validation.Valid;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/users")
@Slf4j
public class UserController {

    private final UserService userService;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    @PostMapping("/user")
    public ResponseEntity<User> saveUser(@RequestBody @Valid UserRequest userRequest) {
        return new ResponseEntity<>(userService.saveUser(userRequest), HttpStatus.CREATED);
    }

    @GetMapping
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok().body(userService.getAllUsers());
    }

    @GetMapping("/user/{userId}")
    public ResponseEntity<User> getUser(@PathVariable long userId) throws UserNotFoundException {
        return ResponseEntity.ok(userService.getUser(userId));
    }
}
