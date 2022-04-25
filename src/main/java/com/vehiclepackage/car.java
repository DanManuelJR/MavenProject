package com.vehiclepackage;

public class car extends vehicle {

    private int storageCapacity;

    public car(int numOfWheels, String engine, double gas, double gasConsumption, String vehicleName, int storageCapacity) {
        super(numOfWheels, engine, gas, gasConsumption, vehicleName);
        this.storageCapacity = storageCapacity;
        //TODO Auto-generated constructor stub
    }

    public car(int numOfWheels, String engine, int storageCapacity) {
        super(numOfWheels, engine);
        this.storageCapacity = storageCapacity;
    }

    public int getStorageCapacity() {
        return storageCapacity;
    }

    public void setStorageCapacity(int storageCapacity) {
        this.storageCapacity = storageCapacity;
    }

    
    
}
