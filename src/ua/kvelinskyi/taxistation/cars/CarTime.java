
package ua.kvelinskyi.taxistation.cars;

public class CarTime {
    
    static private int counter = 0;
    private final int id;
    private final String colour;
    private final String model;
    private final int speed;
    private int fuelConsumption;
    private double price;

    public CarTime(String colour, String model, int speed, int fuelConsumption, double price) {
        this.id = counter++;
        this.colour = colour;
        this.model = model;
        this.speed = speed;
        this.fuelConsumption = fuelConsumption;
        this.price = price;
    }

    public double getPrice() {
        return price;
    }

    public int getFuelConsumption() {
        return fuelConsumption;
    }

    public int getSpeed() {
        return speed;
    }

    public String getColour() {
        return colour;
    }

    public String getModel() {
        return model;
    }

    public int getId() {
        return id;
    }
    
        
    
}
