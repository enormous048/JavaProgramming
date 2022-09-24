package Day20_Array.Day20_Task;

import java.util.Arrays;

public class Zero {
    public static void main(String[] args) {

        int[] array = {10, 0, 5, 0, 1, 0};
        int[] newArray = new int[array.length];

        for (int i = 0; i <= array.length - 1; i++) {

            for (int j = 0; j <= array.length-1; j++) {

                if (newArray[j] > 0) {//якшо в новому ерреї вже є більше нуля десь то луп пропускається і нові цифри не додаються
                    continue;
                } else if (array[i] > 0) {
                    //якшо перша ыфка не правдива, то наступна цифра яка більша за ноль в старому ерреї додастся в новйи еррей в наступний індекс
                    newArray[j] = array[i];
                    break; //Завдяки брейк вcі j не будуть далі запихатись лише перша j
                }

            }
        }
        System.out.println(Arrays.toString(newArray));
    }

    //ОБнова є метод sort() тому тут можна було викликати його і потім реверс зробити
}
