import java.util.Scanner;

public class Valid_Palindrome {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter String: ");
        String str = sc.nextLine();

        String z = str;

        String rev = "";

        for (int i = str.length() - 1; i >= 0; i--) {
            rev += str.charAt(i);
        }

        if (rev.equals(z)) {
            System.out.println("True");
            System.out.println(rev+"Palindrome String.");
        } else {
            System.out.println("False");
            System.out.println(rev+" Not A Palindrome String.");
        }
    }
}
