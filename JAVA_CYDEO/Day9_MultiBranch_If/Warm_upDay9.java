package Day9_MultiBranch_If;

public class Warm_upDay9 {
    public static void main(String[] args) {
        int a = 100,
                b = 400,
                c = 970;

        boolean aIsMedian = (a > b && a < c) || (a > c && a < b);
        boolean bIsMedian = (b > a && b < c) || (b > c && b < a);
        boolean cIsMedian = (c > a && c < b) || (c > b && c < a); // or !aIsMedian && !bIsMedian;

        if(aIsMedian){
            System.out.println(a + " is median number");
        }else if (bIsMedian){
            System.out.println(b + " is median number");
        }else if (cIsMedian){
            System.out.println(c + " is median number");
        }


    }


}
