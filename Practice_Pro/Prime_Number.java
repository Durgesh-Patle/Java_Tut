import java.util.Scanner;

public class Prime_Number {
    public static void main(String[] args) {
        System.out.print("Enter number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();

        int temp=0;

        for(int i=2;i<n/2;i++){
            if(n%i==0){
                temp+=1;
            }
        }

        if(temp>0){
            System.out.println(n +" Not Prime number");
        }
        else{
            System.out.println(n+ " Prime number");
        }
        
        
    }
}
