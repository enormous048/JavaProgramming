package Day21_Utility_ForEach;


import java.util.Arrays;

public class ArrayUtility2 {
    public static void main(String[] args) {

        //copyOf(array, newLength)  стартує від нульового індексу //написав 3 в новій ленз і воно від 0 до 2 зкопіює
        String[] students = {"Naz", "Maria", "Andrew", "Roman", "Yarik", "Yana"};

        String[] str2 = Arrays.copyOf( students, 3 ); // 0~2
        System.out.println(Arrays.toString(str2));



        //copyOfRange(array, begin index, last index)
        String[] str3 = Arrays.copyOfRange(students, 2, 4+1); //останні індекс як і в сабстрінг екслудед
        System.out.println(Arrays.toString(str3));

        String[] str4 = Arrays.copyOfRange(students, 2, students.length);
        System.out.println(Arrays.toString(str4));
    }
}
