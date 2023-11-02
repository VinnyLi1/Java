import java.util.Scanner;

public class Chapter4Prac1 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);

        int sum = 0, number;

        System.out.println("Choose a positive nonzero integer value: ");
        number = keyboard.nextInt();

        for (int start = 0; start < number; start++)
        {
            sum += start;
        }

        System.out.println("The total sum of all the integers is " + sum);

        keyboard.close();
    }
}
