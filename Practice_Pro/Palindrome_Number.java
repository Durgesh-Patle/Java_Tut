import java.util.Scanner;

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n=sc.nextInt();

        int temp=n;
        int rev=0;
        while(temp!=0){
            int rem=temp%10; // number to Remember find.
            rev=rev*10+rem; // reverse the number to remember to add.
            temp=temp/10; 
        }

        if(n==rev){
            System.out.println(n+" Palindrome Number");
        }
        else{
            System.out.println(n+" Not Palindrome Number");
        }
    }
}
