package com.example;

import com.personpackage.*;
import com.vehiclepackage.*;

public final class App {
    private App() {
    }

    public static void main(String[] args) {

        student juan = new student("Juan", "Dos", 13, "First year");
        teacher pedro = new teacher("Pedro", "Domas", 26, "Masters degree");

        introduction(juan.getName(), juan.getLastName(), juan.getAge(), juan.getYear(), "First Year");
        introduction(pedro.getName(), pedro.getLastName(), pedro.getAge(), pedro.getDegreeLevel(), "Masters Degree");

        car Lamborghini = new car(4, "5.2-litre naturally aspirated Audi/Lamborghini V10 ", 4);
        bike crf450r = new bike(2, "Single cylinder, four-stroke motor",73);

        displaySpecs("Lamborghini Huracan", Lamborghini.getNumOfWheels(), Lamborghini.getEngine(), "Storage capacity", Lamborghini.getStorageCapacity());
        displaySpecs("crf450r", crf450r.getNumOfWheels(), crf450r.getEngine(), "Wheelie power", crf450r.getWheeliePower());

    //  activity 2

    teacher john = new teacher("John", "Fernando", 26, "Talamban", "Masters Degree");
    car    Lambo = new car(4, "5.2-litre naturally aspirated Audi/Lamborghini V10", 100, 26.03, "Lamborghini Huracan", 4);
    System.out.println("Gas before making the trip: " + Lambo.getGas());
    john.travel(Lambo);
    System.out.println("Gas after making the trip, if the trip was made: " + Lambo.getGas());

    }
    

    public static void introduction(String name, String lastName, int age, String customString, String title) {
        String introduction = "Hi! I am " + name + " " + lastName + ". I am " + age + " years old ";
        String customIntroduction = "";
        switch(title.toLowerCase()){
            case "student":
                customIntroduction = "and I am a " + customString.toLowerCase() + " " + title + ".";
                break;
            case "teacher":
                customIntroduction = "and I am a " + title + " having a " + customString.toLowerCase() + ".";
                break;
            default:
                System.out.println("You entered an invalid title.");
        }
        System.out.println(introduction + " " + customIntroduction);    

        }
        public static void displaySpecs(String vehicle, int numOfWheels, String engine, String customKey, int customValue) {
            System.out.println("-----------------------------------------");
            System.out.println("The all new " + vehicle + " specs...");
            System.out.println("Number of wheels: " + numOfWheels);
            System.out.println("Engine: " + engine);
            System.out.println(customKey + ": " + customValue);
            System.out.println("------------------------------------------");
    }
}
