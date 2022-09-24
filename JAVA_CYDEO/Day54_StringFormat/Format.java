package Day54_StringFormat;

public class Format {

    public static void main(String[] args) {


        // %d  stands for digits without .  int, long, short, byte
        // %s  stands for string
        //
        // %f   float, double
        // %b	boolean
        // %c	char
        // %%	Символ %

        String text = String.format("age = %d , salary = %d , yearOfBirth = %d", 18, 92000, 2004);
        System.out.println(text);

        float num = 42.424242f;
        System.out.println(String.format("num = %.2f", num));
        System.out.printf("num = %.2f", num); //принтф  це то саме шо стрінг формат, просто без веріабл зразу принтує
        //робим так шоб хіба два числа після крапки було, і вони будуть округлені


        int num2 = 69;
        System.out.println(String.format("%5d", num2));
        // 5 вказує довжину строки, якшо довжина num2 два, то додасть ше три спейси


        int num3 = 69;
        System.out.println(String.format("%05d", num3));
        // 5 вказує довжину строки, якшо довжина num3 два, то додасть ше три нуля(інші чари крім нуля не додає)


        // using signs before numbers
        String result = String.format("%+d", 55); // +55
        System.out.println(result);

    }

}
