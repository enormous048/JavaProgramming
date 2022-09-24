package Day39_Inheritance_Encapsulation.deviceTask;

public class TV extends Device{
    private boolean hasPeel;


    public TV(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price, boolean hasPeel) {
        super(brand, model, hasBattery, hasPowerButton, price);
        setHasPeel(hasPeel);
    }

    public boolean isHasPeel() {
        return hasPeel;
    }

    public void setHasPeel(boolean hasPeel) {
        this.hasPeel = hasPeel;
    }
}
