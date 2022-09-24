package Day32_ConstructorOverloading;

public class Car {
   public String make, model, color;
   public int  year, price;

   public Car(String make){
       this.make = make;
   }

   public Car(String make, String model){
       this(make);
       this.model = model;
   }
    public Car(String make, String model, String color) {
        this(make, model);
        this.color = color;
    }

    public Car(String make, String model, String color, int price) {
        this(make, model, color);
        this.price = price;
    }

    public Car(String make, String model, String color, int price, int year) {
        this(make, model, color, price);
        this.year = year;
    }


    public String toString() {
        return "Car{" +
                "make='" + make + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", year=" + year +
                ", price=" + price +
                '}';
    }
}
