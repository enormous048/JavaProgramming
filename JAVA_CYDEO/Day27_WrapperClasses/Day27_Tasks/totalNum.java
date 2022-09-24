package Day27_WrapperClasses.Day27_Tasks;

public class totalNum {

    public static void main(String[] args) {
        String java = "JAVA java";
        int countUpper = 0;
        int countLower = 0;

        for (int i = 0; i <= java.length()-1; i++) {

            if (Character.isLowerCase(java.charAt(i))){
                countLower++;
            }
            if (Character.isUpperCase(java.charAt(i))){
                countUpper++;
            }
        }

        if (countLower == countUpper){
            System.out.println(true);
        }else {
            System.out.println(false);
        }



    }


    /*
    Write program that returns true if the total number of upper case characters are equal
    to total number of Lowercase characters of a string
     */
}
