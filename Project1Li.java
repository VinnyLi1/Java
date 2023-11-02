
import java.util.Scanner; 

public class Project1Li
{
   public static void main(String[]args)
   {
      //create a Scanner object used to read input from the console
      Scanner keyboard = new Scanner(System.in);
      
      //create variables to hold user input and any values calculated from them
      double gpuClockSpeed = 0,  
             cpuClockSpeed = 0, 
             multiplier = 0,
             performanceScore = 0;
             
      int cpuCoreNumber = 0,
          monitorResolution = 0;
          
      String processor = "",
             input = "",
             recommendedQuality = "",
             monitorResolutionAsString = "",
             title = "Computer Hardware Graphics Quality Recommendation Tool";
      
      char overclock = ' ';
      
      //declare constants to hold the multiplier values      
      final double MULTIPLIER_1280_720 = 1.0, 
                   MULTIPLIER_1920_1080 = .75, 
                   MULTIPLIER_2560_1440 = .55, 
                   MULTIPLIER_3840_2160 = .35; 
      
      //declare constants to hold the resolution menu options and the performance multiplier
      final int RESOLUTION_1280_720 = 1, 
                RESOLUTION_1920_1080 = 2, 
                RESOLUTION_2560_1440 = 3, 
                RESOLUTION_3840_2160 = 4;  
                
                int PERFORMANCEMULTIPLIER = 5;
      
      //declare constants to hold the recommended graphics quality thresholds 
      final double PERFORMANCE_THRESHOLD_ULTRA = 17000, 
                   PERFORMANCE_THRESHOLD_HIGH = 15000,  
                   PERFORMANCE_THRESHOLD_MEDIUM = 13000,  
                   PERFORMANCE_THRESHOLD_LOW= 11000; 
   
      //get the user's input
      System.out.print("Please enter the type of processor: ");
      processor = keyboard.nextLine();
  
      System.out.print("Please enter the clock speed (in Megahertz) of your graphics card: ");
      gpuClockSpeed = keyboard.nextDouble();
   
      System.out.print("Please enter the clock speed (in Megahertz) of your processor: ");
      cpuClockSpeed = keyboard.nextDouble();
   
      System.out.print("Please enter the number of cores of your processor: ");
      cpuCoreNumber = keyboard.nextInt();
      
      keyboard.nextLine();
      
      System.out.print("Is the hardware overclock-friendly? (Enter y for yes or n for no): ");
      input = keyboard.nextLine();
      overclock = input.charAt(0);
      
      System.out.println("What is the resolution of your monitor?");
      System.out.println("\t1. 1280 x 720");
      System.out.println("\t2. 1920 x 1080");
      System.out.println("\t3. 2560 x 1440");
      System.out.println("\t4. 3840 x 2160");
      System.out.print("Please select from the options above: "); 
      monitorResolution = keyboard.nextInt();
      
      //determine the multiplier value and resolution (as a String) based on the user's input for the monitor resolution
      if (monitorResolution == RESOLUTION_1280_720)
      {
         multiplier = MULTIPLIER_1280_720;
      }
      else if (monitorResolution == RESOLUTION_1920_1080)      
      {
         multiplier = MULTIPLIER_1920_1080;
      }
      else if (monitorResolution == RESOLUTION_2560_1440)      
      {
         multiplier = MULTIPLIER_2560_1440;
      }
      else 
      {
         multiplier = MULTIPLIER_3840_2160;
      }
      
      if (monitorResolution == RESOLUTION_1280_720)
      {
         monitorResolutionAsString = "1280 X 720";
      }
      else if (monitorResolution == RESOLUTION_1920_1080)      
      {
         monitorResolutionAsString = "1920 X 1080";
      }
      else if (monitorResolution == RESOLUTION_2560_1440)      
      {
         monitorResolutionAsString = "2560 X 1440";
      }
      else 
      {
         monitorResolutionAsString = "3840 X 2160";
      }

      //calculate the performance score   
      performanceScore = (PERFORMANCEMULTIPLIER * gpuClockSpeed + (cpuCoreNumber * cpuClockSpeed))* multiplier;
      
      //determine the recommended graphics quality based on the performance score
      if (performanceScore > PERFORMANCE_THRESHOLD_ULTRA)      
      {
         recommendedQuality = "Ultra";
      }
      else if (performanceScore > PERFORMANCE_THRESHOLD_HIGH)      
      {
         recommendedQuality = "High";
      }
      else if (performanceScore > PERFORMANCE_THRESHOLD_MEDIUM)      
      {
         recommendedQuality = "Medium";
      }
      else if (performanceScore > PERFORMANCE_THRESHOLD_LOW)      
      {
         recommendedQuality = "Low";
      }
      else      
      {
         recommendedQuality = "Unable to Play";
      }
      
      //output all of the information
      System.out.println();
      System.out.println(title);
      System.out.println(); 
      System.out.println("Processor Type: " + processor);
      System.out.println("GPU Clock Speed: " + gpuClockSpeed + " MHz");
      System.out.println("CPU Clock Speed: " + cpuClockSpeed + " MHz");
      System.out.println("Number of cores: " + cpuCoreNumber);
      System.out.println("Monitor Resolution: " + monitorResolutionAsString);
      System.out.printf("Performance Score: %,.3f\n", performanceScore );
      System.out.println("Recommended Graphics Quality: " + recommendedQuality);
      if(overclock == 'n')
      {
         System.out.println("Warning, your cooling system may work harder. Consider upgrading to overclock-friendly components."); 
      }

      keyboard.close();
   }
}