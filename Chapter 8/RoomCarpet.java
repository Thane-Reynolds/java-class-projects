/**
   Chapter 8 Challenge 3 page 552
   Part 2 of 3 - RoomCarpet Class
   Thane Reynolds
*/

/** 
*   This class will take in the dimensions and cost per square foot, 
*   create a RoomDimension object, 
*   and then calculate the total cost of the carpet
*/

public class RoomCarpet
{
   private RoomDimension room;
   private double costPerSqFt;
   private double totalCost;
   
   public RoomCarpet(RoomDimension dim, double cost) // constructor
   {
      room = new RoomDimension(dim);
      costPerSqFt = cost;
   }
   
   public double getTotalCost() // cost for the room to be carpeted
   {
      totalCost = costPerSqFt * room.getArea();
      return totalCost;
   }
   
   public String toString()
   {
      totalCost = getTotalCost();      
      String str = room.toString() + String.format("\nThe cost per square foot is $%,.2f.", costPerSqFt) + String.format("\nThe total cost is $%,.2f.", getTotalCost());
      return str;
   }
}