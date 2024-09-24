// package Assignment_Questions;

import java.util.Scanner;

public class Weired_Algo {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        while (n > 1) {
            System.out.print(n + " ");
            
            if (n % 2 == 1) {
                n = n * 3 + 1;
            } else {
                n = n / 2;
            }
            

        }
        System.out.print(n);
    }
}
