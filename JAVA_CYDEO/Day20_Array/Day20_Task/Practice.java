package Day20_Array.Day20_Task;

import java.util.Arrays;

public class Practice {
    public static void main(String[] args) {

        String[] items  = {"Shoes", "Jacket",  "Gloves", "AirPods", "iPad", "iPhone 12 case" };
        double[] prices = {99.99,      150.0,  9.99,     250.0 ,    439.50,  39.99};
        int[] itemIDs =   {12345 ,     12346,  12347,    12348,     12349,    12350};


        int index = 0;
        String  result = "";
        for (int i = 0; i <= items.length-1; i++) {
            result = items[i];
            if (result.equals("Gloves")){
                index = i;
                break;
            }
        }
        System.out.println(result+"  "+index);



        String pad = Arrays.toString(items);
        if (pad.contains("iPad")){
            System.out.println("Items contain iPad? - " + true);
        }if (!pad.contains("iPad")){
            System.out.println("Items contain iPad? - " + false);
        }



        for (int i = 0; i <= items.length-1; i++) {
            System.out.println(items[i] +" -- "+ prices[i] +" -- "+ itemIDs[i]);
        }
    }
}
