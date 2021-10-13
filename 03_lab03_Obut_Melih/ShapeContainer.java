import java.util.*;

/**
 * Collects shapes in arraylists and enable them to add and remove
 * moreover if it is selected it has a method rapidly find the shape
 * 
 * @author Melih Obut
 * @date 10.03.2020
 */
public class ShapeContainer {
   
   private ArrayList<Shape> shapes;
   
   /**
    * Constructor creates an empty list of shape
    */
   public ShapeContainer()
   {
      shapes = new ArrayList<Shape>();
   }
   
   /**
    * add shapes to arraylist
    * @param shape
    */
   public void add(Shape shape)
   {
      shapes.add(shape);
   }
   
   /**
    * get area of all shapes sum
    * @return totalArea
    */
   public double getArea()
   {
      double totalArea = 0;
      
      for(Shape shape : shapes)
         totalArea += shape.getArea();
      
      return totalArea;
   }
   
   /**
    * Gets first shape in given coordinate
    * 
    * @param x coor
    * @param y coor
    * @return firsts shape if it is within x and y otherwise it returns null
    */
   public Shape getFirstSuitable(int x, int y)
   {
      for(Shape shape : shapes)
      {
         ((Selectable) shape).contains(x, y);
         if(((Selectable) shape).getSelected())
         {
            return shape;
         }
      }
      
      return null;
   }
   
   /**
    * removes selected shapes from arraylist
    */
   public void removeSelected()
   {
      int index = 0;
      
      for(Shape shape : shapes)
      {
         if(((Selectable) shape).getSelected() == true)
         {
            shapes.remove(index);
         }else {
            index++;
         }
      }
      
   }
   
   /**
    * string representation of the shapes
    * 
    * @return information about shapes
    */
   public String toString()
   {
      String text = "";
      int index = 0;
      
      for(Shape shape : shapes)
      {
         if(shape instanceof Square)
         {
            text += "" + index + " " + "Square's "  + "area is " + shape.getArea() + " Is the square selected? " + ((Selectable)shape).getSelected() + "\n";
         }else if(shape instanceof Circle)
         {
            text += "" + index + " " + "Circle's " +  "area is " + shape.getArea() + " Is the circle selected?  " + ((Selectable)shape).getSelected() + "\n";
         }else
         {
            text += "" + index + " " + "Rectangle's " + "area is " + shape.getArea() + " Is the rectangle selected?  " + ((Selectable)shape).getSelected() + "\n";
         }
         
         index++;
      }
      
      return text;
      
   }
}
