import java.util.Scanner;

/**
 * This program is to calculate a car's MPG(Miles per gallon)
 */
public class MilesPerGallon 
{
    public static void main(String[]args)
    {
        int miles, gallon;
        double mpg;
        Scanner keyboard = new Scanner(System.in);

        System.out.println("How many miles have you driven? ");
        miles = keyboard.nextInt();

        System.out.println("How many gallons have you used? ");
        gallon = keyboard.nextInt();

        mpg = (double)miles / gallon;

        System.out.println("Your MPG is " + mpg);
    }
    
}
