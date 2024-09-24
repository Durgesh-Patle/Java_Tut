public class Exceptions {
    public static void main(String[] args) {
        // String s="Durgesh";
        // System.out.println(s.charAt(10));
        try {
              String s="Club";
            //   String s="Durgesh";
               System.out.println(s.charAt(10));
        }
        catch(Exception e) {
            System.out.println("mera name le lena.");
            // System.out.println("Exceptions Error");
        }
        finally{
            System.out.println("Main nhii janta");
        }
    }
}
