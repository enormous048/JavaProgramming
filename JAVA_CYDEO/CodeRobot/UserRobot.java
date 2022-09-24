package CodeRobot;

import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.BufferedReader;
import java.io.IOException;
import java.nio.Buffer;

public class UserRobot {

    public static void main(String[] args) throws AWTException, IOException, UnsupportedFlavorException {

        Robot robot = new Robot();

        /*
        //clicking on massage input box
        RobotUtility.click(robot, 506, 708);

        //sending keys
        RobotUtility.sendKeys(robot, "Hi, bot");
        RobotUtility.sleep(0.3);

        //pressing send message
        RobotUtility.click(robot, 1048, 705);
        RobotUtility.sleep(0.3);
        */


        String previousClipTextPrevent = "";


        while (true) {
            //right click to copy later
            RobotUtility.rightClick(robot, 192, 652);
            RobotUtility.sleep(100);

            //clicking on copy button
            //single person
            //RobotUtility.click(robot, 269, 524);
            //group
            RobotUtility.click(robot, 286, 462);
            RobotUtility.sleep(100);

            String clipText = "";

            try {
                Clipboard c = Toolkit.getDefaultToolkit().getSystemClipboard();
                clipText = (String) c.getData(DataFlavor.stringFlavor);
            }catch (IOException e){}


            RobotUtility.sleep(250);
            System.out.println(clipText);

            if (clipText.contains("bot") && !clipText.equals(previousClipTextPrevent)) {
                //clicking on massage input box
                RobotUtility.click(robot, 506, 708);
                //sending keys
                RobotUtility.sendKeys(robot, "I'm alive, I'm strong ..");
                RobotUtility.sleep(100);
                //click send message
                RobotUtility.click(robot, 1048, 705);
            } else if (clipText.contains("Nazar") && !clipText.equals(previousClipTextPrevent)) {
                //clicking on massage input box
                RobotUtility.click(robot, 506, 708);
                //sending keys
                RobotUtility.sendKeys(robot, "Nazar no longer exists, I am artificial intelligence");
                RobotUtility.sleep(100);
                //click send message
                RobotUtility.click(robot, 1048, 705);
            }
            if (clipText.contains("break")) {
                break;
            }
            previousClipTextPrevent = clipText;
        }
    }

}
