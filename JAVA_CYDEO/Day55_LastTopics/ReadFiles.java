package Day55_LastTopics;

import java.io.*;
import java.util.Scanner;

public class ReadFiles {
    public static void main(String[] args) throws IOException {


        /*
        //with buffered reader
        FileReader reader = new FileReader("C:\\Users\\nazar_000\\Desktop\\New Text Document.txt");

        BufferedReader buf = new BufferedReader(reader);
        System.out.println(buf.readLine()); //just 1 line at a time

         */


        //with scanner
        Scanner scanner = new Scanner(new FileReader("C:\\Users\\nazar_000\\Desktop\\New Text Document.txt"));
        while (scanner.hasNextLine()){
            System.out.println( scanner.nextLine());
        }



        //Bufferref writer
        FileWriter fileWriter = new FileWriter("C:\\Users\\nazar_000\\Desktop\\New Text Document.txt", true);
        //append true means it wont delete test that already exists

        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("\nHello wassap");
        bufferedWriter.close(); //to perform writing


    }
}
