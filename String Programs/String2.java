public class String2
{
  public static void main(StringMethods args[])
  {
    StringMethods str="ANKUSH";
    StringMethods str2=new StringMethods ("ANKUSH");
    if(str.equals(str2))
    //if(str==str2)
    {
      System.out.println("Both are equal.");
    }
    else
    {
       System.out.println("Not equal.");
    }
  }    
}
