package Day16_ForLoop2;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter name");
        String sss = scan.nextLine();
        String result = "";

        for (int i = sss.length()-1; i >= 0; i--){ //я поняв чому првильно вибиває, бо лендз рахує не від нуля а від одиниці,
                                                   //тому коли написав мінус 1 то він почав правильний індекс казати
                                                   //то так само як в методі чар ет є ленз мінус1
            result += sss.substring(i, i +1);
            //або
            //result += sss.charAt(i); //спустя кожну ітерацію резулт додає до своєї велью все нові і--
        }
        System.out.println(result);
    }
}
