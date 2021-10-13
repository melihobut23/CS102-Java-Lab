import java.util.*;

/**
 * IntBag allows a variable sized collection of integer values be stored.
 * @author melihobut
 * @date 15.02.2020
 */
public class IntBag {
  
  //Variables
  private int[] intBag;
  private int valid;
  private static final int SIZE = 100;
  private static final int LAST_VALUE = -1;
  
  //Constructors 
  public IntBag(){
    intBag= new int[SIZE];
    valid = 0;
  }
  
  public IntBag(int desiredMaxElements){
    intBag= new int[desiredMaxElements];  
    valid =0;
  }
  //methods
  
  /*
   * Adding numbers
   * add method
   * @parameter int value
   */
  
  public void add(int value){
    if(valid != intBag.length){
      valid++;
      intBag[valid - 1] = value;
    }
    else{
      System.out.println("Bag is full");
      
    }
  }
  /*
   * Adding numbers
   * @paramater value
   * @parameter index
   */
  public void add (int value, int index)
  {
    if (index >= valid)
    {
      System.out.println( "Index is not inside");
    }
    else if (valid == intBag.length)
    {
      System.out.println( "There is no place.");
    }
    else
    {
      for (int i = valid - 1; index <= i; i --)
      {
        intBag[i + 1] = intBag[i];
      }
      intBag[index] = value;
      valid++;
    }
  }
  
  
  /*
   * remove the specified elements from the list
   * @paramater int value
   */
  public void remove(int index){
    
    if(index < valid){
      for (int i = index; i < valid; i++)
      {
        intBag[i] = intBag[i + 1];
      }
      valid--;
    }
    else{
      System.out.println("Index is not there");
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
  
  public IntBag findAll(int value){
    IntBag index=new IntBag(100);
    for(int i = 0; i < intBag.length; i++){
      if(intBag[i] == value){
        index.add(i);
      }
    }
    return index;
  }
  /*
   * methods give size without zero
   * @return int
   */
  public int size(){
    return valid;
  }
  /*
   * method for getting value in specified index
   * @parameter int index
   * @return int 
   */
  public int get(int index){
    return intBag[index];
    
  }
  /*
   * String represantation of the array
   * @return string 
   */
  public String toString(){
    
    String str = "";
    boolean write = true;
    for(int i = 0; i < valid && write; i++) {
      if (get(i) != -1)
        str = str + intBag[i] + " ";
      else
        write = false;
    }
    return str;
  }
  
}

