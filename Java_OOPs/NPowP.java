import java.util.Scanner;

public class NPowP {

    public static int Power(int n,int p){
        int res=1;
        // for(int i=1;i<=p;i++ ){
        //     res*=n;
        // }

        while(p>0){
            res*=n;
            p--;
        }
        
        return res;
    }
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();
        System.out.print("Enter Power: ");
        int p=sc.nextInt();

        System.out.println("Power is: "+Power(n, p));
    }
}
