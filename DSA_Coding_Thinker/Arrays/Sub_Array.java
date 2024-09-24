import java.util.*;

public class Sub_Array {
    public static void main(String[] args) {
 // 1......

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        // SubArray to print in Array.
        // char arr[] = new char[n];

        for (int i = 0; i < n; i++) { // Input the Elements of the Array
            // arr[i] = sc.next().charAt(0);
            arr[i] = sc.nextInt();
        }

        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
// 2........

        // char arr[] = { 'A', 'B', 'C', 'D' };

        // int n = arr.length;
        System.out.println("Sub Array is: ");
        // for (int i = 0; i < n; i++) { // Sticky loop.
        // for (int j = i; j < n; j++) { // Moving Loop.
        // int sum=0;
        // for (int k = i; k <= j; k++) { // Printing Loop.
        // // System.out.print(arr[k] + " ");
        // sum+=arr[k];
        // }
        // System.out.println("Sum is:"+sum);
        // }
        // System.out.println();
        // }

// 3....

        for (int i = 0; i < n; i++) { // Sticky loop.
            int sum = 0;
            for (int j = i; j < n; j++) { // Moving Loop.
               sum+=arr[j];
               System.out.println("Sum is:" + sum);
            }
        }
    }
}
