import java.util.Scanner;

public class ProductOf_Array_UseRecursion {
    public static int Printarr(int[] arr, int n) {
        if (n == 0) {
            return 1;
        }

        return arr[n - 1] * Printarr(arr, n - 1);
    }
}

public static void main(String[] args) {
    int arr[] = { 1, 2, 3, 4, 5 };
    int n = arr.length;

    // System.out.print("Enter the length of Array: ");
    // Scanner sc=new Scanner(System.in);
    // int n=sc.nextInt();

    // int arr[]=new int[n];
    // for(int i=0;i<n;i++){
    // arr[i]=sc.nextInt();
    // }
    // System.out.print("Array is: ");
    // for(int i=0;i<n;i++){
    // System.out.print(arr[i]+" ");
    // }
    // System.out.println();

    // int pro= Printarr(arr,n-1);

    System.out.println("Product of the Array: " + Printarr(arr, n - 1));
}
