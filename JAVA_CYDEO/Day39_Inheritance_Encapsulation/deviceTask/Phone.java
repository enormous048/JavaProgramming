package Day39_Inheritance_Encapsulation.deviceTask;

public class Phone extends Device{

    private boolean hasSDcard;


    public Phone(String brand, String model, boolean hasBattery, boolean hasPowerButton, int price, boolean hasSDcard) {
        super(brand, model, hasBattery, hasPowerButton, price);
        setHasSDcard(hasSDcard);
    }

    public boolean isHasSDcard() {
        return hasSDcard;
    }

    public void setHasSDcard(boolean hasSDcard) {
        this.hasSDcard = hasSDcard;
    }
}
