package Day15_ForLoop;

public class ForLoopPractice {
    public static void main(String[] args) {
        for (int num = 1; num <= 50; num++){

            if (num >= 15 && num <= 35){
                System.out.print(num + " ");
            }
        }
        System.out.println(); //без цього принтлн воно хелло буде біля номерів
        System.out.println("Hello");


        for (int num2 = 100; num2 >= 50; num2 --){
            System.out.print(num2 +" "); //Говори собі: весь час поки кондишин правдивий луп буде повторюватись
        }


        for (int even = 1; even <= 55; even ++){
            if (even % 2 == 0){
                System.out.print(even + " ");
            }
        }


        System.out.println();
        for (int even2 = 2; even2 <=54; even2 +=2){
            System.out.print(even2 + " ");
        }
    }
}
