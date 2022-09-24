package Day44_Abstraction_Interface.deviceTask;

public final class DeskTopPC extends Computer{
    public DeskTopPC(String brand, String model, String size, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("Desktop turned on");
    }

    @Override
    public void turnOff() {
        System.out.println("Desktop turned off");
    }

    @Override
    public void code() {
        System.out.println("You are coding on " + getBrand() + "  " + getModel());
    }

    //downloadApp  тут не може бути бо тоді нема сенсу інтерфейс створювати якшо всі сабкласи мають давнлоад апп
}
