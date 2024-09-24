import java.util.*;
public class SingleNum_Array {
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
// X-OR Operater Using to Find A Single Array.
        int value=0;
        for(int i=0;i<n;i++){
            value=value^arr[i];
        }
        System.out.println("Single Elements This Array: "+value);
    }
}
