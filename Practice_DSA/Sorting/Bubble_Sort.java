// package Sorting;

import java.util.Scanner;

public class Bubble_Sort {
    public static void main(String[] args) {
        System.out.print("Enter length of the Array: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();

        // Time Complexity - O(n^2);
        // Bubble Sort:-Maximum elements ko end me le jata he.   paire me cheak krta he.

        // 1...
        // for(int i=0;i<n;i++){
        // for(int j=0;j<n-i-1;j++){
        // if(arr[j]>arr[j+1]){
        // int temp=arr[j];
        // arr[j]=arr[j+1];
        // arr[j+1]=temp;
        // }
        // }
        // }

        // 2....
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n ; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.print("Bubble Sort to used Sorted Array is: ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
