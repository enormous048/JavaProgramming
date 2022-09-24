package Day36_Inheritance_Intro.Day36_Task_phone;

public class Samsung extends Phone{
    public boolean hasLargeBattery;

    public Samsung(String brand, String model, String size, String color, int price, boolean hasLargeBattery){
        super(brand, model, size, color, price);
        this.hasLargeBattery = hasLargeBattery;
    }
    public void freeze(){
        System.out.println(brand +" "+ model+ " is freezing.");
    }
}
