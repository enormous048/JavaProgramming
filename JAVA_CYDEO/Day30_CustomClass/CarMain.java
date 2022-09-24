package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class CarMain {
    public static void main(String[] args) {

        Car carObj = new Car();
        carObj.setInfo("BMW", "M3", "White", 1999, 20000);

        System.out.println(carObj);


        Car carObj2 = new Car();
        carObj2.setInfo("Audi", "TT", "Black", 2004, 12000);

        System.out.println(carObj2);


        //Car[] arr = {carObj, carObj2};
        ArrayList<Car> carsList = new ArrayList<>();
        carsList.addAll(Arrays.asList(carObj, carObj2));

        for (Car car : carsList) {
            System.out.println(car.brand +" "+ car.model);
        }

        ArrayList<Car> elligibleToRecall = new ArrayList<>();
        for (Car car : carsList) {
            if (car.year <= 2000){
                elligibleToRecall.add(car);
            }
        }
        System.out.println("elligibleToRecall = " + elligibleToRecall);



    }
}
