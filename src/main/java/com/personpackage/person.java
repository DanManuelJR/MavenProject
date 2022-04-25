package com.personpackage;

import java.util.Scanner;
import com.vehiclepackage.*;

public class person {

    private String name;
    private String lastName;
    private int age;

    // activity 2
    private String location;
    private String travelVehicle = "";

    public person(String name, String lastName, int age, String location){
        this.name = name;
        this.lastName = lastName;
        this.age = age;
        this.location = location;
    }


    public person(String name, String lastName, int age){
        this.name = name;
        this.lastName = lastName;
        this.age = age;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
      return location;
    }


    public void setLocation(String location) {
      this.location = location;
    }


    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void travel(vehicle vehicle) {
        Scanner sc = new Scanner(System.in);
        System.out.println(this.name + " " + this.lastName + " is currently in " + this.location);
        System.out.println("Enter target destination: ");
        String destination = sc.nextLine();
        System.out.println("Enter estimated distance from " + this.location + " to " + destination);
        double distance = sc.nextDouble();
        this.location = destination;
        this.travelVehicle = vehicle.getVehicleName();
        double remainingGas = calculateRemainingGas(vehicle, distance);
        if (remainingGas > 0) {
          vehicle.setGas(remainingGas);
          System.out.println(this.name + " " + this.lastName + " travelled to " + this.location + " using " + this.travelVehicle);
        } else {
          System.out.println("Destination too far. Insufficient gas.");
        }
        sc.close();
      }
    
      public double calculateRemainingGas(vehicle vehicle, double distance) {
        double gasUsed = distance / vehicle.getGasConsumption();
        double remainingGas = 0;
        if (vehicle.getGas() > gasUsed) {
          remainingGas = vehicle.getGas() - gasUsed;
        }
        return remainingGas;
      }
    
}
