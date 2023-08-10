package com.example.practicemongo.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collation = "user")
public class User {
    private String name;
    private String address;
    private int age;

}
