import java.util.Scanner;

public class WhileandDoWhileandForLoop 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        int counter, number, value;

        // While Loop
        counter = 0;
        while (counter <= 5)
        {
            System.out.print(counter + " ");
            counter ++;
        }
        
        //Do while withh one statement
        number = 0;
        do
            System.out.println(number);
        while (number == 1);

        //Do while with multiple statements
        number = 0;
        do
        {
            System.out.print(number + " ");
            number += 1;
        } while (number <= 5);

        //For loop
        for (value = 0; value <= 5; value ++)
        {
            System.out.print(value + " ");
        }

        //For loop and Initializing variable
        for (int digit = 0; digit <= 5; digit++)
        {
            System.out.print(digit + " ");
        }

        keyboard.close();
    }
}
