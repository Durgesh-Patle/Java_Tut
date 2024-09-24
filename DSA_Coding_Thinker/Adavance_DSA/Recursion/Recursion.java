// package DSA_Coding_Thinker.Adavance_DSA.Recursion;

import java.util.Scanner;

public class Recursion {
    // Tail Recursive.
    public static void print(int n) {
        if (n == 0) { // Base Case.(Conditions)
            return;
        }

        // Tail
        // System.out.print(n + " ");
        print(n - 1); // Recursive case.(loopping)

        // head
        // print(n-1); // Recursive case.(loopping)
        // System.out.println(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to 1 counting: ");
        int n = sc.nextInt();
        print(n);
    }
}
