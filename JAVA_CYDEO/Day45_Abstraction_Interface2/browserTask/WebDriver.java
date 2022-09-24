package Day45_Abstraction_Interface2.browserTask;

public interface WebDriver extends SearchContext{

    void get(String url);
    void close();
    void quit();
    void getTitle();

}
