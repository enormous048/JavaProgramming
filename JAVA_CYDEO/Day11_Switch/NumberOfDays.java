package Day11_Switch;

public class NumberOfDays {

    //if and switch can be mixed together but it is not commonly used
    public static void main(String[] args) {
        int month = 2;
        int year = 2024;
        String result = "";


        if (month>=1 && month <= 12){

            switch (month) {
                case 2: //всередину кейсу також можна іф запхати
                   result = (year % 4 == 0)? "Has 28 days." : "Has 29 days.";
                   break;


                case 4:
                case 6:
                case 9:
                case 11:
                    result = "Has 30 days";
                    break;

                default:
                    result = "Has 31 day";
                    break;
            }


        }else {
            result = "Invalid";
        }

        System.out.println(result);

    }
}
