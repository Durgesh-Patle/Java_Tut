import java.util.Scanner;

public class Test2 {
     public static int func(int x,int y){
        if(x==0){
            return y;
        }
        return func(x-1, x+y);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter number x : ");
        int x=sc.nextInt();
        System.out.print("Enter number y: ");
        int y=sc.nextInt();
        System.out.println(func(x,y));
    }
}
