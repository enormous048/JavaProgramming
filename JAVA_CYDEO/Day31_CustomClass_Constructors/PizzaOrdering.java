package Day31_CustomClass_Constructors;

import java.util.ArrayList;
import java.util.Arrays;

public class PizzaOrdering {
    public static void main(String[] args) {

        ArrayList<Pizza> allPizzas = new ArrayList<>();


        for (int i = 1; i <= 100; i++) {

            Pizza small = new Pizza("S", 2, 2);
            Pizza medium = new Pizza("M", 3, 4);
            Pizza large = new Pizza("L", 4, 4);

            allPizzas.addAll(Arrays.asList(small, medium, large));

            //все я поняв це те саме шо ти запихуєш постійно стрінг нейм1 наприклад
            //нейм існує один але в листі може бути стільки скільки захочеш копій
            //allPizzas.addAll(small, small, small)  типу для листа можуть і дублікати бути
        }
        System.out.println("total number of pizzas = "+allPizzas.size());

        int totalCost = 0;
        for (Pizza pizza : allPizzas) {
            totalCost += pizza.calcCost();
        }
        System.out.println("totalCost = " + totalCost);



    }
}
