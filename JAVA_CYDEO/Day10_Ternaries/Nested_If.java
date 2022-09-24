package Day10_Ternaries;

public class Nested_If {
    // We use it when one condition is dependent on another condition
    public static void main(String[] args) {


        int score = 69;
        String result = ""; //Темпорал велью щоб avoid error


        if (score >= 0 && score <= 100) {
            if (score >= 90){ //тут вже необовязково писати цю сроку: && score <= 100 бо вона вже косвенно дана завдяки верхній іфці
                result = "Excellent";
            }else if (score >= 80){ //тут так само якшо >=90 неправильно це вже означає косвенно перехід до цієї іфки
                result = "Great";
            }else if (score >= 70){ //так само
                result = "Good";
            }else if (score >= 60){
                result = "Passed";
            }else{//якшо попало в діапазон нестеду верхнього але не попало в верхні 4 іфки, то косвенно значить шо це від нуля до 60
                result = "Failed";
            }

        }else
            result = "Score is invelid"; //доречі якшо в іфці хіба один стейтмент в боді то курлі брейсес можна забрати
                                         //але якшо більше за 1 то вибє еррор без брейсес

        System.out.println(result);

    }
}