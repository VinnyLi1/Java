import java.util.Scanner;

public class SpeedOfSound
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        String medium;
        double distance, time;
        
        System.out.println("Select one of the following options; Air, Water, or Steel: ");
        medium = keyboard.nextLine();

        System.out.println("How far of a distance? ");
        distance = keyboard.nextDouble();

        if (medium.equalsIgnoreCase("air"))
        {
            time = (distance / 1100);
            System.out.println("It will take " + time + " seconds.");
        }
        else if (medium.equalsIgnoreCase("water"))
        {
            time = (distance / 4900);
            System.out.println("It will take " + time + " seconds.");
        }
        else if (medium.equalsIgnoreCase("steel"))
        {
            time = (distance / 16400);
            System.out.println("It will take " + time + " seconds.");
        }
        else
            System.out.println("Please choose one of the options; Air, Water, or Steel.");

        keyboard.close();
    }
}
