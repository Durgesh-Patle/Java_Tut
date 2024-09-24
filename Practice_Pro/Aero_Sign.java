import java.util.Scanner;

public class Aero_Sign {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number: ");
        int n = sc.nextInt();

        // for (int i = 1; i <= n; i++) {
            for(int j=1;j<=n;j++){
                for(int k=1;k<=n;k++){
                    System.out.print("* ");
                }
                System.out.println();
            }
        }
    }
// }
