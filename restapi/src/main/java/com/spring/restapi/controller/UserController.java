package com.spring.restapi.controller;


import com.spring.restapi.User;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
public class UserController {

    Map<String, User> users=new HashMap<String, User>();

    @PostMapping("/user")
    public void addUser(@RequestBody User user){
        users.put(user.getEmail(), user);
    }

    @GetMapping("/user")
    public List<User> getUsers(){
        return new ArrayList<User>(users.values());
    }

    @GetMapping("/user/{email}")
    public User getUser(@PathVariable String email){
        return users.get(email);
    }

    @PutMapping("/user/{email}")
    public void updateUser(@PathVariable String email, @RequestBody User user){
        users.put(email, user);
    }

    @DeleteMapping("/user/{email}")
    public void deleteUser(@PathVariable String email){
        users.remove(email);
    }
}