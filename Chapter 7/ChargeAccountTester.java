/**
   Chapter 7 challenge 3 page 487 - Test file
   Thane Reynolds
*/

// this is to test the ChargeAccount class

import java.util.Scanner; // for keyboard input
import java.io.IOException; // the main method calls a method that can throw an IOException, so main needs to be able to throw an IOException

public class ChargeAccountTester
{
   public static void main(String[] args) throws IOException
   {
      Scanner keyboard = new Scanner(System.in);
      int accountNum;
      
      System.out.println("This will  test to see if you have a valid account number.");
      System.out.println("Please enter your account number:");
      accountNum = keyboard.nextInt();
      
      //create ChargeAccount object
      ChargeAccount account = new ChargeAccount(accountNum);
      
      if(account.checkValid() == true)
      {
         System.out.println("This account number is Valid.");
      }
      else
      {
         System.out.println("This account number is Invalid.");
      }
   }
}