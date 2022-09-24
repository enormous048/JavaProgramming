package Day24_CustomMethod_Return;

public class ReturnMethodIntro {

    public static int maxNum(int first, int last){

        int max = 0;
        if (first > last){
            max = first;
        }else {
            max = last;
        }
        return max;

    }

    public static void main(String[] args) {

        int maxNumber = maxNum(120, 230);

        System.out.println(maxNumber * 2);

    }
}
