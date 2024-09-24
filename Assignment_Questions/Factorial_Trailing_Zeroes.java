import java.util.Scanner;

public class Factorial_Trailing_Zeroes {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        int res=0;
        while (n>0) {
            n/=5;
            res+=n;
        }
        System.out.println(res);
    }
}
