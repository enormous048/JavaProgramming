package Day50_Iterable;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class Iterable_Practice {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();
        list.addAll(Arrays.asList("Ahmed", "aHMed", "AhmED", "Joe", "Naz", "bibi"));

        //removeAll()  не дозволяє видаляти різні кейси, а тут реквайрмент без removeIf
        Iterator<String> it = list.iterator();

        while (it.hasNext()){
            if (it.next().equalsIgnoreCase("ahmed")){  //next() represents each element
                it.remove();
            }
        }
        System.out.println(list);


        //for loop accepts declaration of iterator in initialization part

        for (Iterator<String> it2 = list.iterator(); it2.hasNext();){
            if (it2.next().equalsIgnoreCase("ahmed")){
                it2.remove();
            }
        }


    }
}
