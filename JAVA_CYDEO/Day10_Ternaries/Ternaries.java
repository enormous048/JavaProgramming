package Day10_Ternaries;

public class Ternaries {
    public static void main(String[] args) {

        //if:        (condition)?    -- знак питання означає іф, але кондишин зпереду ставиться
        //else:                 :
        //else if:  :(condition)?

        //In ternary we can return only 0ne value within the same datatype

        int number = 100;
        if (number % 2 == 0){
            System.out.println("even");
        }else {
            System.out.println("odd");
        }

        System.out.println("--------------------------------------------");

        //Без веріабл походу не можна то зробити бо визиває помилку
        String result = (number % 2 == 0)? "even" :(number % 2 != 0)? "odd" : "Impossible";
        System.out.println(result);

        //Або можна замість верібл запихнути в прінт стейтмент
        System.out.println( (number % 2 == 0)? "even" :(number % 2 != 0)? "odd" : "Impossible" );




        //2. NestedIf in Ternary -- dont recommend to use its hard to read
        int month = 7;
        String result1 = (month >= 1 && month <= 12)? (month == 1)? "January" : "Other month"  : "Not eligible range";
                        // outer if                    inner if               inner else        outer else

        System.out.println(result);


        //3. Можна міксувати аутер іф і елсе робити звичайними а всередині іннери робити тернарками
        String result2 = "";
        if (month >= 1 && month <= 12){
           result2 = (month == 1)? "January" : "Other month";  //то шо в лапках в тернарках то це типу прінт або ретурн
        }
        else{
            result2  = "Not eligible range";
        }

        System.out.println(result2);
    }
}
