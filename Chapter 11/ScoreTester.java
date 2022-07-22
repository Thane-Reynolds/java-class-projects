/*
   Chapter 11 challenge 1
   part 2 of 2 - class tester
   Thane Reynolds
*/

import java.util.Scanner; // for user input

// this will take in user input for the scores in an array, and advise on the average. This will also advise if there is an error in the scores

public class ScoreTester
{
   public static void main(String[] args)
   {
      Scanner keyboard = new Scanner(System.in); // for input
      int numScores; // to initialize the array to the correct length
      double[] scores; // for storing input
      TestScores testScores;
      
      System.out.println("Welcome to the Average Scores Calculator. Please tell me how many scores you have:");
      numScores = keyboard.nextInt();
      
      scores = new double[numScores];
      
      for(int i = 0; i < numScores; i++)
      {
         System.out.println("Please input score #" + (i+1));
         scores[i] = keyboard.nextDouble();
      }
      
      try
      {
         testScores = new TestScores(scores);
         System.out.println("The average testScore is " + testScores.AverageScore());
      }
      catch (IllegalArgumentException e)
      {
         System.out.println(e.getMessage());
      }
   }
}