package Day29_ArrayList_CollectionClass.Day29_Tasks;

import java.util.ArrayList;

public class MinMaxAvarage {
    public static void main(String[] args) {

        ArrayList< Integer > num = new ArrayList<>();
        num.add(1);
        num.add(10);
        num.add(4);
        num.add(8);
        num.add(3);
        num.add(33);


        
        int max = num.get(0);
        int min = num.get(0);
        double sum = 0.0;

        for (Integer i : num) {
            if (max < i){
                max = i;
            }
            if (min > i){
                min = i;
            }

            sum+=i;
        }

        System.out.println("min = " + min);
        System.out.println("max = " + max);
        System.out.println("avarege = " + sum/num.size());
        

    }
}
