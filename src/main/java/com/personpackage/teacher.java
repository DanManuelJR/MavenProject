package com.personpackage;

public class teacher extends person  {

    private String degreeLevel;

    public teacher(String name, String lastName, int age, String location, String degreeLevel) {
        super(name, lastName, age, location);
        this.degreeLevel = degreeLevel;

        //TODO Auto-generated constructor stub
    }

    public teacher(String name, String lastname, int age, String degreelevel) {
        super(name, lastname, age);
        this.degreeLevel = degreelevel;
    }

    public String getDegreeLevel() {
        return degreeLevel;
    }

    public void setDegreeLevel(String degreeLevel) {
        this.degreeLevel = degreeLevel;
    }
    
}
