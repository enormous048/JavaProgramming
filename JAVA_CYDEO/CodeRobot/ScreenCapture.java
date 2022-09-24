package CodeRobot;


import javax.imageio.ImageIO;
import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class ScreenCapture {

    public static void main(String[] args) {

        try {

            Robot robot = new Robot();
            LocalDateTime time = LocalDateTime.now();


            // Capture a particular area on the screen

            int x = 50;

            int y = 50;

            int width = 250;

            int height = 250;

            Rectangle area = new Rectangle(x, y, width, height);

            BufferedImage bufferedImage = robot.createScreenCapture(area);

            // Write generated image to a file

            try {

                // Save as PNG

                File file = new File("C:\\Users\\nazar_000\\IdeaProjects\\JavaProgramming\\JAVA_CYDEO\\CodeRobot\\screenshots\\screenshot_"+time+".png");

                ImageIO.write(bufferedImage, "png", file);

            } catch (IOException e) {

                System.out.println("Could not save small screenshot " + e.getMessage());

            }




            // Capture the whole screen

            area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());

            bufferedImage = robot.createScreenCapture(area);

            // Write generated image to a file

            try {

                // Save as PNG

                File file = new File("C:\\Users\\nazar_000\\IdeaProjects\\JavaProgramming\\JAVA_CYDEO\\CodeRobot\\screenshots\\screenshot_"+time+".png");

                ImageIO.write(bufferedImage, "png", file);

            } catch (IOException e) {

                System.out.println("Could not save full screenshot " + e.getMessage());

            }

        } catch (AWTException e) {

            System.out.println("Could not capture screen " + e.getMessage());

        }

    }
}