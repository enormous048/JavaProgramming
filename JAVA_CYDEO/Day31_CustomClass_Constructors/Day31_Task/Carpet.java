package Day31_CustomClass_Constructors.Day31_Task;

public class Carpet {

    int width, length, unitPrice;
    boolean isPersian;

    public Carpet(int width, int length, int unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;
    }

    public int totalPrice(){
        int result = (width*length)*unitPrice;
        if (isPersian == true){
            result+=200;
        }

        return result;
    }

    public String toString() {
        return "Carpet{" +
                "width=" + width +
                ", length=" + length +
                ", unitPrice=" + unitPrice +
                ", isPersian=" + isPersian +
                ", totalPrice=" + totalPrice() +
                '}';
    }
}
