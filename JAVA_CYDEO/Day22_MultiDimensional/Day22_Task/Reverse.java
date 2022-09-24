package Day22_MultiDimensional.Day22_Task;

public class Reverse {
    public static void main(String[] args) {

        String[] batch24Group1 = {"Fuat", "Kenann", "Aliya", "Anna", "Murodil"};
        String[] batch24Group2 = {"Layla", "Oksana", "Tyler", "Murodil"};
        String[] batch24Group3 = {"Chris", "Yurii", "Mubarek", "Erika", "Subi", "Nadiia", "Murodil"};

        String[][] arr = new String[3][];
        arr[0] = batch24Group1;
        arr[1] = batch24Group2;
        arr[2] = batch24Group3;

        for (int i = 0; i <= arr.length-1; i++) {

            for (int j = arr[i].length-1; j >= 0 ; j--) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();// to divide
        }


    }
}
