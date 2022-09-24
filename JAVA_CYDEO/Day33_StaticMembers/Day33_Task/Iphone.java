package Day33_StaticMembers.Day33_Task;

public class Iphone {
    public String model, color, size;
    public int price;

    public static String brand ="Apple",
            OS = "IOS",
            madeIn = "Chine";

    public Iphone(String model, String color, String size, int price) {
        this.model = model;
        this.color = color;
        this.size = size;
        this.price = price;
    }

    public void faceTime(long phoneNumber){
        System.out.println("Calling to facetime by number: " + phoneNumber);
    }
    public void faceTime(String email){
        System.out.println("Calling to facetime by email: " + email) ;
    }

    public String toString() {
        return "Iphone{" +
                "model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", size='" + size + '\'' +
                ", price=" + price +
                '}';
    }
}
