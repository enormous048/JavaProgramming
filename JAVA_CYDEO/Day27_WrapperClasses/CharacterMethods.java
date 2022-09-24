package Day27_WrapperClasses;

public class CharacterMethods {
    public static void main(String[] args) {

        //isDigit() -- returns true if a char is a digit
        //isLatter() -- returns true if a char is a latter

        //is special char
        char ch = '@';
        boolean b = Character.isDigit(ch);

        boolean s = !Character.isLetterOrDigit(ch); //returns true if char is special char


        //isLowerCase()
        //isUpperCase()


        String str = "sss1dd4nn5dss8";
        int sum = 0;
        for (int i = 0; i <= str.length()-1; i++) {
            if (Character.isDigit(str.charAt(i))){
                sum += Integer.parseInt(""+str.charAt(i));
            }
        }
        System.out.println(sum);

        //OR

        int num2 = 0;
        for( char i : str.toCharArray()){
            if (Character.isDigit(i)){
                num2+= Integer.parseInt(""+i);
            }
        }
    }
}
