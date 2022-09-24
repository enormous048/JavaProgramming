package Day33_StaticMembers.Day33_Task;

public class Car {
    public String make, model, color;
    public int year, price;

    public static int numberOfWheels = 4;
    public static boolean hasBattery, hasSeats = true;

    public Car(String make, String model, String color, int year, int price) {
        this.make = make;
        this.model = model;
        this.color = color;
        this.year = year;
        this.price = price;
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
