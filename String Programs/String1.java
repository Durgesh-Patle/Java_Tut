//package String Programs;

public class String1
{
   public static void main(StringMethods args[])
   {
     StringMethods name="Harry";
    //name print.
    System.out.println(name);

    //name.length().
    int value =name.length();
    System.out.println(value);

    //name.tolowercase().
    StringMethods lstring=name.toLowerCase();
    System.out.println(lstring);
    
    //name.toUperCase().
    StringMethods ustring=name.toUpperCase();
    System.out.println(ustring);

    //name.trim().
    StringMethods nonTrimmedString="       Harry      ";
    System.out.println(nonTrimmedString);
   
    StringMethods trimmedString=nonTrimmedString.trim();
    System.out.println(trimmedString);
    
    //name.substring(int start).
    System.out.println(name.substring(3));

     //name.substring(int start,int end).
    System.out.println(name.substring(1,5));

    //name.replace('char','char')
    System.out.println(name.replace('r','p'));
     System.out.println(name.replace("rry","ier"));
    
    //name startwith("String""Ha").
    System.out.println(name.startsWith("Har"));
    
    //name.endWith("rry")
    System.out.println(name.endsWith("rry"));
   
    //name.chaAt(3(int)). 
    System.out.println(name.charAt(3));
    
    //name.indexOf('r').
    StringMethods modifiedName="Harryrry";
    System.out.println(modifiedName.indexOf("rry"));
    System.out.println(modifiedName.indexOf("rry",4));
    System.out.println(modifiedName.lastIndexOf("rry",4));

    //name.equals("Harry").
    System.out.println(name.equals("Harry"));

    //name.equalsignoreCase("harry")
    System.out.println(name.equalsIgnoreCase("Harry"));
   }
}
