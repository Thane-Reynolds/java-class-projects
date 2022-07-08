/**
   Chapter 6 challenge 4, part one, retail class
   Thane Reynolds
*/

// This class is for a Retail Item

public class RetailItem
{
   //create private fields that will be used in the class
   private String description;
   private int unitsOnHand;
   private double price;
   
   public RetailItem() //no arg constuctor
   {
      description = "";
      unitsOnHand = 0;
      price = 0.0;
   }
   
   public RetailItem(String str, int units, double prc) // constuctor that takes args
   {
      description = str;
      unitsOnHand = units;
      price = prc;
   }
   
   // mutator methods
   
   public void setDescription(String str) // should not need to have an overloaded as this will always store a string
   {
      description = str;
   }
   
   public void setUnitsOnHand(int units)
   {
      unitsOnHand = units;
   }
   
   public void setUnitsOnHand(String str) // in case implementation wants to use dialog boxes
   {
      unitsOnHand = Integer.parseInt(str);
   }
   
   public void setPrice(double prc)
   {
      price = prc;
   }
   
   public void setPrice(String str)// in case implementation wants to use dialog boxes
   {
      price = Integer.parseInt(str);
   }
   
   //accessor methods
   
   public String getDescription()
   {
      return description;
   }
   
   public int getUnitsOnHand()
   {
      return unitsOnHand;
   }
   
   public double getPrice()
   {
      return price;
   }
}