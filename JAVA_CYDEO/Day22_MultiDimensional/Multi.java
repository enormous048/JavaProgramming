package Day22_MultiDimensional;

public class Multi {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int[] i : arr) { //для кожного 1d інт еррею(і) в арр -- витягає по одному 1д еррею
            for (int j : i) { //для кожного інт елементу в і(ерреї) -- витягає по одому елементу з 1д еррею
                System.out.println(j);
            }
        }

        for (int i = 0; i <= arr.length-1; i++) {
            for (int j = 0; j <= arr[i].length-1; j++) {
                System.out.println(arr[i][j]);
            }
        }



        int[][] arr2 = {{1,2,3}, {4,5,6}, {7,8,9}};

        for (int i = arr2.length-1; i >= 0 ; i--) { //ерреї в реверсному ордері
            for (int j = 0; j <= arr2[i].length-1; j++) {//елементи в нормльному ордері
                System.out.print(arr2[i][j]+" ");
            }
            System.out.println();
        }


        for (int i = arr2.length-1; i >= 0; i--) { //ерреї в реверсному ордері
            for (int j = arr2[i].length-1; j >= 0; j--) { //елементи ерреїв в реверсному ордері
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

        for (int i = 0; i <= arr2.length-1; i++) { //ерреї в норм ордері
            for (int j = arr2[i].length-1; j >= 0; j--) { //елементи в реверсному
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
