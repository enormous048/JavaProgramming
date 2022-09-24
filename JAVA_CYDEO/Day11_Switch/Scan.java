package Day11_Switch;

import java.util.Scanner; //java.util.*   теж заімпортить сканер але такий спосіб їсть більше ресурсів
                          //java.util  -- util це пекедж всередині джава пекеджу а Сканер це вже класс

public class Scan {
    public static void main(String[] args) {

        Scanner myObj = new Scanner(System.in); // ото шо після new (Scanner) то це констрактор єбать я не знав
                                                //то шо в душках констрактора то аргумент який ми посилаєм до констрактора
        int a = myObj.nextInt();
        String operator = myObj.next();
        int b = myObj.nextInt();

        int result = 0;

        if (operator == "*" || operator == "/" || operator == "+" || operator == "-") {
            switch (operator) {
                case "+":
                    result = a + b;
                    break;

                case "-":
                    result = a - b;
                    break;

                case "*":
                    result = a * b;
                    break;

                case "/":
                    result = a / b;


            }

            System.out.println(result);


        }else{
            System.err.print("Invalid operator");
        }



        myObj.close(); //not required but якшо не закрити воно може зїдати оперативку(bad performance)

    }


}
