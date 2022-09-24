package Day36_Inheritance_Intro.Day36_Task_cryptoToken;

public class Assets {
    public static void main(String[] args) {
        Bitcoin bit = new Bitcoin(12000, 2, 1000000000, 100000, true);
        bit.totalPrice();

        Ethereum eth = new Ethereum(1000, 3, 1000000000, 100000, true);
        eth.totalPrice();

        System.out.println(bit);
        System.out.println(eth);
    }
}

