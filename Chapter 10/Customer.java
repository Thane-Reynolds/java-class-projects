/*
   Chapter 10 challenge 7 page 698 part 2 of 3
   Customer class
   Thane Reynolds
*/

// this is a class that extends Person, and also contains the customer number and desire to be on a mailing list

public class Customer extends Person
{
   private int custNumber; // stores customer number
   private boolean wantsMail; // stores if the customer wants to be on the mailing list
   
   public Customer(String name, String address, long phone, int custNum, boolean mail) // constructor, takes in all information needed and provides super with info
   {
      super(name, address, phone);
      custNumber = custNum;
      wantsMail = mail;
   }
   
   public void setCustNumber(int num) // mutator for customer number
   {
      custNumber = num;
   }
   
   public int getCustNumber() // accessor for customer number
   {
      return custNumber;
   }
   
   public void setWantsMail(boolean bool) // mutator for wantsMail
   {
      wantsMail = bool;
   }
   
   public boolean getWantsMail() // accessor for wantsMail
   {
      return wantsMail;
   }
}