package Day28_ArrayList;

public class StrongPass2 {

    public static void main(String[] args) {


        String str = "Zopiro_60";



        boolean r1 = str.length()>=8 && !str.contains(" ");
        int hasDigit = 0;
        int hasSpecial = 0;
        int hasUpper = 0;
        int hasLower = 0;



        for (int i : str.toCharArray()) {

            //Можна і через елс іф писати бо не може один чар одночасно бути і апперкей і ловеркейс і диджит
            if (Character.isDigit(i)){
                hasDigit += 1;
            }
            else if (Character.isUpperCase(i)){
                hasUpper++;
            }
            else if (Character.isLowerCase(i)){
                hasLower++;
            }
            else{
                hasSpecial++;
            }

        }

        if (hasDigit>=1 && hasLower>=1 && hasSpecial>=1 && hasUpper>=1 && r1){
            System.out.println(str + " - is strong password");
        } else {
            System.out.println(str + " - is not strong password");
        }
    }
}
