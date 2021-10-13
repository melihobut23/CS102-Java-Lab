/*
 * Display the first 40 fibonacci numbers 
 * by making use of the fact that the first two fibonacci numbers are 0 and 1,
 * 
 * @Author Melih Obut
 * @Date  09.10.2019
 */

public class fıbonacciTest
{
   public static void main(String[] args)
   {
     //Constants
      final int FIBONACCI_SIZE = 40;
      
      //Fibonacci Numbers
      IntBag fibonacci  = new IntBag();
      fibonacci.add(0); //first number of fibonacci numbers
      fibonacci.add(1); //second number of fibonacci numbers
      
      for(int i = 0; i < FIBONACCI_SIZE - 1; i++)
      {
         fibonacci.add(fibonacci.getValue(i) + fibonacci.getValue(i + 1));
      }
      
      System.out.println(fibonacci);
      System.out.println(fibonacci.getSize() - 1);
   }
}
