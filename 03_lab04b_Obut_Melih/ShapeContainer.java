import java.util.*;
import java.io.*;

/**
 * Collects shapes in arraylists and enable them to add and remove
 * moreover if it is selected it has a method rapidly find the shape
 * 
 * @author Melih Obut
 * @date 07.04.2020
 */
public class ShapeContainer extends Shape implements Iterable<Shape>
{
   //properties
   
   private  ArrayList<Shape> shapes;
   
   //constructor
   public ShapeContainer()
   {
      shapes = new ArrayList<Shape>();
   }
   
   //methods
   /* iterator() method iterate shapes
    * @return shapes.iterator()
    */
   public Iterator<Shape> iterator()
   {
      return shapes.iterator();
   }
   
   /* add() method adds the selectable shape to the list
    * @param Selectable shape
    */
   public void add( Shape shape)
   {
      shapes.add(shape);
   }
   
   /* getArea() method calculates the area
    * @return double sum
    */
   public double getArea()
   {
      int sum;
      sum = 0;
      for ( int i = 0; i < shapes.size(); i++)
         sum += ( (Shape)shapes.get(i)).getArea();
      return sum;
   }
   
   /* toString() method shows all shapes in the list
    * @return String result
    */
   public String toString()
   {
      String result;
      result = "Shape container includes: " + '\n';
      for ( int i = 0; i < shapes.size(); i++)
         result += shapes.get(i).toString();
      return result;
   }
   
   /* size() method returns the number of shapes in the container
    * @return size
    */
   public int size()
   {
      return shapes.size(); 
   }
   
   /* selectAll method returns the number of shapes found at the point x,y and sets the selected property of those shapes to true
    * @param x and y
    * @return count 
    */
   public int selectAllAt( int x, int y)
   {
      
      int count = 0;
      for (Shape shape : shapes)
      {
         Shape s = ((Selectable)shape).contains(x, y);
         if (s != null)
         {
            ((Selectable)s).setSelected(true);
            count++;
         }
      }
      return count;
      
   }
   
   /* findShape() method finds the shape
    * @param int-x, int-y
    * @return 
    */
   public Shape findShape( int x, int y)
   {
      for(int i = 0; i < shapes.size(); i++)
      {
         if( ((Selectable) shapes.get(i)).contains(x,y) != null )
         {
            return ( (Selectable) shapes.get(i)).contains(x,y);
         }
      }
      return null;
   }
   
   /* removeAllSelected() method removes shapes from the list
    * @return shapes
    */
   public void removeSelectedShapes() 
   {
      for (int i = 0; i < this.shapes.size(); i++) 
      {
         if (((Selectable)this.shapes.get(i)).isSelected()) 
         {
            this.shapes.remove(i);
            i--;
         } 
      } 
   } 
}