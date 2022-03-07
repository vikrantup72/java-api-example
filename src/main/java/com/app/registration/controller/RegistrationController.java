package com.app.registration.controller;

import com.app.registration.model.User;
import com.app.registration.service.RegistrationService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegistrationController {
    @Autowired
    private RegistrationService  service;

    @PostMapping("/register")
    public User registerUser(@RequestBody User user) throws Exception{
        String tempEmailId = user.getEmailId();
        if(tempEmailId != null && !"".equals(tempEmailId)){
            User userobj = service.fetchUserByEmailId(tempEmailId);
            if(userobj != null){
                throw new Exception("User with "+tempEmailId+" is already exist");
            }
        }
        User userobj = null;
        userobj = service.saveUser(user);
        return userobj;
    }

    
    @PostMapping("/login")
    public User loginUser(@RequestBody User user) throws Exception{
           String tempEmailId = user.getEmailId();
           String tempPass = user.getPassword();
           User userobj = null;
           if(tempEmailId != null && tempPass != null){
            userobj =  service.fetchUserByEmailIdAndPassword(tempEmailId, tempPass);
           }
           if(userobj == null){
               throw new Exception("Bad Credential");
           }
           return userobj;
    }

}
