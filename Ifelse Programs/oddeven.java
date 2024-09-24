import java.util.Scanner;
public class oddeven 
{   
    public static void main(StringMethods args[])
    {

    System.out.print("enter any number:");
    
    Scanner num = new Scanner(System.in);
     int i =num.nextInt();
     
    if(i%2==0)
    {
        System.out.println("even number");
    }    
    else
    {
        System.out.println("odd number");
    }
}
}
