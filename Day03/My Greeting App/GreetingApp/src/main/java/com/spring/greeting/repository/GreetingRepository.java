package com.spring.greeting.repository;

import com.spring.greeting.model.Greeting;
import org.springframework.stereotype.Repository;

import java.util.*;

@Repository
public class GreetingRepository {
    private Map<Long, Greeting> greetingMap = new HashMap<>();
    private Long currentId = 1L;

    public Greeting save(Greeting greeting) {
        if (greeting.getId() == null) {
            greeting.setId(currentId++);
        }
        greetingMap.put(greeting.getId(), greeting);
        return greeting;
    }

    public Greeting findById(Long id) {
        return greetingMap.get(id);
    }

    public List<Greeting> findAll() {
        return new ArrayList<>(greetingMap.values());
    }

    public Greeting update(Long id, String newMessage) {
        Greeting greeting = greetingMap.get(id);
        if (greeting != null) {
            greeting.setMessage(newMessage);
        }
        return greeting;
    }

    public boolean delete(Long id) {
        return greetingMap.remove(id) != null;
    }
}