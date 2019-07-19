package com.stackroute.domain;

public class Movie {
    //movie class with setter methods
    private Actor actor;

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
