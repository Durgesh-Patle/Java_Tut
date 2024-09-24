import java.util.*;

public class Binary_Search_ToTarget {
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

        // Arrays.sort(arr);

        // System.out.println(arr);

        System.out.print("Enter The Target Element in the Array: ");
        int target=sc.nextInt();


        int i=0;
        int j=n-1;

        while(i<j){
            int mid=i+(j-i)/2;
            if(arr[mid]==target){
                System.out.println(mid);
            }
            else if(arr[mid]<target){
                i=mid+1;
            }
            else{
                j=mid-1;
            }
            i++;
            j--;
        }
        System.out.print(i);
    }
}
