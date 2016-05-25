package com.example.naveenkumark.testjava8;

import java.util.Optional;

/**
 * Created by naveenkumark on 4/20/16.
 */
public class Person {
    Person(String name, int age, int id){
        this.name = name;
        this.age = age;
        this.id = id;
    }
    private String name;
    private int age;
    public int id;
    private College college;

    College getCollege(){
        return college;
    }

    Person(){

    }

    public int getId() {
        return id;
    }

    public interface testInterface {
        int getId(Person p);
    }



    public class College{
        private Optional<String> mName;
        private Optional<String> mLocation;

        public Optional<String> getLocation() {
            return mLocation;
        }
    }
}
