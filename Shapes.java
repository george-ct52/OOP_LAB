import java.util.*;
/*Write a java program to create an abstract class named Shape 
that contains an empty method named numberOfSides( ). 
Provide three classes named Rectangle, Triangle and Hexagon 
such that each one of the classes extends the class Shape. 
Each one of the classes contains only the method numberOfSides( )
 that shows the number of sides in the given geometrical structures.
  */

abstract class Shapes 
{
    abstract void numberOfSides();
    
}

class Rectangle extends Shapes
{
    void numberOfSides()
    {
        System.out.println("Number of Sides in Rectangle = 4");
    }
}
class Triangle extends Shapes
{
    void numberOfSides()
    {
        System.out.println("Number of Sides in triangle = 3");
    }
}
class Hexagon extends Shapes
{
    void numberOfSides()
    {
        System.out.println("Number of Sides in Hexagon = 6");
    }
}
public class Program
{
    Hexagon hex = new Hexagon();
    hex.numberOfSides();

}