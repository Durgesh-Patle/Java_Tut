import java.util.Scanner;

public class AddBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter First Binary Number: ");
        String a = sc.nextLine();
        System.out.print("Enter Second Binary Number: ");
        String b = sc.nextLine();

        int carry = 0;
        int i = 0;
        int alen = a.length();
        int blen = b.length();
        String res = "";

        while (i < alen || i < blen || carry != 0) {
            int x = 0;
            if (i < alen && a.charAt(alen - i - 1) == '1') {
                x = 1;
            }
            int y = 0;
            if (i < blen && b.charAt(blen - i - 1) == '1') {
                y = 1;
            }

            res = (x + y + carry) % 2 + res;
            carry = (x + y + carry) / 2;
            i++;
        }
        System.out.println("Sum of binary numbers: " + res);
    }
}
