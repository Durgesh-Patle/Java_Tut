import java.util.Scanner;
public class addsubmulty 
{ 
    public static void main(StringMethods args[])
    {   
        int a,b,sum,sub,multy;
        System.out.print("enter two number:");
        Scanner num=new Scanner(System.in);
         a=num.nextInt();
         b=num.nextInt();

        sum=a+b;
        System.out.println("sum is="+sum);

        sub=a-b;
        System.out.println("sub is="+sub);

        multy=a*b;
        System.out.println("multy is="+multy);

    }
    
}
