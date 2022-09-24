package Day38_Inheritance_Overriding;

public class Toyota extends Car {


    public Toyota( String model, String color, int year, int price, int miles) {
        super("Toyota", model, color, year, price, miles);
    }

    public void reliable(){
        System.out.println(brand + " is reliable.");
    }

    @Override
    public void start(){
        System.out.println(brand + " "+ model +" started with the ignition.");
    }

}
