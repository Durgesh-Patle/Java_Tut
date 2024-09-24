import java.util.Scanner;

public class Fabonacii_Series {
       public static int Fab(int n) {
        if (n ==0 || n==1) { // Base Case.(Conditions)
            return n;
        }

       return Fab(n-1) + Fab(n-2);

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to 1 counting: ");
        int n = sc.nextInt();
        // Sum(n);

        System.out.println("Fabonacii Series: "+Fab(n));
    }
}
