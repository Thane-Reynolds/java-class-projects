/*
   Chapter 9 programming challenge 5 page 605
   Tester
   Thane Reynolds
*/

import java.util.Scanner; // to take in keyboard input

// this program will determine if a password meets certain requirements


public class PasswordVerifier
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in);
      String input;
      Password password;
      boolean valid;
      
      System.out.println("Please enter the password you would like to set for your Amazon account.");
      System.out.println("You must enter a password that is at least 6 characters long, and contains");
      System.out.println("at least 1 number, 1 uppercase letter, and 1 lowercase letter.");
      System.out.println("");
      System.out.print("Please enter your password now:");
      
      input = keyboard.nextLine();
      password = new Password(input);
      valid = password.isValid();
      
      if(valid == true)
      {
         System.out.println("This password meets the requirements and is valid.");
      }
      else 
      {
         System.out.println("This password does not meet the requirements and is invalid.");
      }
   }
}