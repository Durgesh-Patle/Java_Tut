// public class Static_Variables {
    // public static void main(String[] args) {
        //System.out.println(Test.a); // without static keyword Can Error  this Program.
        // To access the orther class.
    // }
// }

class Static_Variables{
   static int a=10;

     void m1(){
        System.out.println(a);
     }
   public static void main(String[] args) {
        System.out.println(a);
        Static_Variables ob=new Static_Variables();
        ob.m1();
    }

}
