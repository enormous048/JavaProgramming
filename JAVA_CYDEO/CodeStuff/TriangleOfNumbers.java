package CodeStuff;

public class TriangleOfNumbers {

    /*
  Given the triangle of послідовних odd numbers:

             1
          3     5
       7     9    11
   13    15    17    19
21    23    25    27    29

Calculate the sum of the numbers in the last row of this triangle

Хз чому але якшо номер останнього ряду помножити три рази до вибє суму останнього ряду
   */
    public static void main(String[] args) {

        int row = 5;
        int quantity = 0;
        for(int i = 1; i<= row; i++){
            quantity += i;
        }
        System.out.println(quantity);


        int allSum = 1;
        int finalSum = 1;
        for(int i = 1; i< quantity; i++){
            allSum = allSum+2;
            finalSum+=allSum;
        }
        System.out.println(finalSum);


        int leftSum = 1;
        int finalLeft = 1;
        int quantity2 = quantity - row;
        for(int i = 1; i< quantity2; i++){
            leftSum = leftSum+2;
            finalLeft+=leftSum;
        }
        System.out.println(finalLeft);

        System.out.println(finalSum-finalLeft);


    }
}
