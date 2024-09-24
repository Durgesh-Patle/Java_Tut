// import java.util.*;
public class SortOf0s_Array {

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Array Size: ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // for (int i = 0; i < n; i++) { // Input the Elements of the Array
        // arr[i] = sc.nextInt();
        // }
        // System.out.print("Array is: ");
        // for (int i = 0; i < n; i++) {
        // System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int arr[] = { 1, 0, 0, 1, 1, 0, 1, 1, 0, 0, 0, 1 };

        int n = arr.length;
        // System.out.println(n);

        int zero = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == 0)
                zero++;
        }
        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            if (zero > 0) {
                arr[i] = 0;
                System.out.print(arr[i]+" ");
                zero--;
            } else {
                arr[i] = 1;
                System.out.print(arr[i]+" ");
            }
        }

    }
}
