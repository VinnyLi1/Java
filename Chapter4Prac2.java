import java.util.Scanner;

public class Chapter4Prac2 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        int distance, speed, time;

        System.out.println("How fast is the train going(Miles)? ");
        speed = keyboard.nextInt();

        System.out.println("How long is the train moving(Hours)? ");
        time = keyboard.nextInt();

        System.out.println("Hour" + "\tDistance Traveled");

        for (int constant = 1; constant <= time; constant++)
        {
            distance = constant * speed;
            System.out.println(constant + "\t" + distance);
        }

        keyboard.close();
    }
}
