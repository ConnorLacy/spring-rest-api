package com.springtester.playground.controller;

// import com.springtester.playground.repository.LoginRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController{
    // @Autowired
    // LoginRepository loginRepository;

    @GetMapping("/login")
    public String index(){
        return "You made it to the login controller";
    }
}