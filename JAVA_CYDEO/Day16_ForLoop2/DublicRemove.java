package Day16_ForLoop2;

public class DublicRemove {
    public static void main(String[] args) {
        String original= "AABBCC";
        
        String newStr = "";

        for (int i = 0; i <= original.length()-1 ; i++) {
            
            if (newStr.contains( ""+original.charAt(i) )){
                newStr = newStr;
            }
            else{
            newStr += original.charAt(i);
            }
        }

        System.out.println("newStr = " + newStr);

    }
}
