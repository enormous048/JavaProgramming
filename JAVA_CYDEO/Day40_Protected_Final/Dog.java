package Day40_Protected_Final;

public class Dog extends Animal{


    public Dog(String name, String breed, String color, char gender, int age, int lbs) {
        super(name, breed, color, gender, age, lbs);
    }

    @Override
    public void eat(){
        System.out.println(getName() + " eats dog food.");
    }


    /*
    @Override
    public void drink(){
        System.out.println("Dog drinks coca cola");
    }

    */    //Dog cannot drink coca cola, we cant override final method
}
