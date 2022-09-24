package Day16_ForLoop2.Day16_Task;

public class CatDog {
    public static void main(String[] args) {
        String dogCat = "CaT dog Dog caT".toLowerCase();

        String catTimes = "";
        String dogTimes = "";

        for (int i = 0; i <= dogCat.length()-1; i++) {
            if (dogCat.charAt(i) == 'd'){
                dogTimes += dogCat.charAt(i);
            }

            if (dogCat.charAt(i) == 'c'){
                catTimes += dogCat.charAt(i);
            }
        }

        System.out.println();
        System.out.println("Dog appears the same number of times as Cat? " + (catTimes.length() == dogTimes.length()) );

    }
}
