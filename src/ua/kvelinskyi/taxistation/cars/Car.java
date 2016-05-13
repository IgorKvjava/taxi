
package ua.kvelinskyi.taxistation.cars;

public abstract class Car {
    
    public abstract double getFuelConsumption();
    public abstract double getPrice();
    public abstract int getSpeed();
    public abstract String getModel ();
    
    public static double priceCars(Car[] cars){        
        double sumPrice = 0;
        for (Car car : cars) {
            sumPrice +=car.getPrice();
        }
        return sumPrice;
    }
    
}
