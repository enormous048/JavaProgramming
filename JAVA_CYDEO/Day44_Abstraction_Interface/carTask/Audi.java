package Day44_Abstraction_Interface.carTask;

public class Audi extends Car implements AutoPArk{

    public Audi(String madeIn, String model, int year, int price, String color) {
        super(madeIn, model, year, price, color);
    }

    public void start(){
        System.out.println(getModel()+" started with ignition.");
    }
    public void drive(){
        System.out.println("You are driving "+getModel());
    }

    public void autoPark(){
        System.out.println(getModel() + " has just autoparked");
    }//не всі хмашини які вміють автопаркуватись, можуть селфдрайвити, тому аутопарк це перент інтерфейс
}
