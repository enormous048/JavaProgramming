package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;

public class FirstUnique {

    public static void main(String[] args) {

        ArrayList < Integer > num = new ArrayList<>();
        num.add(10);
        num.add(10);
        num.add(2);
        num.add(8);
        num.add(3);
        num.add(3);

        for (Integer i : num) {

            int frequecy = 0;
            for (Integer j : num) { //порівнюєм зафіксований з усіма, якшо співпадає то фріквенсі збільшується на один
                if (i == j){
                    frequecy++;
                }
            }

            if (frequecy == 1){
                System.out.println("First unique element = " + i);
                break;
            }
        }


    }
}
