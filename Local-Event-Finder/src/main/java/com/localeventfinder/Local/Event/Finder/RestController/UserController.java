package com.localeventfinder.Local.Event.Finder.RestController;


import com.localeventfinder.Local.Event.Finder.Entity.User;
import com.localeventfinder.Local.Event.Finder.Entity.Variables;
import com.localeventfinder.Local.Event.Finder.Services.User_services;
import com.localeventfinder.Local.Event.Finder.Services.services;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    private User_services userservices;

    @GetMapping
    public ResponseEntity<?> getAll() {
        List<User> list = userservices.getAll();
        if(list != null) {
            return new ResponseEntity<>(list, HttpStatus.OK);
        }
        return new ResponseEntity<>("No user available", HttpStatus.NOT_FOUND);
    }

    @PostMapping
    public ResponseEntity<User> saveUser(@RequestBody User user) {
        if(user != null) {
            userservices.saveUser(user);
            return new ResponseEntity<>(user, HttpStatus.OK);
        }
        return new ResponseEntity<>(user, HttpStatus.NOT_ACCEPTABLE);
    }

    @PutMapping("/{username}")
    public ResponseEntity<User> update(@RequestBody User user, @PathVariable String username) {
        User old = userservices.findByuserName(username);
        if(old != null) {
            old.setUsername(user.getUsername());
            old.setPassword(user.getPassword());
            userservices.saveUser(old);
            return new ResponseEntity<>(old, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}