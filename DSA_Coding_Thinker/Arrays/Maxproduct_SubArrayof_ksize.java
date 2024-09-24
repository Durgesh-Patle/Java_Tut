import java.util.*;

public class Maxproduct_SubArrayof_ksize {
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

        System.out.print("Enter the Sliding Window size to find the Max Product: ");
        int k = sc.nextInt();

        int max=Integer.MIN_VALUE;
        int pro=1;
        for (int i = k; i < n; i++) {
            pro *= arr[i];
        }
        for(int i=0;i<n;i++){  
            pro /= arr[i - k];
            pro *= arr[i];
            max=Math.max(pro,max);
            if(pro==0)
            pro=1;
          }

          pro=1;
          for(int i=n-1;i>=0;i--){
            pro /= arr[i - k];
            pro *= arr[i];
            max=Math.max(pro,max);
            if(pro==0)
            pro=1;
          }

        System.out.println("Maximum Product of Subarray of size " + k + ": " + max);
    }
}
