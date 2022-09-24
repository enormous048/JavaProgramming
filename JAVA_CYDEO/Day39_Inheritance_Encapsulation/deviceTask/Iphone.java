package Day39_Inheritance_Encapsulation.deviceTask;

public class Iphone extends Phone{

    public Iphone(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price, boolean hasSDcard) {
        super(brand, model, hasBattery, hasPowerButton, price, hasSDcard);
    }

    public void facetime(){
        System.out.println("You made a call via viber on " + getBrand() +" " + getModel() );
    }

}
