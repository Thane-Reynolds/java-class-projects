/*
   Chapter 9 programming challenge 5 page 605
   Password Class
   Thane Reynolds
*/

// this class will take in a password and verify if it is valid

public class Password
{
    private final int MIN_LENGTH = 6; // password length requirement
    private boolean hasCapital = false; // flag for capital letters
    private boolean hasLowercase = false; // flag for lowercase letters
    private boolean hasDigit = false; // flag for digits
    private boolean isLongEnough = false; // flage for if it meets length requirement
    private String input; // string to compare against

   public Password(String str) // constructor, needs arg
   {
      input = str;
   }
   
   public boolean isValid() // method to check if password meets requirements
   {
      int i = 0; // loop iterator
      boolean valid;
      
      if(input.length() >= MIN_LENGTH && isLongEnough == false) // sets length to true if long enough
         {
            isLongEnough = true;
         }
      while (i < input.length())
      {
         if(Character.isUpperCase(input.charAt(i))) // sets capital to true if one exists
         {
            hasCapital = true;
            i++;
         }
         else if(Character.isLowerCase(input.charAt(i))) // sets lowercase to true if one exists
         {
            hasLowercase = true;
            i++;
         }
         else if(Character.isDigit(input.charAt(i))) // sets digit to true if one exists
         {
            hasDigit = true;
            i++;
         }
         else // iterates the loop if no above is true
         {
            i++;
         }
         
      }
      if( hasDigit && hasCapital && hasLowercase && isLongEnough) // returns true if all requirements are true
      {
         valid = true;
      }
      else // returns false if not all requirements are met
      {
         valid = false;
      }
      return valid;
   }
}