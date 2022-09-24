package Day36_Inheritance_Intro.Day36_Task_book;

public class AudioBook extends Book {
    public int length;
    public char narrator;


    public AudioBook(String title, String type, String author, int price, int length, char narrator) {
        super(title, type, author, price);
        this.length = length;
        this.narrator = narrator;
    }
    public void listen(){
        System.out.println("You are listening audiobook " + title);
    }
}
