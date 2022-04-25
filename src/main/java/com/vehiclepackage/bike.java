package com.vehiclepackage;

public class bike extends vehicle {

    private int wheeliePower;

    public bike(int numOfWheels, String engine, double gas, double gasConsumption, String vehicleName, int wheeliePower) {
        super(numOfWheels, engine, gas, gasConsumption, vehicleName);
        this.wheeliePower = wheeliePower;
    }


    public bike(int numOfWheels, String engine, int wheeliePower) {
        super(numOfWheels, engine);
        this.wheeliePower = wheeliePower;
        //TODO Auto-generated constructor stub
    }

    public int getWheeliePower() {
        return wheeliePower;
    }

    public void setWheeliePower(int wheeliePower) {
        this.wheeliePower = wheeliePower;
    }
    
}
