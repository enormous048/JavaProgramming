package Day39_Inheritance_Encapsulation.deviceTask;

public class Device {
    private String brand, model;
    private boolean hasBattery, hasPowerButton;
    private int price;


    public Device(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price) {
        setBrand(brand);
        setModel(model);
        setHasBattery(hasBattery);
        setHasPowerButton(hasPowerButton);
        setPrice(price);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.isBlank() || brand == null){
            return;
        }
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model.isBlank() || model == null){
            return;
        }
        this.model = model;
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

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        if (price<=0){
            return;
        }
        this.price = price;
    }

    public String toString() {
        return "Device{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", hasBattery=" + hasBattery +
                ", hasPowerButton=" + hasPowerButton +
                ", price=" + price +
                '}';
    }
}
