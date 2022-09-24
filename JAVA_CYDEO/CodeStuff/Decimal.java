package CodeStuff;
import java.util.*;

public class Decimal {
    public static Integer random(int min, int max){
        Integer result = (int) (Math.random()*(max - min + 1)) + min;
        return result;
    }
    public static void main(String[] args) {
        String allNums = "";

        List<Integer> list = new ArrayList<>();

        for (int i = 0; i<=27; i++) {
            list.add( random(0,1) );
            allNums += list.get(i);
        }

        int decimal = Integer.parseInt(allNums,2);
        System.out.println( allNums+ "   " +decimal);
    }
}
