package CodeRobot;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;

public class RobotUtility {

    public static void sendKeys(Robot robot, String str){

        for (int i = 0; i <= str.length()-1; i++){

            switch (str.charAt(i)) {
                case 'a': robot.keyPress(KeyEvent.VK_A); break;
                case 'b': robot.keyPress(KeyEvent.VK_B); break;
                case 'c': robot.keyPress(KeyEvent.VK_C); break;
                case 'd': robot.keyPress(KeyEvent.VK_D); break;
                case 'e': robot.keyPress(KeyEvent.VK_E); break;
                case 'f': robot.keyPress(KeyEvent.VK_F); break;
                case 'g': robot.keyPress(KeyEvent.VK_G); break;
                case 'h': robot.keyPress(KeyEvent.VK_H); break;
                case 'i': robot.keyPress(KeyEvent.VK_I); break;
                case 'j': robot.keyPress(KeyEvent.VK_J); break;
                case 'k': robot.keyPress(KeyEvent.VK_K); break;
                case 'l': robot.keyPress(KeyEvent.VK_L); break;
                case 'm': robot.keyPress(KeyEvent.VK_M); break;
                case 'n': robot.keyPress(KeyEvent.VK_N); break;
                case 'o': robot.keyPress(KeyEvent.VK_O); break;
                case 'p': robot.keyPress(KeyEvent.VK_P); break;
                case 'q': robot.keyPress(KeyEvent.VK_Q); break;
                case 'r': robot.keyPress(KeyEvent.VK_R); break;
                case 's': robot.keyPress(KeyEvent.VK_S); break;
                case 't': robot.keyPress(KeyEvent.VK_T); break;
                case 'u': robot.keyPress(KeyEvent.VK_U); break;
                case 'v': robot.keyPress(KeyEvent.VK_V); break;
                case 'w': robot.keyPress(KeyEvent.VK_W); break;
                case 'x': robot.keyPress(KeyEvent.VK_X); break;
                case 'y': robot.keyPress(KeyEvent.VK_Y); break;
                case 'z': robot.keyPress(KeyEvent.VK_Z); break;
                case 'A': robot.keyPress(KeyEvent.VK_SHIFT);
                          robot.keyPress(KeyEvent.VK_A);
                          robot.keyRelease(KeyEvent.VK_SHIFT);
                          break;
                case 'B': robot.keyPress(KeyEvent.VK_SHIFT);
                          robot.keyPress(KeyEvent.VK_B);
                          robot.keyRelease(KeyEvent.VK_SHIFT);
                          break;
                case 'C': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_C);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'D': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_D);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'E': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_E);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'F': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_F);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'G': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_G);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'H': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_H);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'I': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_I);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'J': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_J);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'K': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_K);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'L': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_L);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'M': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_M);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'N': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_N);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'O': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_O);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'P': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_P);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'Q': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Q);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'R': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_R);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'S': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_S);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'T': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_T);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'U': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_U);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'V': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_V);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'W': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_W);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'X': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_X);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'Y': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Y);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case 'Z': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_Z);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '`': robot.keyPress(KeyEvent.VK_BACK_QUOTE); break;
                case '0': robot.keyPress(KeyEvent.VK_0); break;
                case '1': robot.keyPress(KeyEvent.VK_1); break;
                case '2': robot.keyPress(KeyEvent.VK_2); break;
                case '3': robot.keyPress(KeyEvent.VK_3); break;
                case '4': robot.keyPress(KeyEvent.VK_4); break;
                case '5': robot.keyPress(KeyEvent.VK_5); break;
                case '6': robot.keyPress(KeyEvent.VK_6); break;
                case '7': robot.keyPress(KeyEvent.VK_7); break;
                case '8': robot.keyPress(KeyEvent.VK_8); break;
                case '9': robot.keyPress(KeyEvent.VK_9); break;
                case '-': robot.keyPress(KeyEvent.VK_MINUS); break;
                case '=': robot.keyPress(KeyEvent.VK_EQUALS); break;
                case '~': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_BACK_QUOTE);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '!': robot.keyPress(KeyEvent.VK_EXCLAMATION_MARK); break;
                case '@': robot.keyPress(KeyEvent.VK_AT); break;
                case '#': robot.keyPress(KeyEvent.VK_NUMBER_SIGN); break;
                case '$': robot.keyPress(KeyEvent.VK_DOLLAR); break;
                case '%': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_5);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '^': robot.keyPress(KeyEvent.VK_CIRCUMFLEX); break;
                case '&': robot.keyPress(KeyEvent.VK_AMPERSAND); break;
                case '*': robot.keyPress(KeyEvent.VK_ASTERISK); break;
                case '(': robot.keyPress(KeyEvent.VK_LEFT_PARENTHESIS); break;
                case ')': robot.keyPress(KeyEvent.VK_RIGHT_PARENTHESIS); break;
                case '_': robot.keyPress(KeyEvent.VK_UNDERSCORE); break;
                case '+': robot.keyPress(KeyEvent.VK_PLUS); break;
                case '\t': robot.keyPress(KeyEvent.VK_TAB); break;
                case '\n': robot.keyPress(KeyEvent.VK_ENTER); break;
                case '[': robot.keyPress(KeyEvent.VK_OPEN_BRACKET); break;
                case ']': robot.keyPress(KeyEvent.VK_CLOSE_BRACKET); break;
                case '\\': robot.keyPress(KeyEvent.VK_BACK_SLASH); break;
                case '{': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_OPEN_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '}': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_CLOSE_BRACKET);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case '|': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_BACK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ';': robot.keyPress(KeyEvent.VK_SEMICOLON); break;
                case ':': robot.keyPress(KeyEvent.VK_COLON); break;
                case '\'': robot.keyPress(KeyEvent.VK_QUOTE); break;
                case '"': robot.keyPress(KeyEvent.VK_QUOTEDBL); break;
                case ',': robot.keyPress(KeyEvent.VK_COMMA); break;
                case '<': robot.keyPress(KeyEvent.VK_LESS); break;
                case '.': robot.keyPress(KeyEvent.VK_PERIOD); break;
                case '>': robot.keyPress(KeyEvent.VK_GREATER); break;
                case '/': robot.keyPress(KeyEvent.VK_SLASH); break;
                case '?': robot.keyPress(KeyEvent.VK_SHIFT);
                    robot.keyPress(KeyEvent.VK_SLASH);
                    robot.keyRelease(KeyEvent.VK_SHIFT);
                    break;
                case ' ': robot.keyPress(KeyEvent.VK_SPACE); break;
                default:
                    throw new IllegalArgumentException("Cannot type character " + str.charAt(i));
            }
        }
    }


    //Зробити сінглтон потім
    public static void click(Robot robot, int x, int y){
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void doubleClick(Robot robot, int x, int y){
        robot.mouseMove(x, y);
        // first click
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
        // second click
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);
    }

    public static void rightClick(Robot robot, int x, int y){
        robot.mouseMove(x, y);
        robot.mousePress(InputEvent.BUTTON3_DOWN_MASK);
        robot.mouseRelease(InputEvent.BUTTON3_DOWN_MASK);

    }

    public static void dragAndDrop(Robot robot, int x_Source, int y_Source, int x_Target, int y_Target){

        robot.mouseMove(x_Source, y_Source);
        robot.mousePress(InputEvent.BUTTON1_MASK);
        robot.mouseMove(x_Target, y_Target);
        robot.mouseRelease(InputEvent.BUTTON1_MASK);

    }

    public static void sleep(int millis){
        try {
            Thread.sleep(millis);
        }catch (InterruptedException e){}
    }

    public static void takeAndSave_Screenshot(Robot robot){
        LocalDateTime time = LocalDateTime.now();
        String strTime = time.toString().replace("-", "_").replace(".", "_").replace(":", "_");
        strTime = strTime.substring(0, strTime.lastIndexOf("_"));

        Rectangle area = new Rectangle(Toolkit.getDefaultToolkit().getScreenSize());
        BufferedImage bufferedImage = robot.createScreenCapture(area);

        // Write generated image to a file

        try {

            // Save as PNG

            File file = new File("C:\\Users\\nazar_000\\IdeaProjects\\JavaProgramming\\JAVA_CYDEO\\CodeRobot\\screenshots\\screenshot_D"+strTime+".png");

            ImageIO.write(bufferedImage, "png", file);

        } catch (IOException e) {

            System.out.println("Could not save full screenshot " + e.getMessage());

        }
    }



}
