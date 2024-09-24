import java.util.Scanner;

public class Test4 {
     public static void func(int n){
        if(n>4000){
            return;
        }
        System.out.println(n);
        func(2*n);
        System.out.println(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int n=sc.nextInt();
        func(n);
    }
}
