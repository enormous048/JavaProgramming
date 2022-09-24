package Day44_Abstraction_Interface.carTask;

public class BMW extends Car{
    public BMW(String madeIn, String model, int year, int price, String color) {
        super(madeIn, model, year, price, color);
    }

    @Override
    public void drive() {
        System.out.println("You are driving bmw");
    }

    @Override
    public void start() {
        System.out.println("Started bmw with ignition");
    }

    //зробили інтерфейси саме тому що бмв наприклад не має автопарк чи автопілот, а деякі мають
}
