// import java.util.Scanner;

public class RepeateationBinary {
    public static void main(String[] args) {
        // Scanner sc=new Scanner(System.in);
        // System.out.println("Enter String: ");
        // String s=sc.next();
        
        String st = "100101011111100";

        // int slen = st.length();
        int crep = 1, mrep = 1;

        for (int i = 1; i<st.length(); i++) {
            if (st.charAt(i) == st.charAt(i-1)) {
                crep++;
            } else {
                mrep = Math.max(mrep, crep);
                crep = 1;
            }

        }
        mrep = Math.max(mrep, crep);
        System.out.println(mrep);

    }
}
