package Day53_Interface_Stream.InterfaceTheory;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.function.BiConsumer;

public class BiConsumer_Interface {
    public static void main(String[] args) {

        //Similar to Consumer but there is two parameters. Void type.
        // void accept(T t, U u);


        //create a function that can print a string by given amount of times
        BiConsumer<String, Integer> printByTimes = (str, times) ->{

            for (int i = 1; i<=times; i++){
                System.out.println(str);
            }
        };

        printByTimes.accept("Wooden Spoon", 5);



        BiConsumer<String , String> fullName = (firstname, lastname) ->{

            firstname = firstname.substring(0, 1).toUpperCase()+ firstname.substring(1).toLowerCase();
            lastname = lastname.substring(0, 1).toUpperCase()+ lastname.substring(1).toLowerCase();


            System.out.println(firstname+ " "+ lastname);
        };
        fullName.accept("NAz", "koVALchuk");






        //---------------------------------------------------------------------------

        Map<String, Integer> scrumTeam1 = new LinkedHashMap<>();
        scrumTeam1.put("Abdulhamid", 2);
        scrumTeam1.put("Nikita",3);
        scrumTeam1.put("Line",8);
        scrumTeam1.put("Mert", 9);
        scrumTeam1.put("Lee", 7);

        for (Map.Entry<String, Integer> entry : scrumTeam1.entrySet()) {
            System.out.println(entry.getKey()+ " "+entry.getValue());
        }

        //for each method for collection demands Consumer
        //but for each method for map demands BiConsumer

        scrumTeam1.forEach(  (k, v)->{   //походу в перший аргумент фор іч методи підставляє ключ мепу а в другий аргумент велью мепу
            System.out.println(k+ " "+ v);
        }
        );
    }
}
