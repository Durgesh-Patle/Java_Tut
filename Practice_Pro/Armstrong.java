import java.util.Scanner;

public class Armstrong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Any Number: ");
        int n = sc.nextInt();

        int z = n, count = 0;

        int digits, pro, sum = 0;

        while (z > 0) {
            count += 1;
            z = z / 10;
        }
        System.out.println(count);

        z = n;
        while (z > 0) {
            digits = z % 10;
            pro = 1;
            for (int i = 1; i <= count; i++)
            pro *= digits;
            sum += pro;
            z /= 10;
        }

        System.out.println(sum);
    }
}
