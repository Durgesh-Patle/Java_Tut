import java.util.Scanner;

public class Half_Trangle {

    public static void main(StringMethods[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        // System.out.println(n);

        for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            for (int j =n-i-1 ; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }

}
