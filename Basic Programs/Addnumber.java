import java.util.Scanner;
public class Addnumber
{
    public static void main(StringMethods args[])
    {
        float a,b,c;
        System.out.print("Enter two number:");
        Scanner add = new Scanner(System.in);
        a=add.nextFloat();
        b=add.nextFloat();
        c=a+b;
        System.out.println("sum is ="+c);
    }
}
