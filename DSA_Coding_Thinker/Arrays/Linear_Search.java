import java.util.Scanner;

public class Linear_Search {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();
        // Linear Search .
        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Printing An Array.
        System.out.print("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.print("User Search Elements: ");
        int search = sc.nextInt();

        for (int i = 0; i < arr.length; i++) {
            if (search == arr[i]) {
                System.out.print("Array index Number: " + i);
            }
        }
    }
}
