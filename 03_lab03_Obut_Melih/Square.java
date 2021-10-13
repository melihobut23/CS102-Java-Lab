/**
 * Square class that inherits from rectangle class
 * 
 * @author Melih Obut
 * @date 10.03.2020
 */
public class Square extends Rectangle {
   
   private int side;
   
  /**
   * Constructor
   * 
   * @param side
   */
   public Square(int x, int y, int side)
   {
      super(x, y, side, side);
      this.side = side; 
   }
   
   /**
    * String represantation of square
    * @return string
    */
   @Override
   public String toString()
   {
    return "Square " + getArea();
   }
   
}
