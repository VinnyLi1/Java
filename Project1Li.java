import java.util.Scanner;

/**
 * Project 1, Hardware recommendation tool program. Practice, Vincent Li.
 */
public class Project1Li 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        String processorType, overclock, programTitle, resolution, recommendedGraphics, overclockWarning;
        double gpuClockSpeed, cpuClockSpeed, performanceScore, multiplier = 0;
        int processorCores;
        char answer;
        
        System.out.print("Please enter the type of processor: ");
        processorType = keyboard.nextLine();

        System.out.print("Please enter the clock speed(Megahertz) of youx`r graphics card: ");
        gpuClockSpeed = keyboard.nextDouble();

        System.out.print("Please enter the clock speed(Megahertz) of your processor: ");
        cpuClockSpeed = keyboard.nextDouble();

        System.out.print("Please enter the number of cores of your processor: ");
        processorCores = keyboard.nextInt();

        keyboard.nextLine();

        System.out.print("Is the hardware overclock-friendly? ");
        overclock = keyboard.nextLine();
        answer = overclock.charAt(0);

        System.out.print(" 1. 1280x720 \n 2. 1920x1080 \n 3. 2560x1440 \n 4. 3840x2160 \n");
        resolution = keyboard.nextLine();

        switch (resolution)
        {
            case "1":
                multiplier = 1;
                break;
            case "2":
                multiplier = 0.75;
                break;
            case "3":
                multiplier = 0.55;
                break;
            case "4":
                multiplier = 0.35;
                break;
            default:
                System.out.println("That is not a valid resolution option.");

        }

        performanceScore = ((5 * gpuClockSpeed) + (4 * processorCores)) * multiplier;

        System.out.println("Computer Hardware Recommendation Tool.");
        System.out.println("Processor Type: " + processorType);
        System.out.println("GPU Clock Speed: " + gpuClockSpeed);
        System.out.println("CPU Clock Speed: " + cpuClockSpeed);
        System.out.println("Number of Cores in Processor: " + processorCores);
        System.out.println("Overclock Friendly? " + answer);

        keyboard.close();
    }
}
