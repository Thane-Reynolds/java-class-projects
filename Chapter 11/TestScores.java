/*
   Chapter 11 challenge 1
   part 1 of 2 - Test scores class
   Thane Reynolds
*/

// This class will take in an array of test scores, check that they are valid, and will throw an exception if any are not valid

public class TestScores
{
   private double[] scoreArray; // for storing scores
   final private int MIN_SCORE = 0; // to validate against for minimum allowable score
   final private int MAX_SCORE = 100; // to validate agains for maxium allowable score
   private boolean valid;
   
   public TestScores (double[] array) // constructor
   {
      // make scoreArray as long as the array passed in
      scoreArray = new double[array.length];
      
      // copy values to scoreArray
      for(int i=0; i < array.length; i++)
      {
         scoreArray[i] = array[i];
      }
      
      IsValid();
      
      if(!valid)
      {
         throw new IllegalArgumentException("The scores must range between 0 and 100");
      }
   }
   
   public void IsValid() // test if valid input
   {
      double highestScore = scoreArray[0];
      double lowestScore = scoreArray[0];
      
      // find highest score
      for(int i=1; i < scoreArray.length; i++)
      {
         if(scoreArray[i] > highestScore)
         {
            highestScore = scoreArray[i];
         }
      }
      
      // find lowest score
      for(int i=1; i < scoreArray.length; i++)
      {
         if(scoreArray[i] < lowestScore)
         {
            lowestScore = scoreArray[i];
         }
      }
      
      // compare against max and min score
      if(highestScore > MAX_SCORE | lowestScore < MIN_SCORE)
      {
         valid = false;
      }
      else
      {
         valid = true;
      }
   }
   
   public double AverageScore() // to get the average test score
   {
      double total = 0; // accumulator, needs to start at 0 to prevent errors on successive runs
      double average; // will hold and return the average value
      
      // sum the array values
      for(int i = 0; i < scoreArray.length; i++)
      {
         total += scoreArray[i];
      }
      
      // average the values
      average = total/scoreArray.length;
      return average;
   }
}