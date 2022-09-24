package Day51_Map_Enum.Tasks;

import java.util.Scanner;

public class MonthTest {
    public static void main(String[] args) {
        
        
        
        Month month = Month.NOVEMBER;
        
        String howManyDays = (month.equals(Month.FEBRUARY))? "Has 28 days"  
                :(month.equals(Month.JANUARY) || month.equals(Month.MARCH) || month.equals(Month.MAY) || month.equals(Month.JULY) || month.equals(Month.AUGUST) || month.equals(Month.OCTOBER) || month.equals(Month.DECEMBER))? "Has 31 day" 
                : "Has 30 days";

        System.out.println("howManyDays = " + howManyDays);
        
    }
}
