package com.localeventfinder.Local.Event.Finder.Services;

import com.localeventfinder.Local.Event.Finder.Entity.Variables;
import com.localeventfinder.Local.Event.Finder.Repository.localEventFinder_Repo;
import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class services {
    @Autowired
    private localEventFinder_Repo repo;

    public void saveEntry(Variables var) {
        repo.save(var);
    }

    public List<Variables> getAll() {
        return repo.findAll();
    }

    public Optional<Variables> findById(ObjectId id) {
        return repo.findById(id);
    }

    public Optional<Variables> deleteById(ObjectId id) {
        Optional<Variables> var = repo.findById(id);
        repo.deleteById(id);
        return var;
    }
}
