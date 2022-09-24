package Day44_Abstraction_Interface.carTask;

public class Tesla extends Car implements SelfDrive{

    public Tesla(String madeIn, String model, int year, int price, String color) {
        super(madeIn, model, year, price, color);
    }

    @Override
    public void start() {
        System.out.println("Started tesla");
    }

    @Override
    public void drive() {

        System.out.println("Driving tesla");
    }

    public void autoPark(){
        System.out.println(getModel()+" has just autoparked");
        //кожна машина з селфдрайвом вміє автопаркуватись, тому мусиш перент інтерфейс метод овверайднути
    }
    public void selfDrive(){
        System.out.println(getModel() + " is selfdriving");
    }
}
