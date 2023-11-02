import java.util.Scanner;
import java.io.*;

public class Chapter4Prac2 
{
    public static void main(String[]args) throws IOException
    {
        Scanner keyboard = new Scanner(System.in);
        PrintWriter outputFile = new PrintWriter("DistanceTraveled.txt");

        int distance, speed, time;

        System.out.println("How fast is the train going(Miles)? ");
        speed = keyboard.nextInt();

        System.out.println("How long is the train moving(Hours)? ");
        time = keyboard.nextInt();

        outputFile.println("Hour" + "\tDistance Traveled");

        for (int constant = 1; constant <= time; constant++)
        {
            distance = constant * speed;
            outputFile.println(constant + "\t\t\t" + distance);
        }

        keyboard.close();
        outputFile.close();
    }
}
