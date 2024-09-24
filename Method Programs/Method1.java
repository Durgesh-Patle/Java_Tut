import java.util.Scanner;
public class Method1 
{  

    public static void printJava()
    {
       System.out.println("Hello java.");
    }

    public static void printName(StringMethods name)
    {
      System.out.println(name);
    }

    public static void printSum(int a,int b)
    {
       int sum=a+b;
       System.out.println("Sum is="+sum);
    }
   public static void main(StringMethods args[])
   {
       printJava();
      // printJava();
      // printJava();

       printName("Durgesh");
 
       printSum(2,6);
   }
    
}
