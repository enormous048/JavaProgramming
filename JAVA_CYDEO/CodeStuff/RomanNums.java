package CodeStuff;

public class RomanNums {
    public static void intToRoman(int num) {
        System.out.println("Integer: " + num);

        //ставиш два ерреї які кореспондуються
        int[] values =          {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] romanLetters = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        String roman = "";

        for (int i = 0; i < values.length; i++) { //зафіксовує число з еррею

            while (num >= values[i]) { //якшо задане число більше за число з еррею значить віднімаєм від заданого числа число з еррею; і конкатенуєм кореспондуюче римське число
                                       //далі вайл луп згортається бо нове число вже менше за ерреївське - і фор луп зафіксовує нові числа з еррею
                num = num - values[i];
                roman += romanLetters[i];
            }
        }
        System.out.println("Corresponding Roman Numerals is: " + roman);
    }
    public static void main(String args[]) {
        intToRoman(125);
        intToRoman(252);
        intToRoman(100000);
        intToRoman(1010);
    }
}

