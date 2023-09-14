import java.util.Scanner;

/**
 * Project 1, Hardware recommendation tool program. Practice, Vincent Li.
 */
public class Project1Li 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        String processorType, overclock;
        double gpuClockSpeed, cpuClockSpeed;
        int processorCores;
        char answer;
        
        System.out.print("Please enter the type of processor: ");
        processorType = keyboard.nextLine();

        System.out.print("Please enter the clock speed(Megahertz) of your graphics card: ");
        gpuClockSpeed = keyboard.nextDouble();

        System.out.print("Please enter the clock speed(Megahertz) of your processor: ");
        cpuClockSpeed = keyboard.nextDouble();

        System.out.print("Please enter the number of cores of your processor: ");
        processorCores = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Is the hardware overclock-friendly? ");
        overclock = keyboard.nextLine();
        answer = overclock.charAt(0);

        System.out.println("Computer Hardware Recommendation Tool.");
        System.out.println("Processor Type: " + processorType);
        System.out.println("GPU Clock Speed: " + gpuClockSpeed);
        System.out.println("CPU Clock Speed: " + cpuClockSpeed);
        System.out.println("Number of Cores in Processor: " + processorCores);
        System.out.println("Overclock Friendly? " + answer);

    }
}
