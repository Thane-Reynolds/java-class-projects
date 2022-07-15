/**
   Chapter 7 challenge 3 page 487 - Class file
   Thane Reynolds
*/

// This class will take an argument of a charge account number and its method will determine if a given value is in a set

import java.util.ArrayList; // to import ArrayList, comparison values will be in an ArrayList
import java.util.Scanner; // to open the file
import java.io.File; // to access file
import java.io.IOException; // to throw errors if needed


public class ChargeAccount
{
   //create private fields to be used by the class
   private int accountNumber;
   private boolean isValid;
   private String fileName;
   // arraylist object for account numbers to check against
   private int[] accountList = { 5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 8080152, 4562555, 5552012, 5050552, 7825877, 1250255, 1005231, 6545231, 3852085, 7576651, 7881200, 4581002 };
   
   public ChargeAccount() //no arg constructorS
   {
      accountNumber= 0;
   }
   
   public ChargeAccount(int account) //if user passes account number when creating
   {
      accountNumber = account;
   }
   
   public void SetAccount(int account) // to be used if no arg constructor was used
   {
      accountNumber = account;
   }
   
   public boolean checkValid()
   {
      int index; // for iterating the loop
      boolean found; // to set is valid and for continuing iteration of the loop
      
      //initializing variables
      index = 0;
      found = false;

      // search array
      while(!found && index < accountList.length)
      {
         if(accountList[index] == accountNumber)
         {
            found = true;
         }
         index++;
      }
      return isValid = found;
   }
}