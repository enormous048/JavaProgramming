package Day36_Inheritance_Intro.Day36_Task_phone;

public class Nokia extends Phone{

    public Nokia(String brand, String model, String size, String color, int price) {
        super(brand, model, size, color, price);
    }

    public void selfDefense(){
        System.out.println(brand +" "+ model+ " is made to kill the predator.");
    }
}
