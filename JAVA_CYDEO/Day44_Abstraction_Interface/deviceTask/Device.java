package Day44_Abstraction_Interface.deviceTask;

public abstract class Device {
   private final String brand, model, size;
   private int price;
   private String color;
   private boolean hasBattery, hasPowerButton;

    public Device(String brand, String model, String size, int price, String color, boolean hasBattery, boolean hasPowerButton) {
        if (brand.isEmpty() || model.isEmpty() || size.isEmpty()){
            throw new RuntimeException("Invalid data provided");
        }
        this.brand = brand;
        this.model = model;
        this.size = size;
        setPrice(price);
        setColor(color);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
    }
    public String getBrand() {
        return brand;
    }
    public String getModel() {
        return model;
    }
    public String getSize() {
        return size;
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
    public boolean isHasBattery() {
        return hasBattery;
    }
    public void setHasBattery(boolean hasBattery) {
        this.hasBattery = hasBattery;
    }
    public boolean isHasPowerButton() {
        return hasPowerButton;
    }
    public void setHasPowerButton(boolean hasPowerButton) {
        this.hasPowerButton = hasPowerButton;
    }

    public abstract void turnOn();
    public abstract void turnOff();

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                '}';
    }
}
