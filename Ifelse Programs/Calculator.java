import java.util.Scanner;
public class Calculator 
{
    public static void main(String args[])
    {   
        int c;
        Scanner input=new Scanner(System.in);
        System.out.print("enter first number:");
        int a=input.nextInt();
        System.out.print("enter any charactor('+','-','*','/','%'):-");
        char op=input.next().charAt(0);
        System.out.print("enter secound number:");
        int b=input.nextInt();

        switch(op)
        {
            case '+':
            c=a+b;
            System.out.println("sum is="+c);
            break;
            
            case '-':
            c=a-b;
            System.out.println("sub is="+c);
            break;

            case '*':
            c=a*b;
            System.out.println("multy is="+c);
            break;

            case '%':
            c=a%b;
            System.out.println("shesh is="+c);
            break;

            case '/':
            c=a/b;
            System.out.println("Divition is="+c);
            break;

            default:
            System.out.println("invalid oprator");
        }

    }
}
