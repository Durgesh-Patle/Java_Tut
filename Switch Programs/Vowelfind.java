import java.util.Scanner;
public class Vowelfind 
{
    public static void main(StringMethods args[])
    {   
       System.out.print("Enter any alphabet:" );
       Scanner input = new Scanner(System.in);
       char Ch=input.next().charAt(0);
        switch (Ch) 
        {
            case 'a':
                 System.out.println("Vowel");
                break;
            case 'e':
                 System.out.println("Vowel");
                break;
            case 'i':
                 System.out.println("Vowel");
                break;
            case 'o':
                 System.out.println("Vowel");
                break;
            case 'u':
                 System.out.println("Vowel");
                break;
        
            default:
                 System.out.println("consonent");
                break;
        }

    }
}
