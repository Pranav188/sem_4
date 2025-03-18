package com.localeventfinder.Local.Event.Finder.Services;

import com.localeventfinder.Local.Event.Finder.Entity.User;
import com.localeventfinder.Local.Event.Finder.Repository.userRepo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class User_services {
    @Autowired
    private userRepo repo;
    public List<User> getAll() {
        return repo.findAll();
    }

    public void saveUser(User user) {
        repo.save(user);
    }

    public Optional<User> findById(ObjectId id) {
        return repo.findById(id);
    }

    public void deleteById(ObjectId id) {
        repo.deleteById(id);
    }

    public User findByuserName(String username) {
        return repo.findByusername(username);
    }
}
