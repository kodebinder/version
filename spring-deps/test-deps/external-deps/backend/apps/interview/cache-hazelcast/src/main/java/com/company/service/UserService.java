package com.company.service;

import com.company.dao.UserRepository;
import com.company.model.User;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    private UserRepository userRepository;

    public UserService(final UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Cacheable(cacheNames = {"userCache"})
    public List<User> getUsers() {
        System.out.println("Hit DB 1st time in getUsers()");
        return userRepository.findAll();
    }

    @Cacheable(value = "userCache", key = "#id", unless = "#result==null")
    public User getUser(int id) {
        System.out.println("Hit DB 1st time in getUser()");
        return userRepository.findById(id).get();
    }

    @CacheEvict(value = "userCache")
    public String delete(int id) {
        userRepository.deleteById(id);
        return "User deleted with id " + id;
    }

}