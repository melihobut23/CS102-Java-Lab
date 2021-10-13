/*
 * Recursive Java program to find power of an element recursively
 * 
 * @melihobut
 * @25.04.2020
 */
public class power
{
   public static void main(String[] args)
   {
      double x = 2;
      int y = 3;
      System.out.println("pow(" + x + "," + y + ") = " + power(x, y));
   }
   // Naive iterative solution to calculate pow(x, n)
   public static int power(double x, int y)
   {
      // initialize result by 1
      int pow = 1;
      // multiply x exactly n times
      for (int i = 0; i < y; i++) {
         pow = pow * (int)x;
      }
      return pow;
   }
}