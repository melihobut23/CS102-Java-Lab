import java.util.Iterator;
/*
 * Iterator class 
 * 
 * @name Melih Obut
 * @date 10.03.2020
 */
public class IntBagIterator implements Iterator{
   private IntBag bag;
   private int index;
   
   /*
    * constructor 
    * ıntBag is reference and index keep track of
    * 
    */
   public IntBagIterator(IntBag aBag) 
   {
      bag = aBag; 
      index = aBag.getSize();
   }
   
   /*
    * Simply determines index is less than the number of elements in set
    * @return boolean
    */
   @Override
   public boolean hasNext() {
      
      if(0 < index)
      {
         return true;
      }
      
      return false;
   }
   
   /*
    * Simply return the integer object
    * @return value
    */
   @Override 
   public Integer next() {
      if(hasNext())
      {
         index--;
         return (Integer) bag.getValue(index );
      }else {
         return null;
      }
   }
   
}
