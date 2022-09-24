package Day17_Branching_While_Do;

public class LoopsPractice {
    public static void main(String[] args) {


        for (int i = 1; i <=10; i++) {
            System.out.println(i);
        }


        int j = 1;
        while (j <=10){
            System.out.println(j);
            j++; //інкремент має стояти вкінці інакше спочатку додасть 1 а потім запринтує і вже вийде 2
        }


        int k =1;
        do {
            System.out.println(k);
            k++;
        }while (k <= 10);
    }

}
