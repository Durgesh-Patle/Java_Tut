// package DSA_Coding_Thinker.Adavance_DSA.Merge_Sort;

public class MergeSort {
    public static void conquere(int arr[], int s, int mid, int e) {
        int n1 = mid + 1 - s; // left Array length.
        int n2 = e - mid; // right Array length

        // empty Array Create.
        int L[] = new int[n1];
        int R[] = new int[n2];

        // Insert the Elements left Array.
        for (int i = 0; i < n1; i++) {
            L[i] = arr[s + i];
        }

        // Insert the Elements right Array.
        for (int i = 0; i < n2; i++) {
            R[i] = arr[mid + 1 + i];
        }

        // merge two sorted Array.
        int n = n1 + n2;
        int mergearr[] = new int[n];

        int i = 0, j = 0, k = 0;
        while (i < n1 && j < n2) {
            if (L[i] < R[j]) {
                mergearr[k] = L[i];
                i++;
                k++;
            } else {
                mergearr[k] = R[j];
                j++;
                k++;
            }
        }

        while (i < n1) {
            mergearr[k] = L[i];
            k++;
            i++;
        }
        while (j < n2) {
            mergearr[k] = R[j];
            k++;
            j++;
        }

        // Copy merged array back to original array
        for (int p = 0; p < n; p++) {
            arr[s + p] = mergearr[p];
        }

    }

    public static void divide(int arr[], int s, int e) {
        if (s >= e) {
            return;
        }
        int mid = s + (e - s) / 2; // Split Index.
        divide(arr, s, mid); // left Array.Array.
        divide(arr, mid + 1, e); // Right Array.

        conquere(arr, s, mid, e); // merge sort
    }

    public static void main(String[] args) {
        int arr[] = { 7, 9, 1, 3, 5, 11, 2, 4 };
        // int arr[]={8,6,2,3,9,4,3};
        int n = arr.length;
        divide(arr, 0, n - 1);
        
        // Print the Sorted Array.
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        // System.out.println();
    }
}
