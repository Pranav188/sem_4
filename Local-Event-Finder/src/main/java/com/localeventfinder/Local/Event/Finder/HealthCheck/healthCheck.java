package com.localeventfinder.Local.Event.Finder.HealthCheck;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class healthCheck {
    @GetMapping("/HealthCheck")
    public String health() {
        return "In great health!";
    }
}