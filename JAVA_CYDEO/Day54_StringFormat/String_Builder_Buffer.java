package Day54_StringFormat;

public class String_Builder_Buffer {
    public static void main(String[] args) {

        String str = "Wooden";
        str = str.concat(" spoon");  //if you do not reassign than original string won't change




        //StringBuilder is a mutable version of a String. Can only create by new keyword.
        //Is not synchronized, not thread-safe.

        StringBuilder b = new StringBuilder("Java");
        b.append(" programming");  //here you dont need to reassign because StringBuilder is mutable




        //StringBuffer is a mutable version of a String. Can only create by new keyword.
        //Is synchronized, thread safe.

        StringBuffer buf = new StringBuffer("SQL");
        buf.append(" programming"); //here you dont need to reassign because StringBuilder is mutable




        //ps return new String(employed+""+vacation).equals("truefalse");   апроач шоб швидше робити такі штуки
    }
}
