// package Java_OOPs;

import java.util.Scanner;

public class PrimeNum {
    public static boolean prime(int n){

        for(int i=2;i<n;i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();

        // System.out.println(prime(n));

        boolean cheack=prime(n);

        if(cheack==true){
            System.out.println(n+" Prime Number");
            
            int fact=1;
            for(int i=1;i<=n;i++){
                fact*=i;
            }
            System.out.println(fact);
        }
        else{
            System.out.println(n+" Not Prime Number");
        }

    }
}
