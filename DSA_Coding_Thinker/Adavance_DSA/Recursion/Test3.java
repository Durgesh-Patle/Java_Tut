import java.util.Scanner;

public class Test3 {
     public static void func(int n){
        if(n==0){
            return;
        }
        System.out.print(n%2);
        func(n/2);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int n=sc.nextInt();
        func(n);
    }
}
