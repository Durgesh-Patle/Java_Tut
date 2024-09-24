import java.util.Scanner;

public class Sum_Of_Nto1 {
//    static int ans=0;
        public static int Sum(int n,int ans) {
        if (n ==0) { // Base Case.(Conditions)
            return ans;
        }
//1...
        // Sum(n-1);
        // ans+=n;
        // System.out.println(ans);
// 2...
        // return n +Sum(n-1);
// 3...
       return Sum(n-1, ans+n); 

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number to 1 counting: ");
        int n = sc.nextInt();
        // Sum(n);

        System.out.println("Sum is: "+Sum(n,0));
    }
}
