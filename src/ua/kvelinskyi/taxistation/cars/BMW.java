
package ua.kvelinskyi.taxistation.cars;

public class BMW extends Car{
    
    private final String model;
    private final int speed;
    private double fuelConsumption;
    private double price;

    public BMW(String model, int speed, double fuelConsumption, double price) {
        this.model = model;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }    

    @Override
    public double getFuelConsumption() {
        return fuelConsumption;
    }

    @Override
    public double getPrice() {
        return price;
    }

    public String getModel() {
        return model;
    }
    
    @Override
    public int getSpeed() {
        return speed;
    }

    @Override
    public String toString() {
        return "BMW model " + model + " speed " + speed 
                +" fuelConsumption "+fuelConsumption+" price "+price;
    }
    
    
}
