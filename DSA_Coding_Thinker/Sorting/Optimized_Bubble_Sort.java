import java.util.*;
public class Optimized_Bubble_Sort {
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


        boolean cheack=false;
        for(int i=0;i<n;i++){
            for(int j=0;j<=n-2;j++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                    cheack=true;
                }
            }
            if(cheack==false) break;
        }

        for(int i=0;i<n;i++){
            System.out.println(arr[i]+" ");
        }
    }
}
