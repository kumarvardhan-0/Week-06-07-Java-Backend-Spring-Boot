package com.spring.greeting.service;

import com.spring.greeting.model.Greeting;
import com.spring.greeting.repository.GreetingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GreetingService {

    @Autowired
    private GreetingRepository repository;

    public Greeting createGreeting(String firstName, String lastName) {
        String message = "Hello";
        if (firstName != null && lastName != null) {
            message += " " + firstName + " " + lastName;
        } else if (firstName != null) {
            message += " " + firstName;
        } else if (lastName != null) {
            message += " " + lastName;
        } else {
            message += " World";
        }

        Greeting greeting = new Greeting(null, message);
        return repository.save(greeting);
    }

    public Greeting findGreeting(Long id) {
        return repository.findById(id);
    }

    public List<Greeting> getAllGreetings() {
        return repository.findAll();
    }

    public Greeting updateGreeting(Long id, String newMessage) {
        return repository.update(id, newMessage);
    }

    public boolean deleteGreeting(Long id) {
        return repository.delete(id);
    }
}