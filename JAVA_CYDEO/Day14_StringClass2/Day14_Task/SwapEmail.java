package Day14_StringClass2.Day14_Task;

import java.util.Scanner;

public class SwapEmail {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String str = scan.next();
        


        if (str.contains("_")){
            String subStr = str.substring( 0, str.indexOf("_") );
            String subStr2 = str.substring( str.indexOf("_")+1, str.lastIndexOf("@"));

            //str = str.replace(subStr +"_"+ subStr2, subStr2 + "_"+ subStr);

            //OR

            String temporal = str;
            str = str.replaceFirst(subStr2, subStr);
            str = str.replaceFirst(subStr, temporal.substring(temporal.indexOf("_")+1, temporal.lastIndexOf("@")));


        } else if (!str.contains("_")) {
            str = str;
        }

        System.out.println(str);

    }
}
