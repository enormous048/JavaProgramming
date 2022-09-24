package Day28_ArrayList;

import java.util.ArrayList;

public class RemoveDublicates {
    public static void main(String[] args) {

        ArrayList< String  > names = new ArrayList<>();
        names.add("Naz");
        names.add("Naz");
        names.add("Mes");
        names.add("Cool");
        names.add("Cool");
        names.add("Spoon");
        names.add("Mes");
        
        ArrayList< String > removedDublicates = new ArrayList<>();
        for (String name : names) {
            if (!removedDublicates.contains(name)){
                removedDublicates.add(name);
            }
        }
        System.out.println("removedDublicates = " + removedDublicates);
        
    }
}
