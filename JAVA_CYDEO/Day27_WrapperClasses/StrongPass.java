package Day27_WrapperClasses;

public class StrongPass {

    public static void main(String[] args) {



        String str = "Zopiro_60";



        boolean r1 = str.length()>=8 && !str.contains(" ");
        boolean hasDigit = false;
        boolean hasSpecial = false;
        boolean hasUpper = false;
        boolean hasLower = false;



        for (int i : str.toCharArray()) {

            //Можна і через елс іф писати бо не може один чар одночасно бути і апперкей і ловеркейс і диджит
            if (Character.isDigit(i)){
                hasDigit = true;
            }
            if (Character.isUpperCase(i)){
                hasUpper = true;
            }
            if (Character.isLowerCase(i)){
                hasLower= true;
            }
            if (!Character.isLetterOrDigit(i)){
                hasSpecial = true;
            }
        }

        if (hasDigit && hasLower && hasSpecial && hasUpper && r1){
            System.out.println(str + " - is strong password");
        } else {
            System.out.println(str + " - is not strong password");
        }

    }

}
