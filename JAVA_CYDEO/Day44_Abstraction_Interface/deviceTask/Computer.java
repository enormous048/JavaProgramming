package Day44_Abstraction_Interface.deviceTask;

public abstract class Computer extends Device{

    public Computer(String brand, String model, String size, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public abstract void code();
}
