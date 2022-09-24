package CodeRobot;

import java.awt.*;
import java.awt.Robot;

public class Robocop {
    public static void main(String[] args) throws AWTException, InterruptedException {

        Robot r = new Robot();


        //clicking to wifi sign
        RobotUtility.click(r, 1207, 747);
        Thread.sleep(1000);

        //clicking to first wifi in list
        RobotUtility.click(r ,1180, 365);
        Thread.sleep(1000);

        //clicking to connect button
        RobotUtility.click(r, 1280, 474);
        Thread.sleep(1000);

        //clicking to enter password field
        RobotUtility.click(r, 1090, 204);
        Thread.sleep(1000);

        //entering password
        RobotUtility.sendKeys( r, "07616259");



        //clicking to enter password field
        RobotUtility.click(r, 1170, 343);
        Thread.sleep(1000);

        //accept yes
        RobotUtility.click(r, 1170, 376);
        RobotUtility.takeAndSave_Screenshot(r);
        Thread.sleep(1000);

        //random click somewhere
        RobotUtility.click(r, 713, 333);


    }
}
