package com.spring.greeting.controller;

import com.spring.greeting.model.Greeting;
import com.spring.greeting.service.GreetingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/greeting")
public class GreetingController {

    @Autowired
    private GreetingService service;

    @PostMapping
    public Greeting createGreeting(@RequestParam(required = false) String firstName,
                                   @RequestParam(required = false) String lastName) {
        return service.createGreeting(firstName, lastName);
    }

    @GetMapping("/{id}")
    public Greeting getGreeting(@PathVariable Long id) {
        return service.findGreeting(id);
    }

    @GetMapping
    public List<Greeting> listGreetings() {
        return service.getAllGreetings();
    }

    @PutMapping("/{id}")
    public Greeting updateGreeting(@PathVariable Long id, @RequestBody String newMessage) {
        return service.updateGreeting(id, newMessage);
    }

    @DeleteMapping("/{id}")
    public String deleteGreeting(@PathVariable Long id) {
        return service.deleteGreeting(id) ? "Deleted" : "Not Found";
    }
}