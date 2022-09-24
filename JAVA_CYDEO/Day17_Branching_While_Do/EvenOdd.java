package Day17_Branching_While_Do;

public class EvenOdd {
    public static void main(String[] args) {

        for (int i = 1; i <= 100; i++) {

            if (i % 2 == 0){ //всі парні номери скіпне і вибє лише непарні(одд)
                continue;
            }

            System.out.print(i + " ");
        }

        for (int i = 1; i <= 100 ; i++) {

            if (i % 2 != 0){ //всі непарні скіпне і запринтує лише парні
                continue;
            }
            System.out.print(i + " ");
        }

    }
}
