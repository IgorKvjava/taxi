
package ua.kvelinskyi.taxistation;

import java.util.Random;
import ua.kvelinskyi.taxistation.cars.BMW;
import ua.kvelinskyi.taxistation.cars.Opel;

public class TaxiStation {
    
    private int numberCars;
    BMW[] bmw;
    Opel[] opel;
    private Random r;

    public TaxiStation(int numberCars) {
        this.numberCars = numberCars;
    }
    
    public void createTaxiStation(){
        int numberCars = this.numberCars<<1;
        bmw = new BMW[numberCars];
        opel = new Opel[numberCars];
        String opelModel = "passat";
        String bmwModel = "M5";
        int speed = 0;
        double fuelConsumption = 0;
        double price = 0;
        r= new Random();
        for (int i = 0; i < numberCars; i++) {
            speed = 150 + r.nextInt(100);
            //System.out.println("speed "+speed);
            fuelConsumption = 12 + r.nextDouble()*10;
            price = 8000 + r.nextDouble()*1000;
            bmw [i] = new BMW(bmwModel, speed, fuelConsumption, price);
            //System.out.println("speed "+bmw [i]);
            speed = 100 + r.nextInt(100);
            fuelConsumption = 8 + r.nextDouble()*10;
            price = 6000 + r.nextDouble()*500;
            opel[i] = new Opel(opelModel, speed, fuelConsumption, price);
        }
    }
    
    public void printTaxiStation(){
        int index = numberCars/2;
        for (int i = 0; i < index; i++) {
            System.out.println(bmw[i]+"\n"+opel[i]);
        }
    }
}