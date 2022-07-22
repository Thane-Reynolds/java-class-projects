/*
   Chapter 10 challenge 7 page 698 part 3 of 3
   Tester for person and customer class
   Thane Reynolds
*/

// this program will take in user input and create a customer, it will then read back the customer information

public class CustomerTester
{
   public static void main(String[] args)
   {
      String custName = "Joe Schmoe"; // stores customer name
      String custAddress = "1234 Main Street"; // stores customer address
      long custPhone = 9288675309L; // stores customer phone
      int custNumber = 54321; // stores customer id number
      boolean custPreference = false; // stores customer mailing list preference

      // create new Customer
      Customer customer = new Customer(custName, custAddress, custPhone, custNumber, custPreference);
      
      System.out.println("Here is your new customer entry:");
      System.out.println("Customer Name:    " + customer.getName());
      System.out.println("Customer Address: " + customer.getAddress());
      System.out.println("Customer Phone #: " + customer.getPhone());
      System.out.println("Customer ID #:    " + customer.getCustNumber());
      System.out.println("Customer mailing: " + customer.getWantsMail());
   }
}