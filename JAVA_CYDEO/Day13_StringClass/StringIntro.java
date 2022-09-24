package Day13_StringClass;

public class StringIntro {
    //String class is located in java.lang. package but it is the only package classes of which are implicitly imported so we don't need to import it
    //                           (as well as Double obj = new Double(10.0); and so on)

    //String is combination of chars.


    public static void main(String[] args) {


        String name = "Naz";
        String name2 = "Naz";
        System.out.println(name == name2); //prints true because only one object is in the string pool of Heap.


        String name3 = new String("Naz");
        String name4 = new String("Naz");
        System.out.println(name3 == name4); // prints false cause they are different objects in the heap


        //But to compare the visible value we should use .equals(); method
        //every object has .equals(); method not only strings.
        String name5 = "Naz";
        String name6 = new String("naz");
        System.out.println(name5.equalsIgnoreCase(name6)); //true


    }
}
