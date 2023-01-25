import java.io.*;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        // Writing to a file
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));
            bw.write("Karen");
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Reading a file

        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));
            String s;
            while ((s = br.readLine()) != null) {
                System.out.println(s);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }




    }
}