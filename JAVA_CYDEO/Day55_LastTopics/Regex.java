package Day55_LastTopics;

import java.util.Arrays;

public class Regex {
    public static void main(String[] args) {

        //https://www.javatpoint.com/java-regex

        //Wild cards:    . single any character
        //               * 0 characters or group of any charachers
        //   ".a."  -- dad, pat, fat..
        //   "*a*"  -- contains a
        // .*[0-9].*  str.matches(".*[0-9].*")    -- returns true if string contains digits



        //To split a string by newline, call the split() method passing it the following
        //regular expression as parameter '\r?\n|\r' which splits on all three '\r\n' , '\r' , and '\n' .

        String str = "java\npython\nruby";

        String[] arr = str.split("\r?\n|\r");
        for (String s : arr) {
            System.out.println("s = " + s);
        }



        //Separator is removing:  від а до Я плюс спейс
        String str2 = "Nazar -- Назар Olena -- Олена Pizda -- Пізда";
        String[] arr2 = str2.split("[а-яА-Я] ");
        for (String s2 : arr2) {
            System.out.println("s2 = " + s2);
        }


        //Separator is not removing.
        String str3 = "Nazar -- Назар Olena -- Олена Pizda -- Пізда";

        //Splits by:
        // 1)  (?<=[а-я])   якшо ззаду йдуть в а до я НЕ забираючи ті задні
        // 2)  \\s          спейс чар забираючи його
        // 3)  (?=[A-Z])    якшо спереду йдуть апперкейс від A до Z НЕ забираючи їх
        //Плюс це все скомбіновано

        String[] arr3 = str3.split("(?<=[а-я])\\s(?=[A-Z])");
        for (String s3 : arr3) {
            System.out.println("s3 = " + s3);
        }

        //string1.replace("-", "#-").split("#");



    /*

        To explain this, I will first show you a different split operation:

        "Ram-sita-laxman".split("");
        This splits your string on every zero-length string. There is a zero-length string between every character. Therefore, the result is:

        ["", "R", "a", "m", "-", "s", "i", "t", "a", "-", "l", "a", "x", "m", "a", "n"]
        Now, I modify my regular expression ("") to only match zero-length strings if they are followed by a dash.

        "Ram-sita-laxman".split("(?=-)");
        ["Ram", "-sita", "-laxman"]
        In that example, the ?= means "lookahead - спереду". More specifically, it mean "positive lookahead".


        Why the "positive"? Because you can also have negative lookahead (?!) which will split on every zero-length string that is not followed by a dash:
        "Ram-sita-laxman".split("(?!-)");
        ["", "R", "a", "m-", "s", "i", "t", "a-", "l", "a", "x", "m", "a", "n"]





        You can also have positive lookbehind (?<=) which will split on every zero-length string that is preceded by a dash:
        "Ram-sita-laxman".split("(?<=-)");
        ["Ram-", "sita-", "laxman"]


        Finally, you can also have negative lookbehind (?<!) which will split on every zero-length string that is not preceded by a dash:

        "Ram-sita-laxman".split("(?<!-)");
        ["", "R", "a", "m", "-s", "i", "t", "a", "-l", "a", "x", "m", "a", "n"]
        These four expressions are collectively known as the lookaround expressions.





        Bonus: Putting them together
        I just wanted to show an example I encountered recently that combines two of the lookaround expressions.
        Suppose you wish to split a CapitalCase identifier up into its tokens:

        "MyAwesomeClass" => ["My", "Awesome", "Class"]
        You can accomplish this using this regular expression:

        "MyAwesomeClass".split("(?<=[a-z])(?=[A-Z])");
        This splits on every zero-length string that is preceded by a lower case letter ((?<=[a-z])) and followed by an upper case letter ((?=[A-Z])).

        This technique also works with camelCase identifiers.
    */
    }

}
