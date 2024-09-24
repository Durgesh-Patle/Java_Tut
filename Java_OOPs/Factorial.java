// package Java_OOPs;

import java.util.Scanner;

public class Factorial {
    public static int Fact(int n){
        int ans=1;
        for(int i=1;i<=n;i++){
            ans*=i;
        }
        return ans;
    }

    public static void main(StringMethods[] args) {
        // System.out.println("5 Fact is: "+Fact(5));
        // System.out.println("6 Fcat is: "+Fact(6));

        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        System.out.println(Fact(n));
    }
}
