public class Practicearray 
{
    public static void main(StringMethods[] args) 
    { 
    /*  1. first problem .
        float [] marks={23.5f,34.5f,56.5f,12.4f};
        float sum =0;
        for(float element:marks)
        {
            sum=sum+element;
        }
        System.out.println("the value of sum is:"+sum);
    }  
    */
     // 2.secound problem.   
      float [] marks={23.5f,34.5f,56.5f,12.4f};
      float num=59.5f;
      boolean isInArray=false;
      for(float  element:marks)
      {
        if(num==element)
         {
            isInArray=true;
            break;
         }
      }
      if(isInArray)
      {
         System.out.println("the value is present in the array");
      }
      else
      {
        System.out.println("the value is not present in the array");
      }
    }
}
