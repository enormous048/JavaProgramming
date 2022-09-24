package Day36_Inheritance_Intro.Day36_Task_cryptoToken;

public class Bitcoin extends Token{

    public Bitcoin(double price, double quantity, double marketCap, double circulatingSupply, boolean isMineable){
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }

    public void printBitCoinPrice(){
        System.out.println(price + " is price of bitcoin");
    }
}
