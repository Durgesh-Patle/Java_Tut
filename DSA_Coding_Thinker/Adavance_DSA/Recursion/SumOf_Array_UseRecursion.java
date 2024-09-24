// import java.util.Scanner;

public class SumOf_Array_UseRecursion {
    public static int Printarr(int[] arr, int n) {
        if (n==0) {
            return 0;
        }

       return arr[n-1]+Printarr(arr, n-1);
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5 };
        int n=arr.length;

        // System.out.print("Enter the length of Array: ");
        // Scanner sc=new Scanner(System.in);
        // int n=sc.nextInt();

        // int arr[]=new int[n];
        // for(int i=0;i<n;i++){
        //     arr[i]=sc.nextInt();
        // }
        // System.out.print("Array is: ");
        // for(int i=0;i<n;i++){
        //     System.out.print(arr[i]+" ");
        // }
        // System.out.println();
        
       int sum= Printarr(arr,n);

       System.out.println("Sum of the Array: "+sum);

    }
}
