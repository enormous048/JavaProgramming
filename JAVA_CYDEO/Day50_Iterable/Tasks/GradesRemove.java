package Day50_Iterable.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class GradesRemove {
    public static void main(String[] args) {


        ArrayList<Integer> allGrades = new ArrayList<>(Arrays.asList(48, 55, 69, 89, 94, 93, 67, 52, 81, 79, 99));

        ArrayList<Integer> excellent = new ArrayList<>( allGrades );
        ArrayList<Integer> great = new ArrayList<>( allGrades );
        ArrayList<Integer> good = new ArrayList<>( allGrades ) ;
        ArrayList<Integer> poor = new ArrayList<>( allGrades );

        Iterator<Integer> it = excellent.iterator();
        while (it.hasNext()){
            if (it.next() <=90){
                it.remove();
            }
        }
        Iterator<Integer> it2 = great.iterator();
        while( it2.hasNext()){
            int grade = it2.next();
            if (grade <80 ||grade >= 90){ //не може одночасно чило бути менше 80 і більше 90 тому OR
                it2.remove();
            }
        }
        Iterator<Integer> it3 = good.iterator();
        while (it3.hasNext()){
            int grade = it3.next();
            if (grade< 70 || grade>=80){
                it3.remove();
            }
        }
        Iterator<Integer> it4 = poor.iterator();
        while (it4.hasNext()){
            int grade = it4.next();
            if (grade<60 || grade>=70){
                it4.remove();
            }
        }


        System.out.println("allGrades = " + allGrades);
        System.out.println("excellent = " + excellent);
        System.out.println("great = " + great);
        System.out.println("good = " + good);
        System.out.println("poor = " + poor);

    }
}
