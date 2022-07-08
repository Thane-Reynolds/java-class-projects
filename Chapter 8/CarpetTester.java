/**
   Chapter 8 Challenge 3 page 552
   Par 3 of 3 - Tester for RoomDimension and RoomCarpet classes
   Thane Reynolds
*/

/** 
*   This program will take in the dimensions and cost per square foot, 
*   create a RoomDimension instance, create a RoomCarpet instance, 
*   then use the methods on those to display the total cost for a carpet installation
*/

import java.util.Scanner; // so that we can have keyboard input

public class CarpetTester
{
   public static void main (String[] args)
   {
      RoomDimension roomDimension;
      RoomCarpet roomCarpet;
      int length;
      int width;
      double costPerSqFt;
      Scanner keyboard = new Scanner(System.in);
      
      // prompts for the user to gather information
      System.out.println("This will assist you in calculating the total cost to carpet a room.\n");
      System.out.println("Please have the length and width of the room to be carpeted ready, in feet.");
      System.out.println("Different carpets have diverent costs per square foot, please pick out the");
      System.out.println("carpet you would like to use and have the cost ready.\n");
      
      //prompts for the user to enter information
      System.out.println("Please enter the length of the room in feet:");
      length = keyboard.nextInt();
      
      System.out.println("Please enter the width of the room in feet:");
      width = keyboard.nextInt();
      
      System.out.println("Please enter the cost per square foot of your carpet choice:");
      costPerSqFt = keyboard.nextDouble();
      
      roomDimension = new RoomDimension(length, width); // creates the RoomDimension instance
      
      roomCarpet = new RoomCarpet(roomDimension, costPerSqFt); // creates the RoomCarpet instance
      
      System.out.println(roomCarpet); // calls the toString method
   }
}