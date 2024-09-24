public class ConsecetiveIsone {
    public static void main(String[] args) {
        String s="0110111110111";

        int count =0,ans=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                count++;
            }
            else{
                ans=Math.max(ans, count);
                count=0;
            }
        }
        System.out.println(ans);
    }
}
