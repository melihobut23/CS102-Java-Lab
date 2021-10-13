import java.util.Iterator;
/*
 * TestIterator
 * 
 * @name Melih Obut
 * @date 10.03.2020
 */
public class TestIterators {
   
   public static void main(String[] args)
   {
      Iterator i, j;
      IntBag bag = new IntBag();
      
      bag.add(1);
      bag.add(2);
      bag.add(3);
      
      
     
      i = new IntBagIterator( bag ); //adding 1,2,3 to the i Iterator
      
      while ( i.hasNext() ) // Checking if there is any object that iterator i shows 
      {
         System.out.println( i.next() ); // To go next object and print it out  
         
         j = new IntBagIterator( bag );  //adding 1,2,3 to the j Iterator
         //j = bag.iterator(); // using exist iterator method
         
         while ( j.hasNext() ) // Checking if there is any object that iterator j shows 
         {
            System.out.println( "--" + j.next() ); // To go next object and print it out 
         }
      }
      
   }
}
