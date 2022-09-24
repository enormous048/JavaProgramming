package Day42_Exceptions_Throw;

public class WarmUp {

    public static void main(String[] args) {

        for (int i = 1; i <= 30; i++) {
            System.out.print( "\r"+"You did "+i + " push-ups!");
            try {
                Thread.sleep(1500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }

        System.out.println();
        for (int i = 1; i <= 30; i++) {
            System.out.print("\r"+"You did "+ i + " pull-ups!");
            try {
                Thread.sleep(2500);
            } catch (InterruptedException e) {
                System.out.println(e.getMessage());
            }
        }



    }

    public static void sleep(double second){ //замість того щоб весь час писати трай кетч можна визвати цей метод де вже що разу трай кетч автоматично

        //але якби тут було throws а не трай кетч, то ми би всерівно мали хендлити ексепшн,
        //тому коли треба колити методи то найліпше юзати трай кетч.
        try {
            Thread.sleep((long)(second*1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
