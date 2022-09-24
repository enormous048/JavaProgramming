package Day27_WrapperClasses.Day27_Tasks;

public class Retrieve {

    public static void main(String[] args) {
        String str = "WoodenSpoon2!!!";
        String letter = "";
        String digit = "";
        String special = "";


        for (int i = 0; i <= str.length()-1; i++) {
            if (Character.isLetter(str.charAt(i))){
                letter+= ""+str.charAt(i);
            }

            if (Character.isDigit(str.charAt(i))){
                digit+=""+str.charAt(i) + " ";
            }

            if (!Character.isLetterOrDigit(str.charAt(i))){
                special+= ""+str.charAt(i);
            }
        }
        System.out.println("letter = " + letter);
        System.out.println("digit = " + digit);
        System.out.println("special = " + special);

    }
}
