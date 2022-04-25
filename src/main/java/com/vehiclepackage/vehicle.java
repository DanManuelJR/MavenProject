package com.vehiclepackage;

public class vehicle{

    private int numOfWheels;
    private String engine;

    // activity 2
    private double gas;
    private double gasConsumption;
    private String vehicleName;


    public vehicle(int numOfWheels, String engine, double gas, double gasConsumption, String vehicleName){
        this.numOfWheels = numOfWheels;
        this.engine = engine;
        this.gas = gas;
        this.gasConsumption = gasConsumption;
        this.vehicleName = vehicleName;
    }

    public vehicle(int numOfWheels, String engine) {
        this.numOfWheels = numOfWheels;
        this.engine = engine;
    }

    public double getGas() {
        return gas;
    }

    public void setGas(double gas) {
        this.gas = gas;
    }

    public double getGasConsumption() {
        return gasConsumption;
    }

    public void setGasConsumption(double gasConsumption) {
        this.gasConsumption = gasConsumption;
    }

    public String getVehicleName() {
        return vehicleName;
    }

    public void setVehicleName(String vehicleName) {
        this.vehicleName = vehicleName;
    }

    public int getNumOfWheels() {
        return numOfWheels;
    }

    public void setNumOfWheels(int numOfWheels) {
        this.numOfWheels = numOfWheels;
    }

    public String getEngine() {
        return engine;
    }

    public void setEngine(String engine) {
        this.engine = engine;
    }
    

}   