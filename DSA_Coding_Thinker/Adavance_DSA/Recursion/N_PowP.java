import java.util.Scanner;

public class N_PowP {
    public static int Power(int n,int p){

        if(p==0){
            return 1;
        }
        return n*Power(n, p-1);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        System.out.print("Enter Power of N: ");
        int p=sc.nextInt();

        System.out.println(Power(n, p));
    }
}
