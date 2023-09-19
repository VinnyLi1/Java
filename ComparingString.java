public class ComparingString 
{
    public static void main(String[]args)
    {
        String name1, name2, name3;

        name1 = "Vincent";
        name2 = "Ashley";
        name3 = "Vincent";

        if (name1.equals(name2))
            System.out.println(name1 + " and " + name2 + " are the same.");
        else if (name1.equals(name3))
            System.out.println(name1 + " and " + name3 + " are the same.");
        else
            System.out.println("The names are not the same.");
    }
}
