package CodeStuff;


import java.time.LocalDateTime;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.time.LocalDate;

public class PassUnlock {
    public static Integer random(int min, int max){
        Integer result = (int) (Math.random()*(max - min + 1)) + min;
        return result;
    }
    public static String randomWord(int length){
        String result = "";
        List<Character> list = new ArrayList<>();


        for (char ch = 'a'; ch<= 'z'; ch++){
            list.add(ch);
        }

        for (int i = 1; i<= length; i++){
            result+= ""+list.get( random(0, list.size()-1) );
        }

        return result;
    }

    public static void main(String[] args) {
        String password = "nazar";
        HashSet<String> wrongPasswords = new HashSet<>();
        int count = 0;


        System.out.println("Jailbreak started in: "+ LocalTime.now());
        System.out.println();
        while (true){
            String attempt = randomWord(5);


            if (!wrongPasswords.contains(attempt)) {
                if (!attempt.equals(password)) {
                    count++;
                    wrongPasswords.add(attempt);
                }
                if (attempt.equals(password)) {
                    count++;
                    System.out.println("Your password is: " + attempt + "\nEnded in: " + LocalTime.now() + "\nTotal attempts: " + count);
                    break;
                }
            }
        }







    }
}
