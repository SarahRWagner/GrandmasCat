import java.util.Scanner;
import java.util.ArrayList;
public class GrandmasGoddamnCat
{
   // global variables used across all methods /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   static String SPACEBAR = "~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~";
   static Scanner input = new Scanner(System.in);
   static String choice;
   static ArrayList<String> inventory = new ArrayList<String>();
   // Main menthod, holds the beginning prompts ////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void main(String[] args)
   {
     
      System.out.println("Greetings Player, please enter your name: ");
      String userName = input.nextLine();
      System.out.println("Thank you, " + userName + ".\nIn order to play, type in the letter that corresponds to the choice (Ex. type in A to select option A.) \nLet the game begin...");
      System.out.println(SPACEBAR);
      input.nextLine(); //Might cause an issue.
      
      System.out.println("What a cozy morning, it's a few days before the winter holiday begins."
                            + "\nFamily has slowly trickled in, all gathering under one roof." 
                            + "\nSome you like better than others." 
                            + "\nThe last to arrive is your slightly eccentric grandmother, Grandma.");
      System.out.println(SPACEBAR);
      input.nextLine();
   
      System.out.println("Grandma approaches you on this fine morning, looking quite distraught." 
                             + "\n'" + userName + "', she says, 'would you be a dear, and go back to my house to pick up something?'" 
                             + "\nA sense of dread fills you, you love your Grandma dearly, but Good Lord that house..."
                             + "\nYou agree to this, it's Grandma, you must. You ask her what you're suppose to grab." 
                             + "\n'Well, I forgot my cat you see, and he doesn't like being left alone for long periods of time.'"
                             + "\nOh, you know. This is the cat from hell."
                             + "\n'You just need to grab his special treats from the fridge and he'll come running,' Grandma continues. 'But, the house might be a little...guarded, be careful, " + userName + ".'");
      System.out.println(SPACEBAR);
      input.nextLine();
      
      System.out.println("You arrive at Grandma's house by noon, even in broad daylight, your Grandma's pitchblack colonial house is quite daunting."
                             + "\nYou walk through the decreipt gates to the front door, why hasn't Grandma fixed that?"
                             + "\nYou aproach the front door and unlock it. The door swings open."
                             + "\nYou take a deep breath, and walk through...");    
      System.out.println(SPACEBAR);
      input.nextLine(); 
      foyerVer1();                      
                             
                             
                                                
   }
  // foyer first time method //////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void foyerVer1()
   {
      Scanner input = new Scanner(System.in);
      
      
      System.out.println("You are in the foyer, you look around briefly and see in front of you the staircase to the upstairs." 
                           + "\nHowever, there is a large gate across them with a huge padlock, no getting up there..."
                           + "\nTo your right is the dining room door, and to the left is the sitting room."
                           + "\nWhat do you do?"
                           + "\nA. Open dining room door."
                           + "\nB. Go into sitting room.");
      
                     
      choice = input.nextLine();
      if(choice.equals("A"))
      {
         System.out.println("You walk up to the rickety dining room door and attempt to turn the knob."
                              + "\nDrat! The door is locked, you'll have to find the key to open it...Thanks Grandma."
                              + "\n A. Go Back");
         choice = input.nextLine();                     
         if(choice.equals("A"))
         {
            foyerVer1();
         }
         else
         {
            System.out.println("Invalid response! Back to the foyer you go!");
            System.out.println(SPACEBAR);
            foyerVer1();
         }
      }
      else if(choice.equals("B"))
      {
         sittingRm1(); //goes to sitting rm method
      }
      else
      {
         System.out.println("Invalid Response"); // Put a funny remark.
         System.out.println(SPACEBAR);
         foyerVer1();
      }                    
                        
   }
   //sitting room method first time /////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void sittingRm1()
   {
    
      System.out.println("You have entered the sitting room. It is every Grandma's dream."
                        + "\nDoilys everywhere, pictures of the cat are plastered all over the walls."
                        + "\nYet...you see no pictures of yourself, or the other grandchildren, or even your Grandma's children. Hm."
                        + "\nWhat do you do?"
                        + "\nA. Look at bookshelf."
                        + "\nB. Walk into powder room."
                        + "\nC. Go back.");
      choice = input.nextLine();
      if(choice.equals("A"))
      {
         bookshelfSitRm();//Call Bookshelf method
      }
      else if(choice.equals("B"))
      {
         powderRm1();//Call powder room method
      }
      else if(choice.equals("C"))
      {
         foyerVer1();
      }
      else
      {
         System.out.println("Invalid Response"); // Put a funny remark.
         System.out.println(SPACEBAR);
         sittingRm1();
      }
   
     
   
   }  
//bookshelf in sitting room method ////////////////////////////////////////////////////////////////////////////////////////////////////////////////
   public static void bookshelfSitRm()
   {
      System.out.println("You approach the bookshelf, you see many cooking and baking books."
                          + "\nA. Pick up romance novel."
                          + "\nB. Pick up picture frame."
                          + "\nC. Pick up lockbox."
                          + "\nD. Go back.");
      choice = input.nextLine();
      if(choice.equals("A"))
      {
         System.out.println("You pick up the novel. The pages seem well worn. Must be pretty good."
                              + "\nThe back of the book promises a mythical, yet steamy romance between a dragon princess and her warrior. Alrighty then..."
                              + "\nYou place the book back.");
         System.out.println(SPACEBAR);
         bookshelfSitRm();
      }
      else if(choice.equals("B"))
      {
         System.out.println("You pick up the picture frame. It's a picture of the cat dressed in a very sharp suit." 
                              + "\nYou don't even have clothes that nice."
                              + "\nYou place the picture down");
         System.out.println(SPACEBAR);
         bookshelfSitRm();
      }
      else if(choice.equals("C"))
      {
         System.out.println("You pick up the lockbox, seems pretty hefty. You look closer:"
                             + "\n0 0 0"
                             + "\n You jiggle it, it's locked solid, looks like you need a code."
                             + "\nA. Enter code."
                             + "\nB. Go back.");
         choice = input.nextLine();
         if(choice.equals("A")) // THIS IS WHERE THE USER CAN GUESS THE CODE
         {
            System.out.println("What 3 digit code would you like to enter?");
            String userCode = input.nextLine();
            if(userCode.equals("2 5 0")) //THE CORRECT CODE
            {
               System.out.println("The lockbox springs open! Inside an antique looking key rests on velet."
                                                       + "\n Looks like it fits with a rickety door...");
               System.out.println(SPACEBAR);
               inventory.add("Rickety Key");
               bookshelfSitRm(); // WILL NEED A DIFFERENT VERSION WHERE THE LOCKBOX HAS BEEN OPENED.
            }
            else //ANY OTHER RESPONSE
            {
               System.out.println("That code didn't seem to work...Try again later.");
               System.out.println(SPACEBAR);
               bookshelfSitRm();
            }                   
                                    
         }
         else if(choice.equals("B"))
         {
            bookshelfSitRm();
         }
         else
         {
            System.out.println("Invalid Response"); // Put a funny remark.
            System.out.println(SPACEBAR);
            bookshelfSitRm();
         }
      }
      
      else if(choice.equals("D"))
      {
         sittingRm1();
      }
      else
      {
         System.out.println("Invalid Response"); // Put a funny remark.
         System.out.println(SPACEBAR);
         sittingRm1();
      }
   }
   public static void powderRm1()
   {
      System.out.println("You enter the powder room, it's quite small, just a toilet and sink with a mirror. It gets the job done."
                        + "\nA. Look at book left on the sink."
                        + "\nB. Look at your reflection in the mirror." 
                        + "\nC. Go back.");
      choice = input.nextLine();
      if(choice.equals("A"))
      {
         bookinPowRm();
      }
      else if(choice.equals("B"))
      {
         System.out.println("You look at the mirror. It's you. What? Did you think a ghost would come up behind you? This ain't Scooby Doo.");
         System.out.println(SPACEBAR);
         powderRm1();
      }
      else if(choice.equals("C"))
      { 
         sittingRm1();
      }
      else
      { 
         System.out.println("Invalid Response");
         System.out.println(SPACEBAR);
         powderRm1();
      }
   
   
   
   }
   public static void bookinPowRm()
   {
      System.out.println("You pick up the book from the edge of the sink, it was left open on a page 250, would you like to read it?"
                           + "\nA. Sure, why not?"
                           + "\nB. Don't have time for this, go back.");
      choice = input.nextLine();                     
      if(choice.equals("A"))
      {
         System.out.println("*****************************************************************************************************************"
                          +"\n                                BUN'S FAMOUS ZUCCHINI BREAD                                                     "
                          + "\n*****************************************************************************************************************"
                          +"\n Ingredients:"
                          +"\n -3 Cups flour                   -1 teaspoon baking powder "
                          +"\n -1 teaspoon salt                -1 tablespoon ground cinnamon"
                          +"\n -1 teaspoon baking soda         -3 eggs"
                          +"\n -1 cup vegetable oil            -2 1/4 cups white sugar"
                          +"\n -3 teaspoons vanilla extract    - 2 cups grated zucchini (very important)"
                          +"\n -1 cup chopped walnuts (if you want)"
                          +"\n                           "
                          +"\nDirections:"
                          +"\nGrease and flour two 8 x 4 inch pans. Preheat oven to 325 degrees F (165 degrees C)."
                          +"\nSift flour, salt, baking powder, soda, and cinnamon together in a bowl."
                          +"\nBeat eggs, oil, vanilla, and sugar together in a large bowl. Add sifted ingredients to the creamed mixture, and beat well." 
                          +"\nStir in zucchini and nuts until well combined. Pour batter into prepared pans."
                          +"\nBake for 40 to 60 minutes, or until tester inserted in the center comes out clean." 
                          +"\nCool in pan on rack for 20 minutes. Remove bread from pan, and completely cool."
                          +"\n*****************************************************************************************************************"
                          +"\n                                      ENJOY                                                                       "
                          +"\n*****************************************************************************************************************");
         System.out.println(SPACEBAR);
         powderRm1();
           
           
      }
      else if(choice.equals("B"))
      {
         powderRm1();
      }
      else
      {
         System.out.println("Invalid Response"); // Put a funny remark.
         System.out.println(SPACEBAR);
         powderRm1();
         
      }
    
   }
  public static void foyerWithKey()
  {
  
  
  
  
  
  
  }
   
   
  
  
  
} 


  
   





