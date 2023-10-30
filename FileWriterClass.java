import java.io.*;

public class FileWriterClass 
{
    public static void main(String[]args) throws IOException
    {
        FileWriter fwriter = new FileWriter("StudentData.txt", true);
        PrintWriter outputFile = new PrintWriter(fwriter);

        outputFile.println("Itadori Yuji");
        outputFile.println("Giyu Water");
        outputFile.close();
        
    }
}
