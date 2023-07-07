package com.company.service;

import com.company.entity.User;
import com.company.exception.UserNotFoundException;
import com.company.repository.UserRepository;
import com.company.request.UserRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Objects;

@Service
@Slf4j
public class UserService {

    private UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User saveUser(UserRequest userRequest) {
        User user = User.builder()
                .userId(0)
                .name(userRequest.getName())
                .email(userRequest.getEmail())
                .mobile(userRequest.getMobile())
                .gender(userRequest.getGender())
                .age(userRequest.getAge())
                .nationality(userRequest.getNationality())
                .build();
        return userRepository.save(user);
    }

    public List<User> getAllUsers() {
        return userRepository.findAll();
    }

    public User getUser(long userId) throws UserNotFoundException {
        User userFromDatabase = userRepository.findByUserId(userId);
        if (Objects.isNull(userFromDatabase)) {
            throw new UserNotFoundException("User not found with id: " + userId);
        }
        return userFromDatabase;
    }
}
