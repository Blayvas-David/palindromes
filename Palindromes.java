package palindromes;
import java.util.Scanner;

public class Palindromes 
{
    public static void main(String[] args) 
    {
        
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        
        char[] nameChar = name.toCharArray();
        int length = nameChar.length;
        
        /* <Test> */
        System.out.println(length);
        /* </Test> */
        
        boolean palindrome = true;
        for (int i = 0; (i < length/2) && (palindrome); i++)
        {
            /* <Test> */
            System.out.println("Testing " + nameChar[i] + " and " + nameChar[length-i]);
            /* </Test> */
            if (nameChar[i] != nameChar[length - i])
            {
                palindrome = false;
                /* <Test> */
                System.out.println("Negative.");
                /* </Test> */
            }
            /* <Test> */
            else
            {
                System.out.println("Positive.");
            }
            /* </Test> */
        }
        
        if (palindrome)
        {
            System.out.println("Congratulations, it's a palindrome!");
        }
        else
        {
            System.out.println("I'm very sorry, it's not a palindrome. Sike, I'm a machine and I'm not sorry.");
        }
        
    }
}
