import java.util.*;
public class Insertion_Sort {
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


        for(int i=1;i<n;i++){  
            int current=arr[i];
            int j=i-1;
            while (j>=0 && arr[j]>current) {     // Right Rotade in Array.
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=current;
        }
        
        // Printing Array Elements.
      System.out.print("Insertion Sort : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
