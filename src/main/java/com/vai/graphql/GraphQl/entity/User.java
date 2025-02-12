package com.vai.graphql.GraphQl.entity;

import java.util.List;

public class User {
    private Long id;
    private String name;
    private String email;
    private List<Post> posts;

    public User(Long id, String name, String email, List<Post> posts) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.posts = posts;
    }

    public Long getId() { return id; }
    public String getName() { return name; }
    public String getEmail() { return email; }
    public List<Post> getPosts() { return posts; }
}
