import java.util.Scanner;

public class NumberOf1Bits2 {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int c = 0;
        while (n > 0) {
            c++;
            n = n & (n - 1);

        }
        System.out.println(c);
    }
}
