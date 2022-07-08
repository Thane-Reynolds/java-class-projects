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
   private ArrayList<Integer> accountList = new ArrayList<>();
   
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
   
   public boolean checkValid() throws IOException
   {
      int index; // for iterating the loop
      boolean found; // to set is valid and for continuing iteration of the loop
      
      //initializing variables
      index = 0;
      found = false;
      fileName = "testaccountnumbers.txt";
      File file = new File(fileName);
      Scanner refFile = new Scanner(file);
      
      //adding accounts to the accountList
      while(refFile.hasNext())
      {
         int accountNum = refFile.nextInt();
         accountList.add(accountNum);
      }
      refFile.close();
      
      // search array
      while(!found && index < accountList.size())
      {
         if(accountList.get(index) == accountNumber)
         {
            found = true;
         }
         index++;
      }
      return isValid = found;
   }
}