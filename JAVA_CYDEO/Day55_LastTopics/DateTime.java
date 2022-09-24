package Day55_LastTopics;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class DateTime {
    public static void main(String[] args) {
        //LocalDate	Represents a date (year, month, day (yyyy-MM-dd))
        //LocalTime	Represents a time (hour, minute, second and nanoseconds (HH-mm-ss-ns))
        //LocalDateTime	Represents both a date and a time (yyyy-MM-dd-HH-mm-ss-ns)
        //DateTimeFormatter	Formatter for displaying and parsing date-time objects

        LocalDate date = LocalDate.now();
        System.out.println(date);

        LocalTime time = LocalTime.now();
        System.out.println(time);

        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println(dateTime);


        //Короче то як джава фейкер леттеріфай, тут головне ключові букви, а все шо між ними буде своє
        DateTimeFormatter formatObj = DateTimeFormatter.ofPattern("dd:))MM:))yyyy    HH:mm:ss ");
        String formattedDateTime = formatObj.format(dateTime);



        //The ofPattern() method accepts all sorts of values,
        //if you want to display the date and time in a different format.

        // yyyy-MM-dd	            "1988-09-29"
        // dd/MM/yyyy	            "29/09/1988"
        // dd-MMM-yyyy	            "29-Sep-1988"
        // E, MMM dd yyyy	        "Thu, Sep 29 1988"
        // dd-MM-yyyy HH:mm:ss      "29/09/1988 23:54:05"

    }
}
