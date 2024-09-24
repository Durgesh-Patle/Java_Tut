// package Java_OOPs;

import java.util.Scanner;

public class  TwoNumDivided {
    public static int sum(int n, int m) {
        int s=0;

        for(int i=1;i<=n;i++){
            if(i%m==0){
                s+=i;
            }
        }
        // System.out.println(s);
        return s;

    }

    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();
        System.out.print("Enter Number: ");
        int m = sc.nextInt();

        System.out.println(sum(n,m));

    }
}
