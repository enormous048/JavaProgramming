package Day8_IfStatement;

public class Single_If {
    public static void ifState() {


        int num = 400;
        boolean evenNumber = num % 2 == 0; //якщо число ділиться на 2 без остачі це парне
        boolean  oddNumber = !evenNumber;

        if (evenNumber){
            System.out.println(num + " is even number");

        }

        if (oddNumber){//по суті в іф запихається булінка, в іф може бути лише булінка
            System.out.println(num + " is odd number");

        }
    }

    public static void Mark() {
        int mark = 85;
        String result = "";

        if(mark >= 90 && mark <= 100){
            result = "Excellent";
        }
        if(mark >= 80 && mark <= 89){
            result = "Great";
        }
        if (mark >= 70 && mark <= 79){
            result = "Good";
        }
        if (mark >= 60 && mark <= 69){
            result = "Passed";
        }
        if (mark >=0 && mark <= 59){
            result = "Failed";
        }
        System.out.println(result);

    }



    public static void main(String[] args) {
        int monthNum = 2;

        boolean has28Days = monthNum == 2;
        boolean has30Days = monthNum == 4 || monthNum == 6 || monthNum ==9 || monthNum ==11;
        boolean has31Days = !has28Days && !has30Days;

        String result = "";

        if(has28Days){
            result = "This month has 28 days";
        }
        if (has30Days){
            result = "This month has 30 days";
        }
        if(has31Days){
            result = "This month has 31 day";
        }

        System.out.println(result);
    }

}
