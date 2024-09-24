import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int rev = 0, z = n;
        while (n > 0) {
            rev = (rev * 10) + n % 10;
            n = n / 10;
        }

        if (rev == z) {
            System.out.println(z + " Palindrome Number.");
        } else {
            System.out.println(z + " Not A Palindrome Number.");
        }
    }
}
