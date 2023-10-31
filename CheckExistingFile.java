import java.util.Scanner;
import java.io.*;

public class CheckExistingFile 
{
    public static void main(String[]args) throws IOException
    {
        String fileName, friendNames;
        int numFriends;
        Scanner keyboard = new Scanner(System.in);
        
        System.out.println("How many friends do you have?");
        numFriends = keyboard.nextInt();

        keyboard.nextLine();

        System.out.println("What is the name of the file?");
        fileName = keyboard.nextLine();

        File file = new File(fileName);

        if (file.exists())
        {
            System.out.println("The file named " + fileName + " already exists.");
            System.exit(0);
        }

        PrintWriter outputFile = new PrintWriter(file);

        for (int i = 1; i <= numFriends; i++)
        {
            System.out.println("What is the name of your friend " + "number " + i +"?");
            friendNames = keyboard.nextLine();

            outputFile.println(friendNames);

        }
        
        keyboard.close();
        outputFile.close();
        System.out.println("Data written to the file.");
    }    
}
