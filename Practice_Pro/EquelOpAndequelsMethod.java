public class EquelOpAndequelsMethod {
    public static void main(StringMethods[] args) {
       StringMethods s1="Hello";
       StringMethods s2="Hello";
       StringMethods s3=new StringMethods("Hello");

//      "==" Operater same Memorry Location.
       System.out.println(s1==s2);  //true
       System.out.println(s1==s3);  //false
       
//    .equals() Diffirent Memory Location.
       System.out.println(s1==s2);  //true
       System.out.println(s1.equals(s3)); //true
    }
}
