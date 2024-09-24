// package Java_OOPs;

import java.util.Scanner;

public class Parametraized_Method {
// 1....... Not Return type
    // public static void add(int a, int b){
    //     System.out.println("Sum is: "+a+b);
    // }
    // public static void main(String[] args) {
        
        // Scanner sc=new Scanner(System.in);
    //     System.out.println("Enter Two Number: ");
    //     int a=sc.nextInt();
    //     int b=sc.nextInt();
    //     add(a, b);
    // }

//  2.....   Return Type .
    public static int add(int a, int b){
        return(a+b);
    }

    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Two Number: ");
            int a=sc.nextInt();
            int b=sc.nextInt();

            System.out.println("Sum is: "+add(a, b));
    }

}
