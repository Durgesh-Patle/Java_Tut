import java.util.*;
public class Secound_LargestArray {
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

        int largest=arr[0];
        for(int i=1;i<n;i++){
            if(largest<arr[i]){
                largest=arr[i];
            }
        }
        System.out.println("The largest Elements in Array: "+largest);
        
        int secound=0;
        for(int i=0;i<n;i++){
            if(arr[i]>secound && arr[i]!=largest){
                secound=arr[i];
            }
        }
        System.out.println("The Secound largest Elements in Array: "+secound);
    }
}
