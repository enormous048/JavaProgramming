package Day45_Abstraction_Interface2.browserTask;

import java.util.*;

public class BrowserObjects {
    public static void main(String[] args) {

        Safari s = new Safari(); //в сеттері поставив принт після this. хотя можна і вконстракторі тож поставити адже це тож метод як і всі інші

        s.findElement("id444");
        s.executeScript("myScript");
        s.getTitle();
        s.close();
        s.quit();


        Browser b1 = new Safari();
        b1.executeScript("javaScript");

        ( (Safari)b1 ).quit();

        Browser b2 = new Chrome();
        ( (Chrome)b2 ).close();


        //тут всі методи є в перент класі, але якшо тобі треба якись унікальний метод який є в чайлді то треба кастити
        List<Integer> list = new Stack<>();
        //list.pop();
        ( (Stack)list ).pop();

        List<Integer> list2 = new LinkedList<>();
        //list2.poll();
        ( (LinkedList)list2 ).poll();



    }
}
