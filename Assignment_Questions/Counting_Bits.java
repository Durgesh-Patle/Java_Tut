import java.util.Scanner;

public class Counting_Bits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        int count = 0;

        for (int i = 1; i <= n; i++) {
            int num = i;
            while (num > 0) {
                count += num & 1;
                num /= 2;
            }
            System.out.println(count);
        }
    }
}
