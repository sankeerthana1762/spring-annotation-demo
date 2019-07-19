package com.stackroute.domain;

import org.springframework.beans.factory.annotation.Value;

public class Movie {
    private Actor actor;
    //Movie class with setter method

    public Movie() {
    }

    public Movie(Actor actor) {
        this.actor = actor;
    }

    public void display()
    {
        System.out.println("Actor Name: "+actor.getName()+" Gender: "+actor.getGender()+" Age: "+actor.getAge() );
    }

}
