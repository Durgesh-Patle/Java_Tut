public class constractor 
{  
    int a; 
    StringMethods name;
    boolean c;
   constractor ()
    {
       a=0; 
       name=null;
       c=true;
    }

    void Disp()
    {
        System.out.println(a+" "+name+""+c);
    }
}
class B
{
    public static void main(StringMethods[] args)
         {
           constractor ref = new constractor();
            ref.Disp();
         }
   }
