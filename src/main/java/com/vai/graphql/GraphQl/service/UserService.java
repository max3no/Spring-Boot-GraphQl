package com.vai.graphql.GraphQl.service;

import com.vai.graphql.GraphQl.entity.Post;
import com.vai.graphql.GraphQl.entity.User;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private List<User> users = Arrays.asList(
            new User(1L, "John Doe", "john@example.com", Arrays.asList(
                    new Post(101L, "GraphQL Basics", "GraphQL is awesome!"),
                    new Post(102L, "Spring Boot with GraphQL", "Learn how to integrate GraphQL with Spring Boot.")
            )),
            new User(2L, "Jane Smith", "jane@example.com", Arrays.asList(
                    new Post(103L, "Understanding REST", "REST APIs are still widely used."),
                    new Post(104L, "GraphQL vs REST", "Key differences between GraphQL and REST.")
            ))
    );

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        return users.stream().filter(user -> user.getId().equals(id)).findFirst().orElse(null);
    }
}
