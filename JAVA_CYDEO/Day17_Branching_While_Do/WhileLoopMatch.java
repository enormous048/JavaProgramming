package Day17_Branching_While_Do;

public class WhileLoopMatch {
    public static void main(String[] args) {

        String str = "JavaJava0-09JavaJava";
        int freqOfWord = 0;

        while (str.contains("Java")){
            str = str.replaceFirst("Java", "");
            freqOfWord++;
        }
        System.out.println(freqOfWord);
    }
}
