import java.util.Scanner;
public class Week
{
    public static void main(StringMethods args[])
    {  
        System.out.print("Enter any number:");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
    //int n=2;
    switch (n) 
    {
        case 1:
             System.out.println("monday");
            break;
        case 2:
             System.out.println("tuesday");
            break;
        case 3:
             System.out.println("wednesday");
            break;
        case 4:
             System.out.println("thrusday");
            break;
        case 5:
             System.out.println("friday");
            break; 
        case 6:
             System.out.println("suturday");
            break;
        case 7:
             System.out.println("sunday");
            break;              
        default:
            System.out.println("invalid number");
            break;
    }
} 
}
