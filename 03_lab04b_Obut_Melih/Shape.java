/**
 * Shape abstract Superclass that arranges all shapes location
 * 
 * @author Melih Obut
 * @date 10.03.2019
 */
public abstract class Shape implements Locatable
{
   //constructor
   public Shape()
   {
      x = 0;
      y = 0;
   }
   
   /* getArea() method calculates area
    * @return doeble area
    */
   public abstract double getArea();
   
   //implementation of Locatable interface
   int x;
   int y;
   
   /* getX() method gets x
    * @return int x
    */
   public int getX()
   {
      return x;
   }
   
   /* getY() method gets y
    * @return int y
    */
   public int getY()
   {
      return y;
   }
   
   /* setLocation() method sets the location
    * @param int-x, int-y
    * @return void
    */
   public void setLocation( int x, int y)
   {
      this.x = x;
      this.y = y;
   }
}

