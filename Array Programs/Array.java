//import java.util.Scanner;
public class Array 
{
    public static void main(StringMethods args[])
    {  
 /* 
    1.Declaration and then memory allocation.
       int [] arr;
        arr=new int[5].

    2.Declaration and memory allocation.
          int [] arr=new int[5].
*/
    //3.Declaration , memory allocation  and initialization together.

         int[] arr= {1,2,3,4,5};
         int sum=0;
        for(int i=0;i<arr.length;i++)
        {
        System.out.println(arr[i]);
         sum=sum+arr[i];
        }
      System.out.println("sum is:"+sum);
    }    
}
