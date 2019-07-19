
package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Actor {
//Actor class with getter methods
    @Value("prabhas")
    private String name;

    @Value("male")
    private String gender;

    @Value("37")
    private int age;

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
