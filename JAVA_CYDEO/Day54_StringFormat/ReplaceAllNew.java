package Day54_StringFormat;

public class ReplaceAllNew {

    public static void main(String[] args) {
        String s = "243567859607";

        s = s.replaceAll("[0-4]", "0").replaceAll("[5-9]", "1");

        //  [  ]  якшо вставляєш квадратні дужки в реплейс метод, то всі чари в даному діапазоні можна замінити.
        //  '0', '1', '2', '3', '4'


    }
}
