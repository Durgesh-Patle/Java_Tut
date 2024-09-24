import java.util.*;
public class Maximum_SubArray {
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

        int sum=0;
        // int max=Integer.MIN_VALUE;
        int max=arr[0];
//
        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            max=Math.max(max, sum);
            
            if(sum<0){
                sum=0;
            }
        }
        System.out.println(max);
    }
}
