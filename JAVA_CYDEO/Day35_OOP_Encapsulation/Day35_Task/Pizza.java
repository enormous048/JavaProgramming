package Day35_OOP_Encapsulation.Day35_Task;

public class Pizza {

    private String size;
    private int numberOfCheeseTopping, numberOfPepperoniTopping;


    public int calcCost(){
        int price = (size.equalsIgnoreCase("small"))? 10 :(size.equalsIgnoreCase("medium"))? 12 :14;

        return price + (numberOfCheeseTopping + numberOfPepperoniTopping)*2;
    }

    public Pizza(String size, int numberOfCheeseTopping, int numberOfPepperoniTopping) {
        setSize(size);
        setNumberOfCheeseTopping(numberOfCheeseTopping);
        setNumberOfPepperoniTopping(numberOfPepperoniTopping);
    }

    public String getSize() {
        return size;
    }

    public int getNumberOfCheeseTopping() {
        return numberOfCheeseTopping;
    }

    public int getNumberOfPepperoniTopping() {
        return numberOfPepperoniTopping;
    }

    public void setSize(String size) {
        if (!size.equalsIgnoreCase("small") || !size.equalsIgnoreCase("medium") || !size.equalsIgnoreCase("large")){
            return;
        }
        this.size = size;
    }

    public void setNumberOfCheeseTopping(int numberOfCheeseTopping) {
        if (numberOfCheeseTopping < 0){
            System.out.println("Number of topping cannot be negative");
            return;
        }
        if (size.equalsIgnoreCase("small") && numberOfCheeseTopping >3){
            System.out.println("Number of topping for small pizza cannot be more than 3");
            return;
        }else if(size.equalsIgnoreCase("medium") && numberOfCheeseTopping >4){
            System.out.println("Number of topping for medium pizza cannot be more than 4");
            return;
        }else if(size.equalsIgnoreCase("large") && numberOfCheeseTopping >5){
            System.out.println("Number of topping for large pizza cannot be more than 5");
            return;
        }
        this.numberOfCheeseTopping = numberOfCheeseTopping;
    }

    public void setNumberOfPepperoniTopping(int numberOfPepperoniTopping) {
        if (numberOfPepperoniTopping<0){
            System.out.println("Number of topping cannot be negative");
            return;
        }
        if (size.equalsIgnoreCase("small") && numberOfPepperoniTopping >4){
            System.out.println("Number of topping for small pizza cannot be more than 4");
            return;
        }else if(size.equalsIgnoreCase("medium") && numberOfPepperoniTopping >5){
            System.out.println("Number of topping for medium pizza cannot be more than 5");
            return;
        }else if(size.equalsIgnoreCase("large") && numberOfPepperoniTopping >6){
            System.out.println("Number of topping for large pizza cannot be more than 6");
            return;
        }
        this.numberOfPepperoniTopping = numberOfPepperoniTopping;
    }


    public String toString() {
        return "Pizza{" +
                "size='" + size + '\'' +
                ", numberOfCheeseTopping=" + numberOfCheeseTopping +
                ", numberOfPepperoniTopping=" + numberOfPepperoniTopping +
                ", total cost=" + calcCost() +

                '}';
    }
}
