package Day31_CustomClass_Constructors.Day31_Task;

public class Item {
    public String name;
    public int price;
    public int quantity;

    public Item(String name, int price, int quantity) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }

    public int totalPrice(){
        return price*quantity;
    }

    public String toString() {
        return "name= " + name + '\n' +
                "price= " + price +"\n"+
                "quantity= " + quantity +
                "total price= " + totalPrice();
    }
}
