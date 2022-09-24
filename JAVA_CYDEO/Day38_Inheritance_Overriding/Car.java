package Day38_Inheritance_Overriding;

public class Car {


    public String brand, model, color;
    public int  year, price, miles;

    public Car(String brand, String model, String color, int year, int price, int miles) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
        this.miles = miles;
    }

    public void start(){
        System.out.println(brand +" "+ model + " started.");
    }

    /*
    public void fly(){
        System.out.println(brand +" "+ model + " flewn.");
    }
    Not all of the cars could fly, so it shouldnt be in the parent class.
    Parent class should only contain similar features of subclasses
    */

    public String toString() {
        return "WarmUp{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", miles=" + miles +
                '}';
    }
}
