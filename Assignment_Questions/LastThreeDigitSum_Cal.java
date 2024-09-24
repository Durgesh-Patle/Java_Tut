import java.util.Scanner;

public class LastThreeDigitSum_Cal {

    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Number: ");
        int n = sc.nextInt();

        int sum = 0;

        for (int i = n; i>n-3; i--) {
            if(i>=0){
                sum += i;
                System.out.println(i);
            }
        }
        System.out.println("Sum is: "+sum);
    }
}
