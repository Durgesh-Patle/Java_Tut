import java.util.Scanner;

public class NumberOf1Bits {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter String: ");
        String s=sc.nextLine();

        int slen=s.length();
        int c=0;

        for(int i=slen-1;i>=0;i--){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        System.out.println(c);
    }
}
