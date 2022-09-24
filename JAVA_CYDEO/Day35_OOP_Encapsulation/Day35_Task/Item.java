package Day35_OOP_Encapsulation.Day35_Task;

public class Item {
    private String name;
    private int unitPrice, quantity;


    public int calcCost(){
        return unitPrice*quantity;
    }

    public Item(String name, int unitPrice, int quantity) {
        setName(name);
        setUnitPrice(unitPrice);
        setQuantity(quantity);
    }

    public String getName() {
        return name;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public int getQuantity() {
        return quantity;
    }


    public void setName(String name) {
        if (name.isEmpty()){
            return;
        }
        for (int i = 0; i <= name.length()-1; i++) {
            if ( !Character.isLetterOrDigit(name.charAt(i)) && !Character.isSpaceChar(name.charAt(i)) ){ //якшо він є спешил керетером і не є спейсом то екзіт
                return;
            }
        }
        this.name = name;
    }

    public void setUnitPrice(int unitPrice) {
        this.unitPrice = unitPrice;
    }

    public void setQuantity(int quantity) {
        if (name.equalsIgnoreCase("toilet paper")){
            quantity =1;
        }
        this.quantity = quantity;
    }


    public String toString() {
        return "Item{" +
                "name='" + name + '\'' +
                ", unitPrice=" + unitPrice +
                ", quantity=" + quantity +
                ", cost=" + calcCost() +
                '}';
    }
}
