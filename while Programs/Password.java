import java.util.Scanner;
public class Password
{
  public static void main(StringMethods args[])
  {
    int n,pass=10;
    System.out.println("enter Password:");
    Scanner Sc=new Scanner(System.in);
    n=Sc.nextInt();
    while(pass!=0)
    {
      if(n==2784)
      {
        System.out.println("Correct Password.");
        System.out.println("Thank you.");
        pass=0;
      }
       else
      {
        System.out.println("Incorrect Password.");
        System.out.println("Pleace try again.");
        pass=0;
      }
    } 
        
  }   

}
