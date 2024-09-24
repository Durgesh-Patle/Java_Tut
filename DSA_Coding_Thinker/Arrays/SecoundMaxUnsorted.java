import java.util.*;
public class SecoundMaxUnsorted {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Size of Array: ");
        int n = sc.nextInt();

        int arr[] = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        // Printing An Array.
        System.out.print("Array is: ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }


        Arrays.sort(arr);

        // Print the second maximum element
        if (arr.length >= 2) {
            int secondMax = arr[arr.length - 2];
            System.out.println("Second maximum element in the array: " + secondMax);
        } 
    }
}
