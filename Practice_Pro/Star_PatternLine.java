import java.util.Scanner;

public class Star_PatternLine {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Numeber: ");
        int n = sc.nextInt();

 // 1........
        // for(int i=1;i<=n;i++){
        // for(int j=1;j<=i;j++){
        // System.out.print(" ");
        // }
        // for(int j=1;j<=1;j++){
        // System.out.print("* ");
        // }
        // System.out.println();
        // }

 // 2......

        for (int i = 1; i <= n; i++) {
            for (int j = n; j >= i; j--) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
