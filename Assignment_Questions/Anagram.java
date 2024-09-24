import java.util.Arrays;
// import java.util.Scanner;

public class Anagram {
    public static void main(String[] args) {
        // Scanner sc= new Scanner(System.in);
        // System.out.print("Enter first String: ");
        // String s1=sc.nextLine();
        // System.out.print("Enter secound String: ");
        // String s2=sc.nextLine();

        String s1 = "listen";
        String s2 = "silent";

        if (s1.length() == s2.length()) {
            char arr[] = s1.toCharArray();
            char brr[] = s2.toCharArray();

            Arrays.sort(arr);
            Arrays.sort(brr);

            if (Arrays.equals(arr, brr)) {
                System.out.println("Its Anagram");
            } else {
                System.out.println("Not Anagram");
            }

        } else {
            System.out.println("Not Anagram");
        }

    }
}
