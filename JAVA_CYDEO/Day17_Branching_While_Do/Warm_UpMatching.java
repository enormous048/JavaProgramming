package Day17_Branching_While_Do;

public class Warm_UpMatching {
    public static void main(String[] args) {
        String str = "JavaJava";

        int frequency = 0;
        String wordOfSearch = "Java";

        for (int i = 0; i <= str.length()-4; i++) {//ми відмінусили 4 від лензу щоб не було експшену
                                                   //походу воно ніяк не впливає на результат бо ми знаєм що останнє слово матиме 4 довжину
            String sub = str.substring(i, i + 4);  //типу якшо воно від 5 індекса почне додавати +4 то там outofbound тому зверху максимально поставили довжина мінус4

            if (sub.equals(wordOfSearch)){
                frequency++;
            }
        }
        System.out.println(frequency);
    }
}
//Щераз останній індекс стр = 7;  якшо сабстрінг почне від індексу 5 + 4 вийде еррор бо стр= 01234567
//                               саме тому ми поставили в лупі максимальний індекс 4, бо додавши в сабстрінзі ще одне 4 воно не вибє аут оф бонд

//тому якщо ти додаєш 4 до і, то в той же час треб від довжини в лупі відмінусувати то число



//Щераз ми задали що фінальний луп має бути і <= str.length -1;  == i<= 7
//але коли в сабстрінзі ми вставляєм то і, то коли дійде до індекса 5 , то сабстрінг рендж почне перевищувати саму стрінг

//але нам і непотрібно виходити на 5 якшо знаєм шо довжина того слова шо шукаємо 4, тому відмінусовуєм в лупі стр.ленз()-4
//і в сабстрінзі якраз буде максимально можливе число з довжиною 4