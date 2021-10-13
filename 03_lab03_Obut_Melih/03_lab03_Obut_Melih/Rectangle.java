/**
 * Rectangle class that inherits shape and implements selectable interface
 * 
 * @author Melih Obut
 * @date 10.03.2020
 */
public class Rectangle extends Shape implements Selectable{
   
   private int width, height;
   private boolean selected;
   
   /**
    * Constructor
    * 
    * @param x
    * @param y
    * @param width
    * @param height
    */
   public Rectangle(int x, int y, int width, int height)
   {
      super(x, y);
      this.width = width;
      this.height = height;
   }
   
   /**
    * getter method of area
    * @return area of the rectangle or square
    */
   @Override
   public double getArea()
   {
      return (double) (width * height);
   }
   
   /**
    * getter method of selection
    * @return true if selected otherwise false
    */
   public boolean getSelected()
   {
      return selected;
   }
   
   /**
    * setter methods of selection
    * @param selected
    */
   public void setSelected(boolean selected)
   {
      this.selected = selected;
   }
   
   
   /**
    * checks if given the shape within the given coordinates
    * then sets true it is within the shape else false
    * 
    * @param x coordinate
    * @param y coordinate
    */
   public void contains(int x, int y)
   {
      int coorX = this.getX();
      int coorY = this.getY();
      
      if(x >= coorX - ((double)width / 2) && x <= coorX + ((double)width / 2 ) && 
         y >= coorY - ((double)width / 2) && y <= coorY + ((double)width / 2))
      {
         setSelected(true);
      }else {
         setSelected(false);
      }
   }
   
   /**
    * String represantation of rectangle
    * @return string
    */
   public String toString()
   {
      return "Rectangle " + getArea();
   }
}
