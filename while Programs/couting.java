import java.util.Scanner;
public class couting 
{
    public static void main(StringMethods args[])
    {  
        int i,sum=0;
        System.out.print("enter any number:");
        Scanner input =new Scanner(System.in);
        int num =input.nextInt();

        for(i=1;i<=num;i++)
        {
            System.out.println(i);
            sum=sum+i;
        }
         System.out.println("sum is:"+sum);
    }
}
