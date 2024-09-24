import java.util.Scanner;

public class PowerOfNum {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numeber: ");
        int n = sc.nextInt();
        System.out.print("Enter Power: ");
        int p = sc.nextInt();

        int res=1;

        while (p>0) {
            res=res*n;
            p--;
        }
        System.out.println(res);

    }
}
