package Day43_Abstraction_Class.car;

public final class Tesla extends Car{

    public Tesla( String model, String color, int price) {
        super("Tesla", model, color, price);
    }

    @Override
    public void start(){
        System.out.println(getBrand()+ " " + getModel()+" started with lion batteries turned on.");
    }


}
