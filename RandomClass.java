import java.util.Random;

public class RandomClass 
{
    public static void main(String[]args) 
    {
        int number;

        Random randomNumbers = new Random();

        number = randomNumbers.nextInt(10) + 1;
        
        System.out.println(number);
    }
}
