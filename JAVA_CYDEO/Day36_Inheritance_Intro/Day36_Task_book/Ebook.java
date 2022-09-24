package Day36_Inheritance_Intro.Day36_Task_book;

public class Ebook extends Book{

    public String size;
    public int pages;


    public Ebook(String title, String type, String author, int price, String size, int pages) {
        super(title, type, author, price);
        this.size = size;
        this.pages = pages;
    }

    public void readBook(){
        System.out.println("You opened tablet and reading "+ title);
    }
}
