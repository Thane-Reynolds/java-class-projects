/*
   Chapter 12 challenge 6 page 819
   Thane Reynolds
*/

import javafx.application.Application; // application import to allow creation of gui
import javafx.stage.Stage; // to display stage
import javafx.scene.Scene; // to create scene
import javafx.scene.layout.HBox; // for horizantal grouping
import javafx.scene.layout.VBox; // for vertical grouping
import javafx.geometry.Pos; // to position in stage and in groups
import javafx.scene.control.Button; // to create a button for event
import javafx.event.EventHandler; // handle event
import javafx.event.ActionEvent; // also part of handling event
import javafx.scene.control.Label; // to add brief intro for user
import javafx.scene.image.Image; // to set the image
import javafx.scene.image.ImageView; // to display the image
import java.util.Random; // to get values for roll

// This program will display a GUI where the user will see 2 6 sided dice and be able to simulate rolling them

public class DiceSimulator extends Application
{
   private final int SIDES = 6; // sides for random - set as final as we only have images for 6 sided dice
   private int die1Value = 1; // for storing value of roll, initializing to one so that the first image will be 1
   private int die2Value = 1; // for storing value of roll, initializing to one so that the first image will be 1
   private Label introLabel; // to add label text to  later
         
   // create images - These need to be at this level of scope so that the handler can see them
   private Image dieSide1 = new Image("file:Die1.bmp");
   private Image dieSide2 = new Image("file:Die2.bmp");
   private Image dieSide3 = new Image("file:Die3.bmp");
   private Image dieSide4 = new Image("file:Die4.bmp");
   private Image dieSide5 = new Image("file:Die5.bmp");
   private Image dieSide6 = new Image("file:Die6.bmp");
      
   // create imageviews - These need to be at this level of scope so that the handler can see them
   private ImageView die1IView = new ImageView(dieSide1); // initialized to dieSide1 to be consistent with values initialized previously
   private ImageView die2IView = new ImageView(dieSide1); // initialized to dieSide1 to be consistent with values initialized previously
      
   
   public static void main(String[] args)
   {
      // launch the app
      launch(args);
   }
   
   @Override
   public void start(Stage diceStage) // setting up stage for display
   {
      // sizing images
      die1IView.setFitWidth(104); // explicitly matching original size of image to preserve image quality
      die1IView.setPreserveRatio(true);
      
      die2IView.setFitWidth(104); // explicitly matching original size of image to preserve image quality
      die2IView.setPreserveRatio(true);
      
      introLabel = new Label("Click the button to roll the dice and see the result."); // instructions for user
      
      Button rollButton = new Button("Roll Dice"); // so that user can roll dice when they choose to
      rollButton.setOnAction(new HandleButtonClick()); // register handler
      
      // create containers
      HBox buttonBox = new HBox(15, die1IView, die2IView); // so that images are next to each other
      VBox holder = new VBox (15, buttonBox, introLabel, rollButton); // to vertically collect items
      
      // set scene
      Scene diceScene = new Scene(holder, 400, 400); 
      
      // center containers
      buttonBox.setAlignment(Pos.CENTER); // centering in horizontal box
      holder.setAlignment(Pos.CENTER); // centering in vertical box     
      
      // stage scene
      diceStage.setScene(diceScene);
      
      // give it a title
      diceStage.setTitle("Dice roll simulator");
      
      //show window
      diceStage.show();
      
   }
   
   class HandleButtonClick implements EventHandler<ActionEvent> // to handle button clicks
   {
      @Override
      public void handle(ActionEvent event)
      {
         // roll and if logic goes here
         Random roll = new Random();
         
         // set value
         die1Value = roll.nextInt(SIDES) + 1;
         die2Value = roll.nextInt(SIDES) + 1;
         
         //switch case for setting ImageView
         switch(die1Value) // Die 1
         {
            case 1:
               die1IView.setImage(dieSide1);
               break;
            case 2:
               die1IView.setImage(dieSide2);
               break;
            case 3:
               die1IView.setImage(dieSide3);
               break;
            case 4:
               die1IView.setImage(dieSide4);
               break;
            case 5:
               die1IView.setImage(dieSide5);
               break;
            case 6:
               die1IView.setImage(dieSide6);
               break;
         }
         
         switch(die2Value) // Die 2
         {
            case 1:
               die2IView.setImage(dieSide1);
               break;
            case 2:
               die2IView.setImage(dieSide2);
               break;
            case 3:
               die2IView.setImage(dieSide3);
               break;
            case 4:
               die2IView.setImage(dieSide4);
               break;
            case 5:
               die2IView.setImage(dieSide5);
               break;
            case 6:
               die2IView.setImage(dieSide6);
               break;
         }
      }
   }
}