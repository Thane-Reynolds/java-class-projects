/**
   Chapter 3 challenge 13 from page 184
   Thane Reynolds
*/

// This program will ask the customer to provide the package name they have, and the total number of minutes used. 
// will then calculate their total bill based on the information provided.

import java.util.Scanner; // to take user input, this is to not need input as a string

public class PhoneBillCalculator
{
   public static void main(String [] args)
   {
      //variable declarations
      Scanner keyboard = new Scanner(System.in); // to take user input
      char optionName; //package that the customer has
      int minutes = 0; //minutes that the customer used, defaults to 0 in case the customer is not plan A or B
      
      //vars for package A
      double optionAMonthly = 39.99; //monthly cost for package A
      double optionAMinute = 0.45; //cost per minute over allowable max for package A
      int optionAMaxMin = 450; // maximum minutes for package A
      
      //vars for package B
      double optionBMonthly = 59.99; //monthly cost for package B
      double optionBMinute = 0.40; //cost per minute over allowable max for package B
      int optionBMaxMin = 900; // maximum minutes for package B
      
      //vars for package C
      double optionCMonthly = 69.99; //monthly cost for package C
      
      // output variables
      double billTotal; // declare bill total variable
      int minutesOver; //minutes over max for plan
      
      //Taking user input
      System.out.print("What phone package do you have?\nEnter: A, B, or C\n");
      optionName = keyboard.next().charAt(0); // package name
      
      //only asking for minutes if it will apply
      if(optionName == 'A' || optionName == 'a' || optionName == 'B' || optionName == 'b')
      {
         System.out.print("How many minutes did you use?\n");
         minutes = keyboard.nextInt(); // minutes used
      }
      
      //logic for bill total
      if(optionName == 'A' || optionName == 'a')
      {
           if( minutes > optionAMaxMin)
           {
            minutesOver = minutes - optionAMaxMin;
            billTotal = optionAMonthly + (optionAMinute * minutesOver);
            System.out.printf("Your total bill is $%,.2f\n", billTotal);
           }
           else
           {
            billTotal = optionAMonthly;
            System.out.printf("Your total bill is $%,.2f\n", billTotal);
           }
           
      } 
      else if(optionName == 'B' || optionName == 'b')
      {
         if( minutes > optionBMaxMin)
           {
            minutesOver = minutes - optionBMaxMin;
            billTotal = optionBMonthly + (optionBMinute * minutesOver);
            System.out.printf("Your total bill is $%,.2f\n", billTotal);
           }
           else
           {
            billTotal = optionBMonthly;
            System.out.printf("Your total bill is $%,.2f\n", billTotal);
           }
      } 
      else if(optionName == 'C' || optionName == 'c')
      {
         billTotal = optionCMonthly;
         System.out.printf("Your total bill is $%,.2f\n", billTotal);
      } 
      else
      {
         System.out.println("You did not pick one of the available options");
      }
   }
}