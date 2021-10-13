import java.util.Scanner;

/**
 * Prime gives us first 100 prime number.
 * @author melihobut
 * @date 15.02.2020
 */

public class prime
{
   public static void main(String[] args){
      
      //Constants
      final int SIZE = 100;
      final int FIRST = 2;
      int num =0;
      IntBag prime  = new IntBag();
      prime.add(FIRST); //first number of fibonacci numbers
      
      for(int i = 3; SIZE > prime.size(); i++)
      {
         int counter=0;    
         for( num = 0; num < prime.size(); num++)
         {
            if(i % prime.get(num)== 0)
            {
               counter = counter + 1;
            
            }
         }
         if (counter ==0)
         {
            //Appended the Prime number to the String
            prime.add(i);
            
         }
         
      }
      System.out.println( "The first 100 Prime Numbers are: ");
      System.out.println(prime);
   }
}