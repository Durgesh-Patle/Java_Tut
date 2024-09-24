public class foreach
{
    public static void main(StringMethods args[])
    {
        // float[] marks ={98f,88f,87f,89f,65f};
        // String [] students ={"harry","rohan","gita","syam","rohit"};
        // System.out.println(students.length);
        // System.out.println(students[3]);
         
        int [] marks={98,88,87,89,65};
        // Displaying the array (for loop).
        System.out.println("the array elements.");
        for(int i=0;i<marks.length;i++)
        {
            System.out.println(marks[i]);
        }
        // Displaying the array (forloop) in a reverce order.
        System.out.println("the array in a reverce order.");
        for(int i=marks.length-1;i>=0;i--)
        {
            System.out.println(marks[i]);
        }

       // Displaying the array (foreach loop).
        System.out.println("the array elements of using foreach loop.");
        for(int elements:marks)
        {
            System.out.println(elements);
        }
    }
    
}
