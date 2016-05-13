
package ua.kvelinskyi.taxistation;

import java.util.Random;
import java.util.Scanner;

public class MainTaxiStation {
    static Random r = new Random();
    static int numberCars;
    static int menuId;
    public static void main(String[] args) { 
                      
        numberCars =  1+r.nextInt(10);
        Scanner in = new Scanner(System.in);
        menuId = in.nextInt();
        TaxiStation taxiStation = new TaxiStation(numberCars);
        taxiStation.createTaxiStation();
        taxiStation.printTaxiStation();
        // TODO code application logic here
    }
    
}
