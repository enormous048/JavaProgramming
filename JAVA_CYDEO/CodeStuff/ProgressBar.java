package CodeStuff;

public class ProgressBar {
    private String lastLine = "";

    public void print(String line) {
        //clear the last line if longer
        if (lastLine.length() > line.length()) {
            String temp = "";
            for (int i = 0; i < lastLine.length(); i++) {
                temp += " ";
            }
            if (temp.length() > 1)
                result = "\r" + temp;
        }
        result = "\r" + line;
        lastLine = line;
    }

    private byte anim;
    String result = "";

    public void animate(String line) {
        switch (anim) {
            case 1:
                result = "[ \\ ] " + line;
                break;
            case 2:
                result = "[ | ] " + line;
                break;
            case 3:
                result = "[ / ] " + line;
                break;
            default:
                anim = 0;
                result = "[ - ] " + line;
        }
        anim++;
    }

    /*public static void main(String[] args) throws InterruptedException {
        ConsoleHelper consoleHelper = new ConsoleHelper();
        for (int i = 0; i < 20; i++) {
            consoleHelper.animate(i + "");
            //simulate a piece of task
            Thread.sleep(400);
        }
    }*/
}
