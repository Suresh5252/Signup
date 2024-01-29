package com.miniproject.demo.controller;

import com.fasterxml.jackson.databind.util.JSONPObject;
import com.miniproject.demo.Repo.UsersRepo;
import com.miniproject.demo.Service.UserService;
import com.miniproject.demo.entity.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

@RestController
public class UserController {
    @Autowired
    private UserService userService;
@PostMapping("/signup")
    public Users postSignup(@RequestBody Users users){

    return userService.saveSignup(users);
       //Users users1 = usersRepo.save(users);
       // return  new ResponseEntity(users1, HttpStatus.OK);
    }

    @PostMapping("/login")
    public
}
