/**
   Chapter 4 challenge 17 on page 265
   Thane Reynolds
*/

//This program is a number guessing game for 1-100. This will choose a random number in that range and the user will need to guess it. 
//If the user makes an incorrect guess, the program will state if they are higher or lower than the number. 
//This will repeat until the correct number is guessed.

//imports
import java.util.Scanner; //for keyboard input
import java.util.Random; //for number generation

public class RandomNumberGame
{
   public static void main(String[] args)
   {
      //declare variables
      int userNumber = 0;
      int number;
      int guessCount = 0;
      
      //make user input possible
      Scanner keyboard = new Scanner(System.in);
      
      //set random number
      Random randomNumber = new Random();
      number = randomNumber.nextInt(100) + 1;
      
      System.out.print("Hello!\n" + "\tWe're going to play a game today!\n" + "\tPlease guess a number between 1 and 100, and I'll tell you if you are correct.\n");      
      
      //set loop to iterate until user input matches the random number
      while (userNumber != number)
      {
         //take user input
         userNumber = keyboard.nextInt(); // user's guess
         
         //validate against random number, if incorrect, compare if higher or lower
         if(userNumber == number)
         {
            System.out.println("Great guess, you got it! The number was: " + number +". You got it in " + guessCount + " guesses.");
         }
         else if(userNumber > number)
         {
            System.out.println("Too high, try again: ");
         }
         else if(userNumber < number)
         {
            System.out.println("Too low, try again: ");
         }
         guessCount ++;
      }
   }
}