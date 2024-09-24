import java.util.Scanner;

public class Calculator 
{
    public static void main(StringMethods args[]) 
    {   
        System.out.print("enter any operator('+','-','*','/'):-");
        Scanner Sc = new Scanner(System.in);
        char op = Sc.next().charAt(0);
        System.out.println("enter two number:");
        int a = Sc.nextInt();
        int b = Sc.nextInt();
        int c;
        switch (op)
        {
            case '+':
                c = a + b;
                System.out.print("sum is=");
                System.out.print(c);
                break;

            case '-':
                c = a - b;
                System.out.print("sub is=");
                System.out.print(c);
                break;

            case '*':
                c = a * b;
                System.out.print("multy is=");
                System.out.print(c);
                break;
            
            case '/':
                c = a / b;
                System.out.print("divition is=");
                System.out.print(c);
                break;

            default:
                System.out.print("invalid operater");
                break;
        }

    }
}
