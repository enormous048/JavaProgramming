package Day44_Abstraction_Interface.carTask;

public abstract class Car {

    private final String madeIn, model;
    private final int year;
    private int price;
    private String color;


    public Car(String madeIn, String model, int year, int price, String color) {
        if (madeIn.isEmpty() || model.isEmpty() || year<=1900){
            throw new RuntimeException("Invalid data provided");
        }
        this.madeIn = madeIn;
        this.model = model;
        this.year = year;
        setPrice(price);
        setColor(color);
    }

    public String getMadeIn() {
        return madeIn;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<=0){
            throw new RuntimeException("Invalid price");
        }
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        if (color.isEmpty()){
            throw new RuntimeException("Invalid color");
        }
        this.color = color;
    }

    public abstract void start();
    public abstract void drive();


    public final void stop(){
        System.out.println("Press the brake");
    }

    public String toString() {
        return "Car{" +
                "madeIn='" + madeIn + '\'' +
                ", model='" + model + '\'' +
                ", year=" + year +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }
}
