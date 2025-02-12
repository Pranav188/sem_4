package com.localeventfinder.Local.Event.Finder.Repository;

import com.localeventfinder.Local.Event.Finder.Entity.Variables;

import org.bson.types.ObjectId;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface localEventFinder_Repo extends MongoRepository<Variables, ObjectId> {
}
