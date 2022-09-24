package Day44_Abstraction_Interface.deviceTask;

public class Iphone extends Phone implements AppleApp{

        public Iphone(String brand, String model, String size, int price, String color, boolean hasBattery, boolean hasPowerButton) {
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
            System.out.println("App is downloaded from App store");
        }

        public void openAppStore(){
            System.out.println("You just opened app store");
        }

}

