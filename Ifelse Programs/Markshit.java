import java.util.Scanner;
public class Markshit 
{
    public static void main(StringMethods args[])
    {   int avrg,total;
        System.out.print("enter physics number:");
        Scanner phy=new Scanner(System.in);
        int a=phy.nextInt();
        if(a>=85 && a<=100)
        {   
            System.out.println("Pass in physics");
            System.out.println("A+ grade");
        }
        else if(a>=33 && a<=55)
        {    
            System.out.println("Pass in physics");
            System.out.println("C grade");
        }
        else if(a>=55 && a<=65)
        {   
            System.out.println("Pass in physics");
            System.out.println("B grade");
        }
        else if(a>=65 && a<=85)
        {   
            System.out.println("Pass in physics");
            System.out.println("A grade");
        }
        else
        {
            System.out.println("fail in physics");
        }

        System.out.print("enter maths number:");
        Scanner math=new Scanner(System.in);
         int b=math.nextInt();
        if(b>=85 && b<=100)
        {   
            System.out.println("Pass in maths");
            System.out.println("A+ grade");
        }
        else if(b>=33 && b<=55)
        {    
            System.out.println("Pass in maths");
            System.out.println("C grade");
        }
        else if(b>=55 && b<=65)
        {   
            System.out.println("Pass in maths");
            System.out.println("B grade");
        }
        else if(b>=65 && b<=85)
        {   
            System.out.println("Pass in maths");
            System.out.println("A grade");
        }
        else
        {
            System.out.println("fail in maths");
        }

        System.out.print("enter chemestry number:");
        Scanner chem=new Scanner(System.in);
        int c=chem.nextInt();
        if(c>=85 && c<=100)
        {
            System.out.println("Pass in chemestry");
            System.out.println("A+ grade");
        }
         else if(c>=33 && c<=55)
        {    
            System.out.println("Pass in chemestry");
            System.out.println("C grade");
        }
        else if(c>=55 && c<=65)
        {   
            System.out.println("Pass in chemestry");
            System.out.println("B grade");
        }
        else if(c>=65 && c<=85)
        {   
            System.out.println("Pass in chemestry");
            System.out.println("A grade");
        }
        else
        {
            System.out.println("fail in chemestry");
        }

        total= a+b+c;
        System.out.print("total is:");
        System.out.println(total);

        avrg= total/3;
        System.out.print("Average is:");
        System.out.println(avrg);
    }
}
