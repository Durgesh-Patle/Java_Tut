import java.util.Scanner;

public class Permutations {
    public static void main(StringMethods[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        if(n==1) System.out.println("NO SOLUTION");
        if(n==3) System.out.println("NO SOLUTION");

        for(int i=n;i>=2;i--){
            if(i%2==0){
                System.out.print(i+" ");
            }  
        }

        for(int i=n;i>=1;i--){
            if(i%2!=0){
                System.out.print(i+" ");
            }  
        }
    }
}
