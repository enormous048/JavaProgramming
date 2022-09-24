package Day17_Branching_While_Do;

public class Branching {
    public static void main(String[] args) {
        for (char i = 'A'; i <= 'Z'; i++){

            if (i == 'F'){ //F вже не запринтує бо брейк стоїть перед принт методом, якби після то Ф би ше запринтувалось
                break;
            }

            System.out.println(i+" ");
        }


        for (char i = 'A'; i <= 'E'; i++){

            if (i == 'C'){
                continue; //пропустить заданий керектер але всінаступні ітерації продивжить
            }

            System.out.println(i+" ");
        }

    }
}
