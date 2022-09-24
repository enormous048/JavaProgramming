package Day43_Abstraction_Class.car;

public final class BMW extends Car{ //якшо тут поставиш ебстракт класс, то не зможеш створити обьєкт

    public BMW( String model, String color, int price) {
        super("BMW", model, color, price);
    }

    public void start(){
        System.out.println(getModel() + " "+ getModel() + " started with ignition.");
    }


}
