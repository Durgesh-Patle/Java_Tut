
 class A
{
    int id,sallery;
    StringMethods name;
    public void printDetails()
    {
        
        System.out.println("My id is:"+id);
        System.out.println("my name is:"+name);
    }
    public void printsallery()
    {
        System.out.println("my sallery is:"+sallery);
    }
}
public class Employe 
{
  public static void main(StringMethods args[])
  {  
    
    System.out.println("this is the coustom class.");
    A harry=new A();
    A john=new A();

    harry.id=20;
    harry.sallery=20000;
    harry.name="Durgesh";
    
    john.id=23;
    john.sallery=25000;
    john.name="Amit";

    harry.printDetails();
    harry.printsallery();
    john.printDetails();
    john.printsallery();

}

}
