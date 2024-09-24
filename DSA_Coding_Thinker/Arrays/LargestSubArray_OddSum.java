import java.util.*;

public class LargestSubArray_OddSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // System.out.print("Enter Array Size: ");
        // int n = sc.nextInt();

        // int arr[] = new int[n];

        // for (int i = 0; i < n; i++) { // Input the Elements of the Array
        //     arr[i] = sc.nextInt();
        // }

        // System.out.print("Array is: ");
        // for (int i = 0; i < n; i++) {
        //     System.out.print(arr[i] + " ");
        // }
        // System.out.println();

        int arr[]={10,2,3,4,5,6,2,4,1,7};
        int n=arr.length;

        int count = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] % 2 == 1) {
                count++;
            }
        }
        if (count % 2 == 1) {
            System.out.println(n);
        } 
        else {
            int left = 0, right = 0;
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 1) {
                    left = i;
                    break;
                }
            }
            for (int i = n - 1; i >= 0; i++) {
                if (arr[i] % 2 == 1) {
                    right = i;
                    break;
                }
            }
            int ans=Math.max((n-left-1), right);
            System.out.println(ans);
        }
    }
}
