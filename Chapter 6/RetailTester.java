/**
   Chapter 6 challenge 4, part 2, tester
   Thane Reynolds
*/

// This is a test to create 3 seperate retail items

public class RetailTester
{
   public static void main (String[] args)
   {
      RetailItem item1 = new RetailItem("Jacket", 12, 59.95);
      RetailItem item2 = new RetailItem("Designer Jeans", 40, 34.95);
      RetailItem item3 = new RetailItem("Shirt", 20, 24.95);
      
      System.out.println("\t\t\t     Description \t\t Units on Hand \t\t Price");
      System.out.println("-----------------------------------------------------------");
      System.out.printf("Item #1\t%15s\t\t\t\t %d\t\t\t\t $%.2f\n",item1.getDescription(), item1.getUnitsOnHand(), item1.getPrice());
      System.out.printf("Item #2\t%15s\t\t\t\t %d\t\t\t\t $%.2f\n",item2.getDescription(), item2.getUnitsOnHand(), item2.getPrice());
      System.out.printf("Item #3\t%15s\t\t\t\t %d\t\t\t\t $%.2f\n",item3.getDescription(), item3.getUnitsOnHand(), item3.getPrice());
   }
}