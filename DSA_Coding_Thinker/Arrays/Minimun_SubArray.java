import java.util.*;
public class Minimun_SubArray {
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

        int sum=0;
        int min=Integer.MAX_VALUE;

        for(int i=0;i<n;i++){
            sum=sum+arr[i];
            min=Math.min(min, sum);
            if(sum>0){
                sum=min;
            }
        }
        System.out.println(min);
    }
}
