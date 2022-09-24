package Day11_Switch.Day11_Task;

public class Browser {
    public static void main(String[] args) {

        String browser = "chrome";
        String result = "";


        switch (browser) {
            case "chrome":
            case "opera":
            case "safari":
            case "firefox":
                result = browser;
                break;

            default:
                result = "Invalid browser";

        }

        System.out.println(result);
    }
}

