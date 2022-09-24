package Day44_Abstraction_Interface.deviceTask;

public abstract class Phone extends Device{

    public Phone(String brand, String model, String size, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    public abstract void call(long phoneNum);
    public abstract void text(long phoneNum);

}
