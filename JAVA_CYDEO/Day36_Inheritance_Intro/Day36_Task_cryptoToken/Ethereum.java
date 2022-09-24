package Day36_Inheritance_Intro.Day36_Task_cryptoToken;

public class Ethereum extends Token{

    public Ethereum(double price, double quantity, double marketCap, double circulatingSupply, boolean isMineable){
        super(price, quantity, marketCap, circulatingSupply, isMineable);
    }

    public void printEthPrice(){
        System.out.println(price + " is price of ethereum");
    }
}
