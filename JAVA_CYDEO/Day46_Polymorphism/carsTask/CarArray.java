package Day46_Polymorphism.carsTask;

import Day38_Inheritance_Overriding.*;

import java.util.ArrayList;
import java.util.Collections;

public class CarArray {

    public static void main(String[] args) {


        Car[] cars = {
                new Toyota("Highlander",  "White",2010,25000,  255000),
                new BMW("X5", "Red",2014, 32000,  12000),
                new Toyota("Corolla", "White",2011, 20000,  310000),
                new BMW("M3", "Blue",2015, 33000,  14030),
                new BMW("M5", "Black",2017, 35000,  15000),
                new BMW("M4", "White", 2018, 40000, 19000),
                new BMW("7 Series", "Purple",2009, 30000,  21000),
                new BMW("i3","Black", 2011,9000, 20000),
                new Toyota("Camry", "Red",2018, 30000,  185000),
                new Toyota("Rav4", "Red",2012, 23000,  285000),
                new Toyota("Avalon",  "Blue", 2019,35000, 175230),
                new Tesla("Model S", "White", 2018,54999,  16000),
                new Tesla("Model Y", "White", 2016,40000,  226000),
                new Tesla("Model 3", "White", 2012,42000,  236000),
                new Tesla("Model X", "White", 2015,48000,  406000),
        };

        ArrayList<Car> availableToRecall = new ArrayList<>(); //Тут в іфках не кастимо бо всі тесли і бмв імплиситлі кастяться до Кар клас еррею
        for (Car car : cars) {
            if (car instanceof Toyota && (car.year >= 2010 && car.year<=2011)){
                availableToRecall.add(car);
            }else if (car instanceof Tesla && (car.year >= 2015 && car.year<=2016)){
                availableToRecall.add(car);
            } else if (car instanceof BMW && (car.year >= 1929 && car.year<=2022)){
                availableToRecall.add(car);
            }
        }
        for (Car car : availableToRecall) {
            System.out.println(car);
        }



        int max = cars[0].miles;
        Car maxCar = null;
        for (Car car : cars) {
            if (car.miles>max){
                max=car.miles;
                maxCar = car;
            }
        }
        System.out.println(max + " " +maxCar);

        int min = cars[0].miles;
        Car minCar = null;
        for (Car car : cars) {
            if (car.miles<min){
                min=car.miles;
                minCar = car;
            }
        }
        System.out.println(min + " " +minCar);


    }
}
