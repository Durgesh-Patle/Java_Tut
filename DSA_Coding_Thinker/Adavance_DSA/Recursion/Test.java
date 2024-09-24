import java.util.*;
public class Test {
    public static int func(int n){
        int i=1;
        if(n>=5){
            return n;
        }
        n=n+i;
        i++;
        return func(n);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Any number: ");
        int n=sc.nextInt();
        System.out.println(func(n));
    }
}
