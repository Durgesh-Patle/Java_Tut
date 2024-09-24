import java.util.Scanner;

public class SquereRoot {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Number: ");
        int n=sc.nextInt();

        int a=(int)Math.sqrt(n);
        
        System.out.println(a);
        }
    }
