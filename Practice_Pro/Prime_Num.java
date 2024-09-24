import java.util.Scanner;

public class Prime_Num {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int num = sc.nextInt();

        boolean cheack=false;

        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                cheack=true;
                break;
            }
        }
        if(!cheack){
            System.out.println(num+ " Prime Number");
        }
        else{
            System.out.println(num+" Not A Prime Number.");
        }
    }
}
