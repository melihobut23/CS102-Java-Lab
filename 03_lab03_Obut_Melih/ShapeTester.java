import java.util.Scanner;

/**
 * Shapetester class gives a menu to create shapes and arrange 
 * them in different ways
 * 
 * @author Melih Obut
 * @date 10.03.2020
 */
public class ShapeTester {
   private static final int OPTION_CREATE_OBJECT = 1;
   private static final int OPTION_ADD_SHAPES = 2;
   private static final int OPTION_PRINT = 3;
   private static final int OPTION_SELECTED = 4;
   private static final int OPTION_REMOVE_SELECTED = 5;
   private static final int OPTION_EXIT = 6;
   private static final int SHAPE_RECTANGLE = 1;
   private static final int SHAPE_SQUARE = 2;
   private static final int SHAPE_CIRCLE = 3;
   private static final int SHAPE_EXIT = 4;
   
   public static void main(String[] args)
   {
      ShapeContainer shapes = null; // to prevent not initiliaze error
      int input;
      int shapeSelect;
      Scanner scan = new Scanner(System.in);
      int xCoor, yCoor;
      
      do{
         System.out.println("1 - Create empty list of shapes");
         System.out.println("2 - Add shapes whatever you want");
         System.out.println("3 - Print all area and information about shapes");
         System.out.println("4 - Checks if the shape are in the coordinates");
         System.out.println("5 - Remove all shapes that are within x and y!!");
         System.out.println("6 - Exit");
         
         input = scan.nextInt();
         
         if(input == OPTION_CREATE_OBJECT) //Create empty list of shapes
         {
            shapes = new ShapeContainer(); // create shapecontainer object with empty arraylist
         }
         else if(input == 2) //Add shapes whatever you want
         {
            do{
               System.out.println("Enter 1 to create rectangle");
               System.out.println("Enter 2 to create square");
               System.out.println("Enter 3 to create circle");
               System.out.println("Enter 4 to exit adding menu");
               
               shapeSelect = scan.nextInt();
               
               if(shapeSelect == SHAPE_RECTANGLE) 
               {
                  int width, height;
                  System.out.println("Enter width of rectangle: ");
                  width = scan.nextInt();
                  System.out.println("Enter height of rectangle: ");
                  height = scan.nextInt();
                  System.out.println("Enter the upper left corner coordinate of rectangle x:");
                  xCoor = scan.nextInt();
                  System.out.println("Enter y coor:");
                  yCoor = scan.nextInt();
                  shapes.add(new Rectangle(xCoor, yCoor, width, height));
                  
               }else if(shapeSelect == SHAPE_SQUARE)
               {
                  int side;
                  System.out.println("Enter side of square: ");
                  side = scan.nextInt();
                  System.out.println("Enter the upper left corner coordinate of the square first x:");
                  xCoor = scan.nextInt();
                  System.out.println("y : ");
                  yCoor = scan.nextInt();
                  shapes.add(new Square(xCoor, yCoor, side));
                  
               }
               else if(shapeSelect == SHAPE_CIRCLE)
               {
                  int radius;
                  System.out.println("Enter the radius of circle: ");
                  radius = scan.nextInt();
                  System.out.println("Enter x coordinate of the center: ");
                  xCoor = scan.nextInt();
                  System.out.println("Enter y coordinate of the center: ");
                  yCoor = scan.nextInt();
                  shapes.add(new Circle(xCoor, yCoor, radius));
                  
               }
               
            }while(shapeSelect != SHAPE_EXIT);
         }
         else if(input == OPTION_PRINT) //Print all area and information about shapes
         {
            System.out.println("The total surface of the shapes: " + shapes.getArea());
            System.out.println("The info" + "\n" + shapes.toString());
         }
         else if(input == OPTION_SELECTED) //Checks if the shape are in the coordinates
         {
            System.out.println("Enter x coordinate: ");
            int x = scan.nextInt();
            System.out.println("Enter y coordinate: ");
            int y = scan.nextInt();
            
            if(shapes.getFirstSuitable(x, y) == null)
            {
               System.out.println("There is no shape that is in given coordinate!");
            }else
            {
               System.out.println("First shape that is within given x and y " + shapes.getFirstSuitable(x, y).toString());
            }
         }else if(input == OPTION_REMOVE_SELECTED) //Remove all shapes that are within x and y!!
         {
            
            shapes.removeSelected();
         }
      }while(input != OPTION_EXIT); //Exit
   }
   
}