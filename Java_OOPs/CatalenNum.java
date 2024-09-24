import java.util.Scanner;

public class CatalenNum {
    public static int Fact(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

    public static int Catalen(int n) {
        int factNum = Fact(2*n) / (Fact(n + 1) * Fact(n));
        return factNum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // System.out.println(Fact(n));
        System.out.println("Catalen Number: "+Catalen(n));
    }
}
