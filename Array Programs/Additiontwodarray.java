import java.util.Scanner;
public class  Additiontwodarray
{    
    public static void main(StringMethods args[])
    {  
      int i,j;
      int a[][]=new int[2][2];
      int ar[][]=new int[2][2];
      int arr[][]=new int[2][2];
      System.out.println("enter elements of array A:");
      Scanner sc=new Scanner(System.in);
      for( i=0;i<2;i++)
      {
        for( j=0;j<2;j++)
        {
            a[i][j]=sc.nextInt();
        }
      }

      System.out.println("matrix elements A:");
        for( i=0;i<2;i++)
      {
        for( j=0;j<2;j++)
        {
           System.out.print(a[i][j]+" ");
        }
        System.out.println();
      }

      System.out.println("enter elements of array B:");
      Scanner Sc=new Scanner(System.in);
      for( i=0;i<2;i++)
      {
        for( j=0;j<2;j++)
        {
            ar[i][j]=Sc.nextInt();
        }
      }

      System.out.println("matrix elements B:");
      for( i=0;i<2;i++)
      {
        for( j=0;j<2;j++)
        {
           System.out.print(ar[i][j]+" ");
        }
        System.out.println();
      }
       
      //System.out.println("Addition of two matrix :");
      System.out.println("Subtraction of two matrix :");
      for( i=0;i<2;i++)
      {
        for( j=0;j<2;j++)
        {  
           //arr[i][j]=a[i][j]+ar[i][j];
            arr[i][j]=a[i][j]-ar[i][j];
           System.out.print(arr[i][j]+" ");
        }
        System.out.println();
      }
    }
}


