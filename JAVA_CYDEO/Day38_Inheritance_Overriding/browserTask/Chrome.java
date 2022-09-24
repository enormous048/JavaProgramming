package Day38_Inheritance_Overriding.browserTask;

public class Chrome extends Browser{

    @Override
    public void openBrowser(){
        System.out.println("Opening Chrome browser");
    }

    public void closeBrowser(){
        System.out.println("Closing Chrome browser.");
    }

}
