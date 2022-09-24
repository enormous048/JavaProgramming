package Day7_Operators;

public class ShortHandOperators {
    public static void main(String[] args) {

        //1. Assignment  int a = 1;  = is called assignment


        //2. AssignmentAddition - original value plus new value  /  assigns new value to a variable
        //  +-*/% роблять арифметичну операцію а = запихає цю операцію в змінну
        int x = 100;

        x += 200; //ми могли б в принті написати sout(x +200); щоб вибило 300 але таким способом сам х не зміниться
                  //а тут ми по суті змінюєм сам х і він весь час буде мати цю велью тепер


        String str = "Java ";
        str += "Programming"; //outputs Java Programming


        //ПРиклад з банку
        int bankBalance = 1043;
        bankBalance += 5400;
        System.out.println(bankBalance);  //прийшла зарплата і банк додає таким чином гроши

        //3. Так само все з іншими: -+  *=  /=

        //Example: withdrawing 200 depositing 400
        bankBalance -= 200;
        bankBalance += 400;

        //Doge
        double doge = 0.000005;
        doge *= 1_000_000;//dogecoin grew in price by million times


        //4. %=

        int num = 100;
        num %= 3; //outputs 1
        //спочатку ділить сто на три і назад в змінну запихає остачу





    }
}
