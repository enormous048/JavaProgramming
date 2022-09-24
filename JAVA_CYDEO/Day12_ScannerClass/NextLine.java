package Day12_ScannerClass;

import java.util.Scanner;
public class NextLine {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your age");
        int age = scan.nextInt();

        scan.nextLine();
        System.out.println("Press your name");
        String name = scan.nextLine();

        System.out.println("Enter your zipcode");
        int zipcode = scan.nextInt();

        System.out.println("Enter your birthday");
        int birth = scan.nextInt();

        scan.nextLine();
        System.out.println("Enter country name");
        String schoolName = scan.nextLine();


        scan.close();

        //Висновок якшо перед некстлайн юзаєш любі інші методи сканера то всі ті ентери зберігаються в памяті сканера і лтше некстлайн буде їх читати.
        //Щоб це виправити постав ше одну некст лайн перед основною некст лайн to capture that Enter

        //якшо ставиш nextLine то він читає попередній Enter який залишився після інтежера,(адже nextInt не здатен той ентер прочитати а отже той ентер залишається в памят сканера)
        //-- а отже ту лінійку що нова внизу він вже не прочитає.


    }
}
