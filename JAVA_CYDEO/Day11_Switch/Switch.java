package Day11_Switch;

public class Switch {
    public static void main(String[] args) {
        //switch expression cannot be boolean(не можна тру фолс слова запихати в світч експешин), long, double, float  datatype.!!!

        //switch is faster but do not have all the functions of if statement

        //Якшо в двох кейсах даєш одну і ту саму велью то вибє помилку, в іфці помилки не буде.

        //світч виконує тільки == функцію, всі решта буліни воно не здатне робити



        /*
        switch (data) { == порівнює дейту з кейсами
          case 1:   //case must match with the data type of expression in switch
          sout();
          break;    //якшо не поставиш брейк то після екзукуції кейса 1 воно наступний ще заекзекьютить і в принті вибє
                      кейс 1 і кейс 2 допоки не дойде до брейк або закінчення курлі брейсес

          case 2:
          sout();
          break;

          default:  // схоже на елсе в іфці коли нічого не заметчилося то вибє те шо  в дефолті
          sout();      і його можна ставити в будьякому місці світч стейтменту проте якшо там не поставиш брейк то наступний варік запринтується
          break;       якшо дефолт стоїть останнім то можна і не ставити брейк стейтмент

        }
        */



        //2. OR ||    (but && logic is impossible)
        char mark = 'A';
        String result = "";

        switch (mark) {
            case 'A':
            case 'B':
            case 'C':
            case 'D':
                result = "Passed"; //без брейку воно заметчилось і йде далі допоки не найде брейк;
                break;

            case 'F':
                result = "Failed";

            default:
                result = "Invalid";
                break;
        }
        System.out.println(result);

    }
}
