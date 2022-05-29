package com.suzy.service;


import com.suzy.entity.User;
import com.suzy.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {

    @Autowired
    UserRepo userRepo;



    public User saveUser(User user){

        userRepo.save(user);
        return user;
    }


    public User signedInUser(String email, String password) {
        return userRepo.findByTheEmailAndPassword(email,password);
    }
}
