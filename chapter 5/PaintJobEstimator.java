/**
   Chapter 5 challenge 4
   Thane Reynolds
*/

//this program will calculate the cost for a paint job given the wall space per room provided
import java.util.Scanner; //for keyboard input
import java.io.*; //for exceptions

public class PaintJobEstimator
{
   public static void main(String[] args) throws IOException //this calls other methods and has the final output to the user
   {
      //variable declarations
      final double PER_HOUR = 18.00;
      final int HOURS_PER = 8;
      final int SQFT_BREAKDOWN= 115;
      double hours;
      double sqFoot;
      int rooms;
      double totalCost;
      
      rooms = getRooms(); //get number of rooms
      sqFoot = getSqFoot(rooms); //get sq foot total based on number of rooms
      
      hours = (sqFoot/SQFT_BREAKDOWN) * HOURS_PER;
      totalCost = hours * PER_HOUR;
      
      System.out.printf("Your total cost for %.2f square foot of wall space is $%.2f. This will take %.1f hours of labor.", sqFoot, totalCost, hours );
   }
   
   public static int getRooms() throws IOException //this method will get the number of rooms
   {
      Scanner keyboard = new Scanner(System.in);
      int rooms;
      
      System.out.println("How many rooms would you like to have painted?"); // need total number of rooms to pass into getSqFoot from main
      rooms = keyboard.nextInt();
      return rooms;
   }
   
   public static double getSqFoot(int rooms) throws IOException //this method will take in the number of rooms, get the sq foot for each, then return total sq ft
   {
      Scanner keyboard = new Scanner(System.in);
      int room = 1; //to iterate while loop
      double sqFoot;
      double totalSqFoot = 0;
      
      while (room <= rooms) // used while loop to get square foot for each room
      {
         System.out.println("How many square feet of walls do you have in room number " + room);
         sqFoot = keyboard.nextInt();
         totalSqFoot += sqFoot;
         room ++;
      }
      
      System.out.println("You have " + totalSqFoot + " square feet of walls to be painted");
      return totalSqFoot;
   }
}