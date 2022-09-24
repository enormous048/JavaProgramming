package Day36_Inheritance_Intro.Day36_Task_phone;

public class Iphone extends Phone {

    public Iphone(String brand, String model, String size, String color, int price){
        super(brand, model, size, color, price);
    }

    public void facetimeCall(long phoneNum){
        System.out.println("Calling via facetime to " + phoneNum);
    }

    public void facetimeText(long phoneNum){
        System.out.println("Texting via facetime to " + phoneNum);
    }
}
