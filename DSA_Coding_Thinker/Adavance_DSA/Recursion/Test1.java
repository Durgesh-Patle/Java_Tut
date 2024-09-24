import java.util.Scanner;

public class Test1 {
    public static int func(int n){
        if(n==4){
            return n;
        }
        return 2*func(n+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int n=sc.nextInt();
        System.out.println(func(n));
    }
}
