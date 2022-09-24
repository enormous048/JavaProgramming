package Day24_CustomMethod_Return;

public class WarmUp24 {


    public static void domain(String email){

        String sub = email.substring(email.indexOf("@")+1, email.lastIndexOf("."));
        System.out.println(sub);

    }
    
    public static void month(String month){
        if (month.toLowerCase().equals("february")){
            System.out.println( month + " has 28 days");
            
        } else if (month.toLowerCase().equals("september") || month.toLowerCase().equals("april") || month.toLowerCase().equals("june") || month.toLowerCase().equals("november")) {
            System.out.println( month + " has 30 days");
        }//September, April, June, and November.
        else {
            System.out.println( month + " has 31 days");
        }

    }

    public static void monthName(int month){

        String result = "";
        if (!(month >= 1 && month <= 12)){
            result = "Invalid";
            return; //exits
        }

        if (month >= 1 && month <= 12 ){
            result = (month == 1)? "jan" :(month == 2)?"feb" :(month == 3)?"mar" :(month == 4)?"apr" :(month == 5)?"may"
                    :(month == 6)?"jun" :(month == 7)?"jul" :(month == 8)?"aug" :(month == 9)?"sep" :(month == 10)?"oct" :(month == 11)?"now"
                    : "dec";
        }
        System.out.println(result);
    }


    public static void main(String[] args) {
        domain("naz.kovalchuk@gmail.com");

        String[] emails = {"naz@gmail.com", "koval@icloud.com", "enormous048@yahoo.com"};
        for (String each : emails) {
            domain(each);
        }

        month("October");
        monthName(2);
    }
}
