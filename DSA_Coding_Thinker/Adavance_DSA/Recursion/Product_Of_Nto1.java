import java.util.Scanner;

public class Product_Of_Nto1 {
       public static int Pro(int n) {
        if (n==0) { // Base Case.(Conditions)
            return 1;
        }

       return n*Pro(n-1); // recursive case.
    } 

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        // Sum(n);

        System.out.println("Product is: "+Pro(n));
    }
}
