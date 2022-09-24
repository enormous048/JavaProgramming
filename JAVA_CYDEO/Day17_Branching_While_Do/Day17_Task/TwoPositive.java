package Day17_Branching_While_Do.Day17_Task;

public class TwoPositive {
    public static void main(String[] args) {
        int first = 21;
        int second = 3;

        int loopCount = 0;

        //скільки раз від 21 вийде відняти три таким буде результат ділення
        while (first>=second){

            first -= second;
            loopCount++;

        }

        System.out.println(loopCount +" with the remainder of "+ first);//все шо лишилось від фирст то і буде рімейндером


    }
}
