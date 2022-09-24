package Day20_Array;

public class DaysOfWeek {
    public static void main(String[] args) {
        String[] days = {"Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday", "Sunday"};

        int num = 6;

        if (num>0 && num<8){
            System.out.println(days[num-1]); // мінус 1 бо по індексу субота буде 5
        }


        System.out.println(days[days.length-1]);//To find value in last index
        days[days.length-1] = "Sunday";        //Or to instantiate



        for (int i = days.length-1; i >= 0; i--) {
            System.out.println(days[i]);
        }
    }
}
