package Day39_Inheritance_Encapsulation.deviceTask;

public class Computer extends Device{
    private boolean hasSSD;


    public Computer(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price, boolean hasSSD) {
        super(brand, model, hasBattery, hasPowerButton, price);
        setHasSSD(hasSSD);
    }

    public boolean isHasSSD() {
        return hasSSD;
    }

    public void setHasSSD(boolean hasSSD) {
        this.hasSSD = hasSSD;
    }
}
