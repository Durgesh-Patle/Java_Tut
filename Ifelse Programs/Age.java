import java.util.Scanner;
public class Age
{   
    public static void main(StringMethods args[])
    {
    System.out.print("enter age:");
    Scanner Sc =new Scanner(System.in);
     int age=Sc.nextInt();
     //int age=15;

    if(age>=18)
    {
       System.out.println("voting for engible");
    }
    else
    {
       System.out.println(" not voting for engible");
    }

    }
}
