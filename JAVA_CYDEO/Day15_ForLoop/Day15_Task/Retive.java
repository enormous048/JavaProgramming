package Day15_ForLoop.Day15_Task;

public class Retive {
    public static void main(String[] args) {
        String allChars= "$#@abc123";
        String letters = "";
        String digits = "";
        String specialChars = "";

        for (int i = 0; i <= allChars.length()-1; i++) {

            if ( allChars.charAt(i) >= 48 && allChars.charAt(i) <= 57 ){
                digits += allChars.charAt(i); //воно запускає в allChars.charAt(i)  тільки ті варіанти які допущені в іфку, бо воно на ходу то робить
            }

            if ( allChars.charAt(i) >= 'A' && allChars.charAt(i) <= 'Z' || allChars.charAt(i) >= 'a' && allChars.charAt(i) <= 'z') {
                letters += allChars.charAt(i);
            }

            if ( allChars.charAt(i)>= 0 && allChars.charAt(i)<=47 || allChars.charAt(i) >= 58 && allChars.charAt(i) <=64 || allChars.charAt(i) >= 91 && allChars.charAt(i) <= 96 || allChars.charAt(i) >=123){
                specialChars += allChars.charAt(i);
            }
        }
        System.out.println("Lettres: "+letters);
        System.out.println("Digits: "+digits);
        System.out.println("Special characters: "+specialChars);
    }
}

//Розбір: якби я зробив іф елсе то як тільки воно попало в першу іфку то наступну вже автоматично рахує як непраивльну походу і вивело лише диджит спочатку
// правило:  (if - false) then => else if


//Щоб записати ті штуки в принті треба їх +=