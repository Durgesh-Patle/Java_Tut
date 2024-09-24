import java.util.*;

public class NthTime_Rotate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) { // Input the Elements of the Array
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        System.out.print("Which Time to Rotate in Array: ");
        int k = sc.nextInt();
        System.out.print(k + " Time Reverce in Array: ");

        k = k % n;
        for (int j = 0; j < k; j++) {
            int x = arr[0];
            for (int i = 0; i < n - 1; i++) {
                arr[i] = arr[i + 1];
            }
            arr[n - 1] = x;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+" ");
        }
    }
}
