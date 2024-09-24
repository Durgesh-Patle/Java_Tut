public class twoarray 
{
    public static void main(StringMethods[] args) 
    {
       // int [] marks;  //A 1-D aaray.
        int[][] flats;  // B 2-d array.
         flats =new int [2][2];
         flats[0][0]=1;
         flats[0][1]=2;
         //flats[0][2]=3;
         flats[1][0]=4;
         flats[1][1]=5;
        // flats[1][2]=6;

        // Displaying the array (for loop).
        System.out.println("the array elements.");
        for(int i=0;i<flats.length;i++)
        { 
         for(int j=0;j<flats[i].length;j++)
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.print("\n");
        }
    }
    
}
