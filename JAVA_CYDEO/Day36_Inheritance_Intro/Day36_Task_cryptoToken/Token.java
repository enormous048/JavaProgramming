package Day36_Inheritance_Intro.Day36_Task_cryptoToken;

public class Token {
    public double price, quantity, marketCap, circulatingSupply;
    public boolean isMineable;

    public Token(double price, double quantity, double marketCap, double circulatingSupply, boolean isMineable) {
        this.price = price;
        this.quantity = quantity;
        this.marketCap = marketCap;
        this.circulatingSupply = circulatingSupply;
        this.isMineable = isMineable;
    }

    public String toString() {
        return "Token{" +
                "price=" + price +
                ", quantity=" + quantity +
                ", marketCap=" + marketCap +
                ", circulatingSupply=" + circulatingSupply +
                ", isMineable=" + isMineable +
                '}';
    }

    public double totalPrice(){
        return price*quantity;
    }
}
