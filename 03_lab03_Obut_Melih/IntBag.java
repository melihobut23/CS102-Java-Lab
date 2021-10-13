import java.util.*;

/**
 *
 * @author melihobut
 * @date 15.02.2020
 */
public class IntBag {
   
   //Variables
   private int[] intBag;
   int valid;
   private static final int SIZE = 4;
   private static final int LAST_VALUE = 0;
   
   //Constructors 
   public IntBag(){
      intBag= new int[SIZE];
      intBag[0] = LAST_VALUE;
   }
   
   public IntBag(int desiredMaxElements){
      intBag= new int[desiredMaxElements];  
   }
   
   /*
    * add method
    * @parameter int index
    */
   
   
   public void add(int index){
      int size = getSize();
      //case if bag is not full
      if (size < intBag.length - 1) 
      {
         intBag[size] = index;
         intBag[size + 1] = 0;
      }
      
      //case if bag is almost full
      else if (size == intBag.length - 1) 
      {
         intBag[size] = index;
      }
      
      //case if bag is full, extends the bag
      else {
         int newBag [] = new int[size * 2];
         
         for (int i = 0; i<intBag.length; i++){
            newBag[i] = intBag[i];
         }
         intBag = newBag;
         intBag[size] = index;
         intBag[size + 1] = 0;
      }
   }
   /*
    * More than size of Array and add sentinel value at the end
    * @paramater value
    * @parameter index
    */
   public boolean add(int value, int index){
      
      if (index < getSize()) {
         int last = intBag[intBag.length-1];
         
         for (int i = intBag.length - 2; i >= index; i--) {
            intBag[i + 1] = intBag[i];
         }
         intBag[index] = value;
         return true;
      }
      else{
         return false;
      }
   }
   
   
   /*
    * remove the specified elements from the list
    * @paramater int value
    */
   public void remove(int value){
      int index = 0;
      while(contains(value))
      {
         if(intBag[index] == value)
         {
            remove(index);
            index--; 
         }
         index++;
      }
   }
   /*
    * to find if given value is in the list or not
    * @parameter int value
    * @return true if given value in the list otherwise false
    */
   public boolean contains(int value)
   {
      for(int element : intBag)
      {
         if(element == value)
         {
            return true;
         }
      }
      return false;
   }
   /*
    * method that return index that given value
    *
    *@param value
    *@return index
    */
   
   public int findAll(int value){
      
      for(int index = 0; index < intBag.length; index++){
         if(value == intBag[index]){
            return index;
         }
      }
      return -1;
   }
   /*
    * methods give size without zero
    * @return int
    */
   public int getSize(){
      int size = 0;
      for(int a = 0; a < intBag.length; a++)
      {
         if(intBag[a] == 0){
            a = intBag.length; // to exit loop
         }
         size++;
      }
      size--;
      return size;
   }
   /*
    * method for getting value in specified index
    * @parameter int index
    * @return int 
    */
   public int getValue(int index){
      return intBag[index];
      
   }
   /*
    * Create and instance of IntBagIterator
    *
    * @return iterator 
    */
   public Iterator iterator()
   {
      IntBagIterator iterator = new IntBagIterator(this);
      return iterator;
   }
   
   /*
    * String represantation of the array
    * @return string 
    */
   public String toString(){
      String str = "";
      boolean write = true;
      for(int i = 0; i <= intBag.length - 1 && write; i++) {
         if (getValue(i) != -1)
            str = str + intBag[i] + " ";
         else
            write = false;
      }
      return str;
   }
   
}

