package Day39_Inheritance_Encapsulation.deviceTask;

public class LGtv extends TV{

    public LGtv(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price, boolean hasPeel) {
        super(brand, model, hasBattery, hasPowerButton, price, hasPeel);
    }

    public void open(){
        System.out.println("You opened sweet tv on " + getBrand() + " " + getModel());
    }
}
