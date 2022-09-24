package Day21_Utility_ForEach.Day21_Task;

public class JavPyth {
    public static void main(String[] args) {

        String str = "I love java and java is great, but python is easier";
        String[] find = str.split(" ");

        int countJava = 0;
        int countPython = 0;

        for (String s : find) {
            if (s.equals("java")){
                countJava++;
            }
            if (s.equals("python") ){
                countPython++;
            }

        }
        System.out.println("countPython = " + countPython);
        System.out.println("countJava = " + countJava);



    }
}
