
public class Print_Array_UsingRecursion {
//  private int ans=0;
    public static void Printarr(int []arr,int n){
        if(n==0){
            // System.out.println("Array is Empty");
            return;
        }

        // System.out.println(arr[n-1]); // Rotade Array.
        Printarr(arr, n-1);
        System.out.println(arr[n-1]);// Normal Array.
    }
    public static void main(String[] args) {
      int arr[]={1,2,3,4,5};
    //   int n=arr.length;
      Printarr(arr,arr.length);
    }
}
