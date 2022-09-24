package Day11_Switch.Day11_Task;

public class Capuccino {

    public static void main(String[] args) {
        String size = "tall";
        String result = "";

        double price = 0;
        int calories = 0;

        if (size.equals("tall") || size.equals("grande") || size.equals("venti")){

            switch (size){
                case "tall":
                    price = 3.69;
                    calories = 90;
                    break;

                case "grande":
                    price = 3.99;
                    calories = 120;
                    break;

                default:
                    price = 4.29;
                    calories = 150;
                    break;

            }
            System.out.println("The price is: $" + price + "\n" + calories + " calories.");


        }else {
            System.out.println( "Invalid size" );
        }




    }
}
