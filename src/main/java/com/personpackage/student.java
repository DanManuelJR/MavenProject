package com.personpackage;

public class student extends person {

    private String year;

    public student(String name, String lastName, int age, String location, String year) {
        super(name, lastName, age, location);
        this.year = year;
        //TODO Auto-generated constructor stub
    }

    public student(String name, String lastName, int age, String year) {
        super(name, lastName, age);
        this.year = year;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }    
    
}
