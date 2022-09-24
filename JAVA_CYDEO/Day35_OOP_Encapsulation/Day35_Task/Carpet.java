package Day35_OOP_Encapsulation.Day35_Task;

public class Carpet {

    private int width, length, unitPrice;
    private boolean isPersian;


    private int totalPrice(){
        int result = (width*length) * unitPrice;
        if (isPersian==true){
            result+=200;
        }
        return result;

    }


    public int getWidth() {
        return width;
    }

    public int getLength() {
        return length;
    }

    public int getUnitPrice() {
        return unitPrice;
    }

    public boolean isPersian() {
        return isPersian;
    }


    public void setWidth(int width) {
        if (width<=0){
            return;
        }
        this.width = width;
    }

    public void setLength(int length) {
        if (length<=0){
            return;
        }
        this.length = length;
    }

    public void setUnitPrice(int unitPrice) {
        if (unitPrice<=0){
            return;
        }
        this.unitPrice = unitPrice;
    }

    public void setPersian(boolean persian) {
        isPersian = persian;
    }


    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", total price=" + totalPrice() +
                '}';
    }
}
