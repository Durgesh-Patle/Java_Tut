public class FindTheWinner {
    class Solution {
        public static int findTheWinner(int n, int k) {
            // if(n<=1) return n;

            // return findTheWinner(n-1,k);

            int x = n - k;
            return x;
        }
    }

    public static void main(String[] args) {
        // int n=5;
        // int k=2;
        System.out.println(findTheWinner(5, 2));
        // findTheWinner(n,k);

    }
}
