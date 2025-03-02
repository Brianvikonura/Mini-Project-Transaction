package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.repository.AccountsRepository;
import com.example.demo.repository.TransaksiRepository;
import com.example.demo.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    @Autowired
    UserRepository userRepository;

    @Autowired
    AccountsRepository accountsRepository;

    @Autowired
    TransaksiRepository transaksiRepository;

    public User createUser(User request) {
        User response = request;

        userRepository.save(response);

        return response;
    }

    public User getUser(String param) {
        User response = new User();

        response = userRepository.findById(Integer.valueOf(param)).get();

        return response;
    }
}
