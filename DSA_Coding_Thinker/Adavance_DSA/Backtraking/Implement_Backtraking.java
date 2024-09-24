// package DSA_Coding_Thinker.Adavance_DSA.Backtraking;

// Find All Possiable Solutions & use the one you Want.(Pahle use Kren Phir trust kre..).

public class Implement_Backtraking {
    public static void printPremutation(String s,String perm,int idx ) {

        if(s.length()==0){
            System.out.println(perm);
            return;     
        }

        for(int i=0;i<s.length();i++){
            char currchar=s.charAt(i);
            String str=s.substring(0, i)+s.substring(i+1);
            printPremutation(str, perm+currchar, idx+1);
        }
        
    }
    public static void main(String[] args) {
        String s="ABC";
        printPremutation(s, "", 0);
    }
    
}
