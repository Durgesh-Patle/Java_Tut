public class Maximum_Product_SubArray {
    public static void main(String[] args) {
        int arr[]={4,0,-5,6,-7,0,4,8,2};

        int multy=1;
        int max=arr[0];

        for(int i=0;i<arr.length;i++){

            if(arr[i]<0){
                arr[i]=1;
            }

            multy*=arr[i];
            max=Math.max(max, multy);

            if(multy<0){
                max=1;
            }
        }
        System.out.println(max);
    }
}
