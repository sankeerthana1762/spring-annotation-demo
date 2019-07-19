
package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
  //Actor class with getters and constructor methods
    @Value("prabhas")
    private String name;

    @Value("male")
    private String gender;

    @Value("37")
    private int age;

    public Actor(String name, String gender, int age) {
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public String getGender() {
        return gender;
    }

    public int getAge() {
        return age;
    }
}
