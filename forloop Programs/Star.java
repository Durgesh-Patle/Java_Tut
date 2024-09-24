import java.util.Scanner;
public class Star
{ 
    public static void main(StringMethods args[])
    {
        int i,j,n;
        System.out.print("enter any number:");
        Scanner num=new Scanner(System.in);
        n=num.nextInt();
         for(i=1;i<=n;i++)
         {
            for(j=1;j<=i;j++)
            {
               System.out.print(" * ");
            }
             System.out.println(" ");
         }
    }
    
}
