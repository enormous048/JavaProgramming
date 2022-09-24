package Day30_CustomClass;

import java.util.ArrayList;
import java.util.Arrays;

public class DogMain {
    public static void main(String[] args) {
        Dog dogObj = new Dog();
        dogObj.name = "Badi";
        dogObj.color = "Mandarine";
        dogObj.breed = "Hasky";
        dogObj.age = 18;
        dogObj.mass = 69;
        dogObj.gender = 'F';
        System.out.println(dogObj);//java compiler automatically seek for toString so you dont need to pass toSting in print.


        Dog dogObj2 = new Dog();
        dogObj2.name = "Rex";
        dogObj2.color = "Black";
        dogObj2.breed = "Stray";
        dogObj2.age = 17;
        dogObj2.mass = 25;
        dogObj2.gender = 'M';
        System.out.println(dogObj2);


        Dog dogObj3 = new Dog();
        dogObj3.setInfo("Pidor", "Labrador", "white", 12, 43 , 'M');
        System.out.println( dogObj3);




        ArrayList<Dog> dogs = new ArrayList<>();
        dogs.addAll(Arrays.asList(dogObj, dogObj2, dogObj3));

        ArrayList<Dog> males = new ArrayList<>(dogs);
        ArrayList<Dog> females = new ArrayList<>(dogs);

        males.removeIf(p-> p.gender == 'F');
        females.removeIf(p->p.gender == 'M');

        System.out.println("males = " + males.size());
        System.out.println("females = " + females.size());








        //datatype  variableName = object;
        Dog haskiObj = new Dog();

        //datatype  variableName = object;
        String str = "object of string";
    }
}
