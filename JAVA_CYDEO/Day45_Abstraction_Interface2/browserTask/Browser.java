package Day45_Abstraction_Interface2.browserTask;

public class Browser implements WebDriver, TakeScreenShot, JavaScriptExecuter{

    private String browserName;

    public Browser(String browserName) {
        setBrowserName(browserName);
    }

    public String getBrowserName() {
        return browserName;
    }

    public void setBrowserName(String browserName) {
        if (browserName.isEmpty()){
            throw new RuntimeException("Invalid browser name");
        }
        this.browserName = browserName;
        System.out.println("Opening " +browserName+ " browser!");
    }



    @Override
    public void executeScript(String script) {
        System.out.println("Executing: " + script+ " on" + browserName +" browser.");


    }

    @Override
    public void findElement(String locator) {

        System.out.println(browserName+" driver is locating an element by " + locator);
    }

    @Override
    public void findElements(String locator) {
        System.out.println(browserName+" driver is locating elements by " + locator);

    }

    @Override
    public void takeScreenShot() {
        System.out.println("Taking screenshot on: "+ browserName+ " browser.");

    }

    @Override
    public void get(String url) {
        System.out.println("Getting the "+url+" on " + browserName + " browser");

    }

    @Override
    public void close() {
        System.out.println("Closing the tab "+ browserName+ " browser.");

    }

    @Override
    public void quit() {

        System.out.println("Quiting "+ browserName+ " browser.");
    }

    @Override
    public void getTitle() {
        System.out.println(browserName+ " diver is getting the title.");

    }
}
