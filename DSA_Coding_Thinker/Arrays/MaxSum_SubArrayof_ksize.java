import java.util.*;
public class MaxSum_SubArrayof_ksize {
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

        System.out.print("Which Sliding Window to find the Max_Sum: ");
        int k=sc.nextInt();

        int sum=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }

        int max=sum;

        for(int i=k;i<arr.length;i++){
            sum-=arr[i-k];
            sum+=arr[i];
            max=Math.max(max, sum);
        }
        System.out.println(max);
    }
}
