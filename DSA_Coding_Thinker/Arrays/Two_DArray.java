import java.util.Scanner;

public class Two_DArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows size: ");
        int rows = sc.nextInt();
        System.out.print("Enter Col size: ");
        int col = sc.nextInt();
        // 1....
        int[][] mat = new int[rows][col];

        System.out.println("Enter two D Array Elements: ");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Two D Array is:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

        // 2...
        // boolean cheack=true;

        // // System.out.println("Matrix Are Diognal Or not? ");
        // for(int i=0;i<rows;i++){
        // for(int j=0;j<col;j++){
        // if(i!=j && mat[i][j]!=0){
        // cheack=false;
        // }
        // }
        // }

        // if(cheack==true){
        // System.out.println("Yes");
        // }
        // else{
        // System.out.println("NO");
        // }

        // 3.....

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                if (i < j) {
                   int temp = mat[i][j];
                    mat[i][j] = mat[j][i];
                    mat[j][i] = temp;
                }
            }
        }
// transpose the matrix.
System.out.println("Transpose the Matrix :");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(mat[i][j] + " ");
            }
            System.out.println();
        }

    }
}
