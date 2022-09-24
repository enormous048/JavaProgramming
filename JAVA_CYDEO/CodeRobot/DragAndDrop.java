package CodeRobot;

import java.awt.*;

public class DragAndDrop {
    public static void main(String[] args) throws AWTException, InterruptedException {


        Robot robot = new Robot();
        RobotUtility.dragAndDrop(robot, 122, 343, 282, 351);
        Thread.sleep(500);


        RobotUtility.doubleClick(robot, 122, 450);
    }
}
