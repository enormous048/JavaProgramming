package Day24_CustomMethod_Return;

public class ReturnPractice {


    public static String grade(int mark){

        String result = "";


        if (mark < 0 || mark > 100){
            result = "Invalid";
        }else {
            result = (mark <= 60)?"F" :(mark <= 70)?"D" :(mark <= 80)?"C" :(mark <= 90)?"B" :"A";
        }
        return result;

    }



    public static void main(String[] args) {

        String latter = grade(78);

        if (latter.equals("A")){
            System.out.println("Excellent");

        }else if (latter.equals("B")){
            System.out.println("Great");

        }else if (latter.equals("C")){
            System.out.println("Good");

        }else if (latter.equals("D")){
            System.out.println("Fair");

        }else {
            System.out.println(latter);
        }



    }
}
