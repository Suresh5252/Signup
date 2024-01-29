package com.miniproject.demo.Service;

import com.miniproject.demo.Repo.UsersRepo;
import com.miniproject.demo.entity.Users;
import org.apache.catalina.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class UserService {
@Autowired
private UsersRepo usersRepo;

public Users saveSignup(Users user) {

    return usersRepo.save(user);
}
}
