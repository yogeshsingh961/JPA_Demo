package com.AkhandBharat.jpademo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {
@Autowired
    UserRepository userRepository;

    public String addUser(User user){
        userRepository.save(user);
        return "User added";
    }

}
