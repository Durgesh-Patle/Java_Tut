import java.util.Scanner;
public class twodarray 
{
    public static void main(StringMethods args[])
    {
        int matrix, row,col,a[][];
        Scanner input =new Scanner(System.in);
        System.out.print("enter number row :");
        row=input.nextInt();
        System.out.print("enter number col :");
        col=input.nextInt();

        matrix=row*col;
        System.out.print("enter total elements of matrix:"+matrix);
    }
}
