package Day39_Inheritance_Encapsulation.deviceTask;

public class Desktop extends Computer{


    public Desktop(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price, boolean hasSSD) {
        super(brand, model, hasBattery, hasPowerButton, price, hasSSD);
    }

    public void updateWindows(){
        System.out.println("You updated windows on" + getBrand() + " " + getModel());
    }
}
