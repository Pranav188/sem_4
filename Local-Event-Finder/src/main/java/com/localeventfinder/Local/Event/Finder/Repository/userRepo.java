package com.localeventfinder.Local.Event.Finder.Repository;

import com.localeventfinder.Local.Event.Finder.Entity.User;
import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Component;

@Component
public interface userRepo extends MongoRepository<User, ObjectId> {
    User findByusername (String username);
}
