package CodeStuff;

import java.util.Scanner;

public class MyRomanNums {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        String subN = String.valueOf(n);
        String roman = "";
        String thousands = "";

        try {
            thousands = subN.substring(0, subN.length() - 3);
        }catch (IndexOutOfBoundsException e){}
        String hundreds = "";
        try {
            hundreds = subN.substring(subN.length() - 3, subN.length() - 2);
        }catch (IndexOutOfBoundsException e){}
        String tens = "";
        try {
            tens = subN.substring(subN.length() - 2, subN.length() - 1);
        }catch (IndexOutOfBoundsException e){}
        String ones = "";
        try {
            ones = subN.substring(subN.length() - 1);
        }catch (IndexOutOfBoundsException e){}


        try {
            for (int i = 1; i <= Integer.valueOf(thousands); i++) {
                roman += "M";
            }
        }catch (RuntimeException e){}

        try {
            if ((Integer.valueOf(hundreds) != 0)) {
                if (Integer.valueOf(hundreds) == 9) {
                    roman += "CM";
                } else if (Integer.valueOf(hundreds) == 8) {
                    roman += "DIII";
                } else if (Integer.valueOf(hundreds) == 7) {
                    roman += "DII";
                } else if (Integer.valueOf(hundreds) == 6) {
                    roman += "DI";
                } else if (Integer.valueOf(hundreds) == 5) {
                    roman += "D";
                } else if (Integer.valueOf(hundreds) == 4) {
                    roman += "CD";
                } else if (Integer.valueOf(hundreds) == 3) {
                    roman += "CCC";
                } else if (Integer.valueOf(hundreds) == 2) {
                    roman += "CC";
                } else if (Integer.valueOf(hundreds) == 1) {
                    roman += "C";
                }
            }
        }catch (RuntimeException e){}

        try {
            if ((Integer.valueOf(tens) != 0)) {
                if (Integer.valueOf(tens) == 9) {
                    roman += "XC";
                } else if (Integer.valueOf(tens) == 8) {
                    roman += "LXXX";
                } else if (Integer.valueOf(tens) == 7) {
                    roman += "LXX";
                } else if (Integer.valueOf(tens) == 6) {
                    roman += "LX";
                } else if (Integer.valueOf(tens) == 5) {
                    roman += "L";
                } else if (Integer.valueOf(tens) == 4) {
                    roman += "XL";
                } else if (Integer.valueOf(tens) == 3) {
                    roman += "XXX";
                } else if (Integer.valueOf(tens) == 2) {
                    roman += "XX";
                } else if (Integer.valueOf(tens) == 1) {
                    roman += "X";
                }
            }
        }catch (RuntimeException e){}

        if ((Integer.valueOf(ones) != 0)) {
            if (Integer.valueOf(ones) == 9) {
                roman += "IX";
            } else if (Integer.valueOf(ones) == 8) {
                roman += "VIII";
            } else if (Integer.valueOf(ones) == 7) {
                roman += "VII";
            } else if (Integer.valueOf(ones) == 6) {
                roman += "VI";
            } else if (Integer.valueOf(ones) == 5) {
                roman += "V";
            } else if (Integer.valueOf(ones) == 4) {
                roman += "IV";
            } else if (Integer.valueOf(ones) == 3) {
                roman += "III";
            } else if (Integer.valueOf(ones) == 2) {
                roman += "II";
            } else if (Integer.valueOf(ones) == 1) {
                roman += "I";
            }
        }
        System.out.println(roman);
    }
}
