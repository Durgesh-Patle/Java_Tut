import java.util.Scanner;

public class SumOfArray {
    public static void main(String[] args) {
        // int arr[]={1,2,3,4,5,6};

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Array Size: ");
        int n = sc.nextInt();

        int arr[] = new int[n];
        // System.out.print("Enter Array Elements: ");

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
        }
        System.out.println("Sum is: " + sum);

        int product = 1;
        for (int i=0;i<n;i++) {
            product *=arr[i];
        }
        System.out.println("Product of array elements: " + product);
    }
}
