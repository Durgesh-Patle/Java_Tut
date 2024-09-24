import java.util.*;

public class UnsortedArr_Secoundmax {

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

        int max = arr[0];
        int secoundmax = arr[0];
        
        for (int i = 1; i < n; i++) {
            if (arr[i] > max) {
                secoundmax=max;
                max = arr[i];
            }
            else if(arr[i]>secoundmax){
                secoundmax=arr[i];
            }
        }
        System.out.println("Array is secound maximum Element: " + secoundmax);

    }

}
