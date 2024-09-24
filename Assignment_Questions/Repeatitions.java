import java.util.Scanner;

public class Repeatitions {
    public static void main(StringMethods[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter any string: ");

        StringMethods s = sc.nextLine();

        int crep = 1, maxrep = 1;

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) == s.charAt(i - 1)) {
                crep++;
            } else {
                maxrep = Math.max(maxrep, crep);
                crep = 1;
            }
            maxrep = Math.max(maxrep, crep);
        }

        System.out.println("Repeatitions Max Character Value :" + maxrep);
        sc.close();
    }
}
