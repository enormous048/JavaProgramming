package Day10_Ternaries.Day10_Task;

public class Bigg {
    public static void main(String[] args) {
        int n1 = 100;
        int n2 = 300;
        int n3 = 890;

        String result = (n1 > n2 && n1 > n3)? "n1 is the biggest" :(n2 > n1 && n2 > n3)? "n2 is the biggest" : "n3 is the biggest";

        System.out.println(result);

    }
}
