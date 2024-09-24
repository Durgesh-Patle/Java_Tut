import java.util.Scanner;

public class Excel_Sheet_Col {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();

        int sum=0,p=0;

        int n=s.length();

        for(int i=n-1;i>=0;i--){
            int temp=s.charAt(i)-64;
            sum+=(int)Math.pow(26, p++)*temp;
        }

        System.out.println("Sum is : "+sum);
    }
}
