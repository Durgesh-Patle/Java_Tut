import java.util.Scanner;

public class PowerOf_Two {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter  Number: ");
        int n = sc.nextInt();

        int i = 1;

        while (i < n) {
            i = i * 2;
        }
        if (i == n) {
            System.out.println("True");
        } else {
            System.out.println("False");
        }

    }
}
