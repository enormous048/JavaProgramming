package Day10_Ternaries.Day10_Task;

public class Crew {
    public static void main(String[] args) {
        int crew = 50;
        String result = "";

        if (crew == 50 || crew == 75 || crew == 100){
            if (crew == 50){
                result = "Total of " + crew + " ====> 20 crew, 30 passengers";
            } else if (crew == 75) {
                result = "Total of " + crew + " ====> 25 crew, 50 passengers";
            }else {
                result = "Total if " + crew + " ====> 20 crew, 30 passengers";
            }


        }else {
            result = "Invalid number of crew members";
        }
        System.out.println(result);


    }
}
