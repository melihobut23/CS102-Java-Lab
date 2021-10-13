
/**
 *
 * @author melihobut1
 */
public class Prime {
    public static void main(String[] args){
     
    //Constants
    final int size = 100;
    int num =0;
    IntBag prime  = new IntBag();
    prime.add(2); //first number of fibonacci numbers
      
    for(int i = 1; i < size; i++)
      {
          int counter=0;    
          for( num = i; num>=1; num--)
   {
             if(i % num ==0)
      {
   counter = counter + 1;
      }
   }
   if (counter ==2)
   {
      //Appended the Prime number to the String
      prime.add(i);
             System.out.println(prime);
   }
      
      }
   }
    
}
