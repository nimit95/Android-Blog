package com.nimit.recyclerviewdemo;

/**
 * Created by nimit on 13/1/18.
 */
public class Course {
    private String name, instructor;
    private int batchStrength;

    public Course(String name, String instructor, int batchStrength) {
        this.name = name;
        this.instructor = instructor;
        this.batchStrength = batchStrength;
    }

    public String getName() {
        return name;
    }

    public String getInstructor() {
        return instructor;
    }

    public int getBatchStrength() {
        return batchStrength;
    }
}