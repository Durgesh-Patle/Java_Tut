// package DSA_Coding_Thinker.Adavance_DSA.Quick_Sort;

public class QuickSort {

    public static void quickSort(int arr[], int s, int e) {
        if(s<e){
        int i = partition(arr, s, e); // Jaha se Array Partition ho rhe he.

        quickSort(arr, s, i - 1);
        quickSort(arr, i + 1, e);
        }
    }
 
    public static int partition(int arr[], int s,int e) { // int index to Return the integer.
        int pi=arr[e]; // Pivot 

        int i=s-1;
        for(int j=s;j<=e;j++){
            if(arr[j]<=pi){   // Swap 
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }
        return i;

    }


    public static void main(String[] args) {
        int arr[] = {8,7,34,5,3,4,7,9};
        int n=arr.length;
        quickSort(arr, 0, n-1);
        
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
