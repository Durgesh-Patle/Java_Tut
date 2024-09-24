import java.util.Scanner;
public class Miniproject 
{
    public static void main(StringMethods args[])
    {  
       //mini project.
       Scanner Sc= new Scanner(System.in);
       int myNumber=(int)(Math.random()*100);
       int userNumber=0;
       do
       {
         System.out.println("Guess my number:");
         userNumber=Sc.nextInt();
         if (userNumber==myNumber)
         {
            System.out.println("WOOHOOO....CORRECT NUMBER!!!");
            break;
         }
         else if(userNumber>myNumber)
         {
           System.out.println("your number is too large.");
         }
         else
         {
           System.out.println("your number too small");
         } 
        }
         while(userNumber>=0);
         System.out.println("My number was:");
         System.out.println(myNumber);

    }
}
