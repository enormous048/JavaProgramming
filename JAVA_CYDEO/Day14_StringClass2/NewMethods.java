package Day14_StringClass2;

public class NewMethods {
    public static void main(String[] args) {
        // trim()  removes spaces в стрінгу зпереду і ззаду керектерів, але якшо є два слова в стрінгу і між ними спейси то ці спейси не буде чіпати

        String trim = "    Hello   Bro    ";
        trim = trim.trim(); //так само як в туаппер кейс треба заново ініціалізувати бо стрінг імютабл

        System.out.println(trim);


        // indexOf()  вводиш керектер і цей метод показує під яким індексом він стоїть в стрінзі
        String index = "Cydeo school";
        int n1 = index.indexOf("h"); //'h'  теж можна
        System.out.println(n1);

        int n2 = index.indexOf("ool"); //якби написав просто о  то він би вивів перше попавше о, а нам треба то шо в скул
                                       //тому шоб специфікувати ми шукаємо ool а виводить воно індекс першої літери в ool - а саме перше о



        //lastIndexOf()  починає шукати зправа але вводиш керектери в методі в правильному порядку воно просто з іншої сторони починає рахувати а так все так само лишається
        String str = "Java Cava";
        int n3 = str.lastIndexOf("Ca") + 1;  //аутпут індекс оф це інтежер так шо можа добавити + 1 шоб а вивести


    }

}
