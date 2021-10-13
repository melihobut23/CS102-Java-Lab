/**
 * Shape abstract Superclass that arranges all shapes location
 * 
 * @author Melih Obut
 * @date 10.03.2019
 */
public abstract class Shape implements Locatable {
   protected int x, y;
   
   public Shape(int x, int y)
   {
    setLocation(x , y);
   }
   
   public abstract double getArea();
   
  /**
   * sets location of the objects
   * @parameter the location of x and y coordinates
   */
   public void setLocation(int x, int y)
   {
    this.x = x;
    this.y = y;
   }
   
  /**
   * getter method of x
   * @return x axis of given location
   */
   public int getX()
   {
    return x;
   }
   
  /**
   * getter method of y
   * @return y axis
   */
   public int getY()
   {
    return y;
   }
}
