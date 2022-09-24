package Day14_StringClass2;

public class NewMethods2 {
    public static void main(String[] args) {
        // replace()
        String str = "Java is fun, I love Java";
        str = str.replace("Java", "Python");

        System.out.println(str);


        String str2 = "Java  is fun,  I  love  Java";
        str2 = str2.replace("Java", "").replace("  ", " ");//Ріплейсим два спейси одним
                                      //пустий стрінг просто стирає ті слова
        System.out.println(str2);


        // replaceFirst()
        String str3 = "Java is fun, I love Java";
        str3 = str3.replaceFirst("Java", "Python"); //реплейсить хіба першу попавшу метчку
        System.out.println(str3);




    }
}
