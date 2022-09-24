package Day51_Map_Enum;

public class EnumTest {


    public static void main(String[] args) {

        //String browser = "Wooden Spoon";  String accepts everything

        Browser browser = Browser.CHROME;
        //Browser br = Browser.WOODENSPOON;


        switch (browser){
            case OPERA:
                System.out.println("Opera is selected");
                break;

            case SAFARI:
                System.out.println("Safari is selected");
                break;

            case FIREFOX:
                System.out.println("Firefox is selected");
                break;

            default:
                System.out.println("Chrome is selected");  //в дефолті може випасти тільки Хром, бо в енамі більше нич нема


        }

    }
}
