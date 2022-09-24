package Day20_Array;

public class Avarage {


    public static void main(String[] args) {

        int[] av = {10, 8, 8, 5, 8, 8, 9, 89, 6, 3};

        int avarage = 0;

        for (int i = 0; i <= av.length-1; i++) {
            avarage += av[i];
        }

        System.out.println(avarage/av.length);

    }
}
