import java.util.Scanner;

public class Exam1Li 
{
    public static void main(String[]args)
    {
        Scanner keyboard = new Scanner(System.in);
        String legalServices, retainerType = "";
        int hours, days = 0;
        double hourlyRate, retainerAmount, legalServiceCharges, amountDue = 0;

        System.out.println("Welcome to Central Piedmont Legal Services");

        System.out.print("Choose from one of the following types of legal services:" + 
                            "\n   A - Intellectual Property" + "\n   B - Personal Injury" +
                            " \nEnter your choice (A or B): ");
        legalServices = keyboard.nextLine();

        if (legalServices.equalsIgnoreCase("A"))
            {
                System.out.println("Intellectual Property Legal Services rate: $453.00 per hour");
                hourlyRate = 453.00;
            }
        else if (legalServices.equalsIgnoreCase("B"))
            {
                System.out.println("Personal Injury Legal Service rate: $262.00 per hour");
                hourlyRate = 262.00;
            }
        else
            {
                System.out.println("\nInvalid choice. Intellectual Property Legal Service rate applied." + 
                                "\n\n\nIntellecutal Properrty Legal Services rate: $453.00 per hour");
                hourlyRate = 453.00;
            }
        
        System.out.print("\nEnter the type of retainer type: 'long-term', 'standard', 'short-term': ");
        retainerType = keyboard.nextLine();

        if (retainerType.equalsIgnoreCase("long-term"))
            {
                System.out.println("\nLong-Term retainer of $50000.00 applied for services.");
                retainerAmount = 50000.00;
            }
        else if (retainerType.equalsIgnoreCase("standard"))
            {
                System.out.println("\nStandard retainer of $10000.00 applied for services.");
                retainerAmount = 10000.00;
            }
        else if (retainerType.equalsIgnoreCase("short-term"))
            {
                System.out.println("\nShort-Term retainer of $5000.00 applied for services.");
                retainerAmount = 5000.00;
            }
        else
            {
                System.out.println("\nINVALID ENTRY. Short-Term retainer of $5000.00 applied for services.");
                retainerAmount = 5000.00;
            }

        System.out.print("Enter the total number of hours of legal services: ");
        hours = keyboard.nextInt();

        System.out.println("\n\n-----------------------------------------------------------------");

        legalServiceCharges = (hours * hourlyRate);

        if (hours >= 8)
            {
                days = (hours / 8);
                hours = (hours % 8);
                System.out.println("Duration of Services: " + days + "day(s), " + hours + "hour(s)");
            }
        else
            System.out.println("Duration of Services " + days + "day(s)," + hours + "hour(s)");

        if (legalServiceCharges > retainerAmount)
            amountDue = (legalServiceCharges - retainerAmount);

        System.out.printf("Hourly Rate: $%.2f\n" , hourlyRate);
        System.out.printf("Retainer Amount: $%.2f\n" , retainerAmount);
        System.out.printf("Legal Service Charges: $%.2f\n" , legalServiceCharges);
        System.out.printf("Amount Due: $%.2f\n" , amountDue);

        System.out.println("\n-----------------------------------------------------------------");

        keyboard.close();
    }
}
