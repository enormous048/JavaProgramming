package Day12_ScannerClass;

public class Warm_Up_12 {
    public static void main(String[] args) {
        byte grade = 11;
        String result = "";

        if (grade >= 1 && grade <= 18){
            switch (grade){
                case 1: case 2: case 3: case 4: case 5:
                    result = "Elementary school";
                    break;

                case 6: case 7: case 8:
                    result = "Middle school";
                    break;

                case 9: case 10: case 11: case 12:
                    result = "High school";
                    break;

                case 13: case 14: case 15: case 16:
                    result = "College";
                    break;

                default:
                    result = "Grad school";
                    break;

            }



        }else {
            result = "Invalid grade";

        }

        System.out.println(result);
    }

}
