import java.util.Scanner;

/**
 * If and else introduced and used in different ways. (Comparing numerical values given by the user.)
 */

public class IfandElseIntro 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        
        double number1, number2;

        System.out.println("What is your first number? ");
        number1 = keyboard.nextDouble();

        System.out.println("What is your second number? ");
        number2 = keyboard.nextDouble();

        if (number1 > number2)
            System.out.println(number1 + " " + "is the bigger number.");
        else if (number1 == number2)
            System.out.println(number1 + " " + "and" + " " + number2 + " " + "are equal.");
        else
            System.out.println(number2 + " " + "is the bigger number.");

    }
}

/* Examples of if and else statements 
Example #1
if (speed >= 0 && speed <= 200)
    System.out.println("The number is valid.");

Example #2
if (speed < 0 || speed > 200)
    System.out.println("The number is not valid");

Comparing two String Objects

if (StringReference1.equals(StringReference2))

Comparing String object to a String literal
if (name1.equals("Vincent"))

String Compare which is greater in value
StringReference.compareTo(OtherString)

Comapre while ignoring cases(Upper and lower cases)
equalsIgnoreCase and compareToIgnoreCase
*/