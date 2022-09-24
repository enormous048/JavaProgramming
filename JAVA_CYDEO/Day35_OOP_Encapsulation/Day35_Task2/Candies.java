package Day35_OOP_Encapsulation.Day35_Task2;



public class Candies {
    private String brand;
    private int quantity, price;
    private boolean hasPeanuts;


    public Candies(String brand, int quantity, int price, boolean hasPeanuts) {
        setBrand(brand);
        setQuantity(quantity);
        setPrice(price);
        setHasPeanuts(hasPeanuts);
    }

    public String getBrand() {
        return brand;
    }
    public int getQuantity() {
        return quantity;
    }
    public int getPrice() {
        return price;
    }
    public boolean isHasPeanuts() {
        return hasPeanuts;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public void setQuantity(int quantity) {
        if (quantity <= 0){
            return;
        }
        this.quantity = quantity;
    }
    public void setPrice(int price) {
        if (price<=0){
            return;
        }
        this.price = price;
    }
    public void setHasPeanuts(boolean hasPeanuts) {
        this.hasPeanuts = hasPeanuts;
    }



    public String toString() {
        String result = "";
        if (price == 0) {
            result = "Free";
        }else {
            result = price+"";
        }

        return "Candies{" +
                "brand='" + brand + '\'' +
                ", quantity=" + quantity +
                ", price=" + result +
                ", hasPeanuts=" + hasPeanuts +
                ", hasPeanuts=" + hasPeanuts +
                '}';
    }
}
