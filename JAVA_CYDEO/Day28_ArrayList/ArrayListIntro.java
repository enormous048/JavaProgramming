package Day28_ArrayList;

import java.util.ArrayList;

public class ArrayListIntro {
    public static void main(String[] args) {

        //ArrayList class is a part of Collection interface. Internally uses the array.

        //Main advantage it allows us to modify size of the same ArrayList object

        //But supports only wrappers not primitives


        ArrayList < Integer > num = new ArrayList<>();
        ArrayList < String > names  = new ArrayList<>();

        System.out.println(num);//no need to trigger toString() method
        System.out.println(names.toString());// implicitly called




    }
}
