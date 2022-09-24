package Day28_ArrayList;

import java.util.ArrayList;

public class UniqueElements {

    public static void main(String[] args) {


        ArrayList< String  > names = new ArrayList<>();
        names.add("Naz");
        names.add("Naz");
        names.add("Mes");
        names.add("Cool");
        names.add("Cool");
        names.add("Spoon");
        names.add("Mes");

        ArrayList < String > unique = new ArrayList<>();
        for (String name : names) {
            if (names.indexOf(name)==names.lastIndexOf(name)){
                unique.add(name);
            }
        }
        System.out.println("unique = " + unique);
    }
}
