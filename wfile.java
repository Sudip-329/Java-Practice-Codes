import java.io.*;
public class wfile {
    public static void main(String [] args) throws IOException
    {
        //FileWriter(String,boolean);
        FileWriter f = new FileWriter("file1.txt");
        PrintWriter out = new PrintWriter(f);
        out.println("Welcome to file handling.");
        out.close();
        f.close();

    }
}