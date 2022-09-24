package Day44_Abstraction_Interface.carTask;

public class RonWeesleCar extends Car implements Flyable{
    public RonWeesleCar(String madeIn, String model, int year, int price, String color) {
        super(madeIn, model, year, price, color);
    }


    @Override
    public void start() {

        System.out.println("Started Ron's car");
    }

    @Override
    public void drive() {

        System.out.println("Driving Ron's car");
    }

    public void fly(){
        System.out.println("Flying in Ron's car");
    }
}
