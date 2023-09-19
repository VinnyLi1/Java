import java.util.Scanner;

public class TimeCalc 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        int seconds;
        double minutes, days;

        minutes = 0;
        days = 0;

        System.out.println("Enter a number of seconds: ");
        seconds = keyboard.nextInt();

        if (seconds >= 86400)
        {
            days = (seconds / 86400);
            System.out.println("There are " + days + " days in " + seconds + " seconds.");
        }
        else if (seconds >= 3600)
        {
            minutes = (seconds / 3600);
            System.out.println("There are " + minutes + " minutes in " + seconds + " seconds.");
        }
        else
            System.out.println("Enter a large number of seconds please.");
    }
}
