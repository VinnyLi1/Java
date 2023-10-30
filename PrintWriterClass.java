import java.io.*;

public class PrintWriterClass 
{
    public static void main(String[]args) throws IOException
    {
        PrintWriter outputFile = new PrintWriter("StudentData.txt");
        
        outputFile.println("Joe mama");
        outputFile.println("Gojo Satoru");
        outputFile.close();

    }
}
