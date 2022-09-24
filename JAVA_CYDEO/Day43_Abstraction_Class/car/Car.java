package Day43_Abstraction_Class.car;

public abstract class Car {
    private String color;
    private final String brand, model;
    private int price;

    public Car(String brand, String model, String color, int price) {

        setColor(color);
        setPrice(price);
        if (brand.isEmpty()){
            throw  new RuntimeException("Invalid brand");
        }
        this.brand = brand;
        if (model.isEmpty()){
            throw  new RuntimeException("Invalid model");
        }
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static void stop(){
        System.out.println("Press the brake"); //якшо у всіх машин одна версія методу, то не треба робити абстрактом.
    }

    public abstract void start();
    //static, private and final not working, because you won't be able to override

    //static - коли обьєкти шейрять одну версію веріабл або методу.  А тут кожен сабклас це по суті різні різні імплементації.
    //private - не зможеш просто мати доступу тому і незаоверрайдиш.
    //final - means constant so you cant override it.


    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
