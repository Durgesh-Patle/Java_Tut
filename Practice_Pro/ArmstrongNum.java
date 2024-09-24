import java.util.Scanner;

public class ArmstrongNum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numeber: ");
        int n = sc.nextInt();

        int count = 0, z = n, digit, pro, sum = 0;
        while (n > 0) {
            count += 1;
            n = n / 10;
        }
        System.out.println("The number of Count: " + count);

        z = n;
        while (z > 0) {
            digit = z % 10;
            pro = 1;
            for (int i = 1; i <= count; i++)
                pro *= digit;
            sum += pro;
            z = z / 10;
        }

        if (sum == n) {
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not Armstrong Number");

        }

    }
}
