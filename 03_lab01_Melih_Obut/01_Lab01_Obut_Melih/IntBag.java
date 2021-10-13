 /*
 * Creating Array for size 4 and doing some stuff about it
 * 
 * @Author Melih Obut
 * @Date 9.10.2019
 */
public class IntBag 
{
   private int[] ıntBag;
   private static final int SIZE = 4;
   private static final int NEGATIVE_VALUE = -1;
   
//Constructors
   public IntBag() {
       
      ıntBag = new int [SIZE];
      ıntBag[0] = NEGATIVE_VALUE;
   }
   
   /*
    * add method
    * @parameter int index
    */
   public void add(int index) 
   {
      int size = getSize();
      //case if bag is not full
      if (size < ıntBag.length - 1) 
      {
         ıntBag[size] = index;
         ıntBag[size + 1] = -1;
      }
      
      //case if bag is almost full
      else if (size == ıntBag.length - 1) 
      {
         ıntBag[size] = index;
      }
      
      //case if bag is full, extends the bag
      else {
         int newBag [] = new int[size * 2];
         
         for (int i = 0; i<ıntBag.length; i++){
            newBag[i] = ıntBag[i];
         }
         ıntBag = newBag;
         ıntBag[size] = index;
         ıntBag[size + 1] = -1;
      }
   }
   
   /*
    * More than size of Array and add sentinel value at the end
    * @paramater value
    * @parameter index
    */
   public boolean add(int value, int index){
       
      if (index < getSize()) {
         int last = ıntBag[ıntBag.length-1];
         
         for (int i = ıntBag.length - 2; i >= index; i--) {
            ıntBag[i + 1] = ıntBag[i];
         }
         ıntBag[index] = value;
         return true;
      }
      else{
         return false;
      }
   }
   
   /*
    * remove element from that index changing with
    * last element 
    * @parameter index
    */
   public void remove(int index) {
 
      ıntBag[index] = ıntBag[getSize()-1];
      ıntBag[getSize()-1] = -1;
      
   }
   
   /*
    * method for getting value in specified index
    * @parameter int index
    * @return int 
    */
   public int getValue(int k){
       
      return ıntBag[k];
   }
   
   
   /*
    * methods give size without zero
    * @return int
    */
   public int getSize() {
      int count = 0;
      boolean notFound = true;
      
      while (count < ıntBag.length && notFound) {
         if (get(count) != -1)
            count++;
         else
            notFound = false;
      }
      return count;
   }
   
   /*
    * getting the specific input's index
    * @paramater int index
    */
   public int get(int index) {,
      return ıntBag[index];
   }
   
   /*
    * remove the specified elements from the list
    * @paramater int value
    */
   public void removeAll (int singleValue){
      int count = 0;
      
      for(int j = 0; j<getSize();){
         if (ıntBag[j] == singleValue){
            remove(j);
            count ++;
         }
         else
            j++;
      }
      
      if (count == 0);
      System.out.println("This number is not in the bag!");
   }
   
   /*
    * String represantation of the array
    * @return string 
    */
   public String toString() {
      String str = "";
      boolean write = true;
      for(int i = 0; i <= ıntBag.length - 1 && write; i++) {
         if (get(i) != -1)
            str = str + ıntBag[i] + " ";
         else
            write = false;
      }
      return str;
   }
}

