import java.util.Scanner;

/**
 * This program is used to ask a s  eries of valorant stat quesitons.
 */

public class ValorantStats {
    public static void main(String[]args)
    {
        // Scanner class used to allow users to have input
        Scanner keyboard = new Scanner(System.in);

        String rank, skin;
        int agents, vandal, phantom;
        
        System.out.println("What rank are you? ");
        rank = keyboard.nextLine();

        System.out.println("What is your favorite skin? ");
        skin = keyboard.nextLine();

        System.out.println("How many agents are there in Valorant? ");
        agents = keyboard.nextInt();

        System.out.println("How much damage does the vandal do to the head? ");
        vandal = keyboard.nextInt();

        System.out.println("How much damage does the phantom do to the head? ");
        phantom = keyboard.nextInt();

        System.out.println("Your rank is " + rank + " and your favorite skin is the " + skin + " skin.");

    }
}
