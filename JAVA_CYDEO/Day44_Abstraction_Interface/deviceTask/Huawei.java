package Day44_Abstraction_Interface.deviceTask;

public class Huawei extends Phone implements Downloadable{
    public Huawei(String brand, String model, String size, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        super(brand, model, size, price, color, hasBattery, hasPowerButton);
    }

    @Override
    public void turnOn() {
        System.out.println("You turned on " + getBrand());
    }

    @Override
    public void turnOff() {
        System.out.println("You turned off on " + getBrand());

    }

    @Override
    public void call(long phoneNum) {
        System.out.println("You called to " + phoneNum);

    }

    @Override
    public void text(long phoneNum) {
        System.out.println("You texted to " + phoneNum);

    }

    @Override
    public void downloadApp() {
        System.out.println("App is downloaded from huawei store");
    }//Якшо не андроід і не айос то тоді просто з давноалдабл скачуєм апп
}
