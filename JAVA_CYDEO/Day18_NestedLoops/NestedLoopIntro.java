package Day18_NestedLoops;

public class NestedLoopIntro {

    //На одну ітерацію аутер луп припадають всі ітерації в іннерлуп.
    // Типу якщо аутер луп = тру => тоді відкривається іннерлуп і допоки іннер луп нестане фолс, наступна ітерація в аутерлуп не станетья


    public static void main(String[] args) {

        for (int i = 1; i <= 4; i++) {

            for (int j = 1; j <= 5; j++) {
                System.out.println("Wooden spoon");//now it will print wooden spoo for 20 times,
                                                   // адже кожна ітерація аутер луп почнеться тоді коли іннер луп не стане фолс
            }
        }

    }
}
