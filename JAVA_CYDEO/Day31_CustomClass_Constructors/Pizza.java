package Day31_CustomClass_Constructors;

public class Pizza {
    public String size;
    public int numberOfCheeseTopping;
    public int numberOfPapperoniTopping;

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPapperoniTopping) {
        this.size = size;
        this.numberOfCheeseTopping = numberOfCheeseTopping;
        this.numberOfPapperoniTopping = numberOfPapperoniTopping;
    }

    public int calcCost(){
        int totalCost = 0;

        if (size=="L"){
            totalCost = 14 + (numberOfCheeseTopping+numberOfPapperoniTopping)*2;

        }else if (size=="M"){
            totalCost = 12 + (numberOfCheeseTopping+numberOfPapperoniTopping)*2;

        }else if (size=="S"){
            totalCost = 10 + (numberOfCheeseTopping*numberOfPapperoniTopping)*2;

        }
        return totalCost;
    }

    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPapperoniTopping=" + numberOfPapperoniTopping +
                ", totalCost=" + calcCost() +
                '}';
    }
}
