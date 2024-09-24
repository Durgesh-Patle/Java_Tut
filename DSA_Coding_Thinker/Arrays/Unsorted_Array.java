import java.util.*;

public class Unsorted_Array {
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
        int max = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        System.out.println("Array is maximum Element: " + max);

        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] < max) {
                max = arr[i];
            }
        }
        // System.out.println();
        System.out.println("Array is minimum Element: " + min);
    }
}
