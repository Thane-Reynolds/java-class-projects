/*
   Chapter 10 challenge 7 page 698 part 1 of 3
   Person superclass
   Thane Reynolds
*/

// This is a class that stores a name, address and telephone number for a person

public class Person
{
   private String name; // stores name
   private String address; // stores person's address
   private long telephoneNumber; // stores the phone number
   
   public Person(String n, String add, long phone) // constructor
   {
      name = n;
      address = add;
      telephoneNumber = phone;
   }
   
   public void setName(String str) // mutator for name
   {
      name = str;
   }
   
   public String getName() // accessor for name
   {
      return name;
   }
   
   public void setAddress(String str) // mutator for address
   {
      address = str;
   }
   
   public String getAddress() // accessor for address
   {
      return address;
   }
   
   public void setPhone(long num) // mutator for phone number
   {
      telephoneNumber = num;
   }
   
   public long getPhone() // accessor for phone number
   {
      return telephoneNumber;
   }
}