import java.util.Scanner;

public class Test5 {
     public static int func(int n){
        if(n<=1){
            return 1;
        }
        if(n%2==0) return func(n/2);
        return func(n/2)+func(n/2+1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int n=sc.nextInt();
        System.out.println(func(n));
    }
}
