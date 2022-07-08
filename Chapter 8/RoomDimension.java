/**
   Chapter 8 Challenge 3 page 552
   Part 1 of 3 - RoomDimension Class
   Thane Reynolds
*/

// This class will create a room object with a method to get area, a method to set dimensions, and a method to get all of the information as a string

public class RoomDimension
{
   private int length;
   private int width;
   private int area;
   
   public RoomDimension(int len, int wid) // constructor
   {
      length = len;
      width = wid;
   }
   
   public RoomDimension() // No Arg to be safe
   {
      length = 1;
      width = 1;
   }
   
   public RoomDimension(RoomDimension object2)
   {
      length = object2.length;
      width = object2.width;
   }
   
   public void setLength(int len) // to set length if entered incorrectly or no arg is used
   {
      length = len;
   }
   
   public void setWidth(int wid) // to set length if entered incorrectly or no arg is used
   {
      width = wid;
   }
   
   public int getArea() // returns area
   {
      return length * width;
   }
   
   public String toString() // returns info as as string
   {
      area = getArea();
      String str = "The length of the room is " + length + " feet, and the width of the room is " + width + String.format(" feet. The total area is %,d feet.", area);
      return str;
   }
}