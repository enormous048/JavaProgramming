package Day44_Abstraction_Interface.carTask;

public class Toyota extends Car{
    public Toyota(String madeIn, String model, int year, int price, String color) {
        super(madeIn, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println(getModel() + " started with ignition");
    }

    @Override
    public void drive() {
        System.out.println("You are driving "+ getModel());
    }
    //зробили інтерфейси саме тому що тойота і бмв наприклад не мають автопарк чи автопілот, а деякі мають
}
