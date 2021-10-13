import java.lang.*; 
/**
 *
 * @author melihobut
 * @date 10.03.2020
 */
public class Circle extends Shape implements Selectable {
   public boolean selected;
   
   private int radius;
   
   /**
    * Constructor 
    * @param x,y,radius
    */
   public Circle(int x, int y, int radius)
   {
      super(x, y);
      this.radius = radius;
   }
   
   /**
    * getter method of area
    * @return area of the circle
    */
   public double getArea() 
   { 
      return Math.PI * radius * radius; 
   }
   /**
    * getter methods of selection
    * @return true if shape is selected otherwise false
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
      
      if(( (coorX - x) * (coorX - x) ) + ((coorY - y) * (coorY - y)) <= radius * radius )// circle formula
      {
         setSelected(true);
      }else {
         setSelected(false);
      }
   }
   /**
    * String represantation of circle
    * @return string
    */
   public String toString()
   {
      return "Circle " + getArea();
   }
   
}