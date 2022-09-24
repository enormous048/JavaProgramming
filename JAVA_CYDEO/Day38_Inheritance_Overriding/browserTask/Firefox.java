package Day38_Inheritance_Overriding.browserTask;

public class Firefox extends Browser{

    @Override
    public void openBrowser(){
        System.out.println("Opening Firefox browser");
    }
    public void closeBrowser(){
        System.out.println("Closing Firefox browser.");
    }
}
