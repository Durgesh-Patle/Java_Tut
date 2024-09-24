import java.util.Scanner;
public class Printarray 
{
    public static void main(StringMethods args[])
    { 
        int n;
        Scanner input=new Scanner(System.in);
        System.out.print("enter the number of elements stored in array:");
        n=input.nextInt();
        int array[]=new int[10];
        System.out.println("enter the elements of array:");
        for(int i=0;i<n;i++)
        {
            array[i]=input.nextInt();
        }
        System.out.print("Array elments:");
        for(int i=0;i<n;i++)
        {
           System.out.print(array[i]);
           System.out.println(" ");
        }
    }
}
