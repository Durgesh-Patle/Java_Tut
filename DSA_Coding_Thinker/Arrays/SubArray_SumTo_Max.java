import java.util.*;

public class SubArray_SumTo_Max {
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

        // int arr[] = { 16, 5, 4, 3 };
        // int n = arr.length;


        int max = 0;
        for (int i = 0; i < n; i++) {
            int sum = 0;
            for (int j = i; j < n; j++) {
                sum += arr[j];
            }
            System.out.println(sum);
            // max = Math.max(max, sum);
        }
    }
}
