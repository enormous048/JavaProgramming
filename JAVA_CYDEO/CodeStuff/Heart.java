package CodeStuff;

import java.io.UnsupportedEncodingException;

public class Heart  {

    public static void main(String[] args) {
        byte[][] data={
                {111,111,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32},
                {32,32,32,111,111,32,32,32,32,32,79,79,79,79,79,79,79,79,58,32,32,32,32,32,32,32,79,79,79,79,79,79,79,79,33,32,32,32,32,32,32,32},
                {32,32,32,32,32,32,111,79,79,79,79,33,33,33,33,59,59,59,59,79,32,32,32,32,79,79,46,46,46,46,46,46,46,58,59,33,79,32,32,32,32,32},
                {32,32,32,32,32,39,79,79,79,33,33,33,59,59,59,59,59,59,59,59,79,32,32,79,46,46,46,46,46,46,46,58,32,32,32,59,33,79,32,32,32,32},
                {32,32,32,32,32,79,79,79,33,33,33,33,59,59,58,58,58,58,58,58,46,79,79,46,46,46,46,46,46,46,46,58,32,32,32,32,59,33,79,32,32,32},
                {32,32,32,32,32,79,79,33,33,33,33,59,59,58,58,58,58,58,46,46,46,46,46,46,46,46,46,46,46,46,46,46,58,32,32,32,59,33,79,32,32,32},
                {32,32,32,32,32,79,79,79,33,33,33,59,58,58,58,58,58,58,46,46,46,46,46,46,46,46,46,46,46,46,46,46,58,32,32,32,59,33,79,32,32,32},
                {32,32,32,32,32,32,79,79,33,33,59,59,58,58,58,58,58,58,46,46,46,46,46,46,46,46,46,46,46,46,46,58,32,32,32,59,33,79,32,32,32,32},
                {32,32,32,32,32,32,32,79,79,33,59,59,58,58,58,58,58,58,46,46,46,46,46,46,111,111,46,46,46,46,46,58,58,58,58,33,79,32,32,32,32,32},
                {32,32,32,32,32,32,32,32,32,79,33,33,59,58,58,58,58,58,58,46,46,46,46,46,46,46,46,111,111,46,46,58,58,58,79,32,32,32,32,32,32,32},
                {32,32,32,32,32,32,32,32,32,32,32,33,33,33,59,58,58,58,58,58,46,46,46,46,46,46,46,46,46,46,111,111,79,32,32,32,32,32,32,32,32,32},
                {32,32,32,32,32,32,32,32,32,32,32,32,32,32,33,33,59,58,58,58,58,58,46,46,46,46,46,46,46,79,32,32,32,111,111,32,32,32,32,32,32,32},
                {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,59,59,58,58,58,58,46,46,46,46,46,79,32,32,32,32,32,32,32,32,111,111,32,32,44,111},
                {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,58,58,58,46,46,79,32,32,32,32,32,32,32,32,32,32,32,32,32,32,111,111,111},
                {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,58,58,46,32,32,32,32,32,32,32,32,32,32,32,32,32,32,111,111,111,111},
                {32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,58,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32}
        };
        for(int i=0;i<data.length;i++){
            try {
                String decoded = new String(data[i], "UTF-8");
                System.out.println(decoded);
                try {
                    Thread.sleep(180);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            } catch (UnsupportedEncodingException ex) {
                ex.printStackTrace();
            }
        }
    }
}