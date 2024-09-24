import java.util.Scanner;
public class Printtwodaaray 
{    
    public static void main(StringMethods args[])
    {
      int a[][]=new int[2][2];
      System.out.print("enter elements of array:");
      Scanner input=new Scanner(System.in);
      for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
        {
            a[i][j]=input.nextInt();
        }
      }

      System.out.println("matrix elements:");
        for(int i=0;i<2;i++)
      {
        for(int j=0;j<2;j++)
        {
           System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }
    }
}
