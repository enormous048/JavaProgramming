package Day36_Inheritance_Intro.Day36_Task_phone;

public class TechShop {
    public static void main(String[] args) {
        Nokia nokia = new Nokia("Nokia", "3310", "small", "Grey", 40);
        System.out.println(nokia);
        nokia.selfDefense();

        Samsung samsung = new Samsung("Samsung", "Tab2", "large", "Grey", 200, true);
        System.out.println(samsung);
        samsung.freeze();

        Iphone iphone = new Iphone("Apple", "Xr", "medium", "Yellow", 800);

        System.out.println(iphone);
        iphone.facetimeCall(380685539800L);

    }
}
