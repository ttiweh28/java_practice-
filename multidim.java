

public class multidim{
   public static void main(String[] args)
   {
      // Array of size 4x3 to hold integers.
      int[][] values ={
         { 10, 20 }, { 40, 60 }
      };

      // Nested loops to print the array in tabular form.
      for (int row = 0; row < 2; row++)
      {
         for (int col = 0; col < 2; col++)
         {
            System.out.print(values[row][col] + " ");
         }

         System.out.println();    // Print new line.
      }
   }
}