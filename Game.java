import java.util.Scanner;


public class Game
{
   public static void main(String[] args)
   {
      Scanner input = new Scanner(System.in);
      String spaceBar = "------------------------------------------------------";
   
   
      
      System.out.println("You are walking along the forest road and you come across a fork in the road. Which way do you take?" + 
                                    "\n I.) Take the left side, into the heart of the forest." +
                                    "\n II.) Take the right side, towards a cozy looking town.");
                                    
             
      String userSelection = input.nextLine();
      System.out.println(spaceBar);
            
      if(userSelection.equals("I.)") || userSelection.equals("I"))
      {
         System.out.println("FOOOOOL! What kind of adventurer goes into a forest with no gear and no torches?!" +
                                       "\nGo back to the fork!");
         System.out.println(spaceBar);
               
      }
      else if(userSelection.equals("II.") || userSelection.equals("II"))
      {
         System.out.println("You make your way down the path towards the village. Dusk is starting to fall and the houses are a lit with candles in the windows. How cozy." +
                                       "\n You arrive at the gate, off to the side there is a beggar hunched down, he catches your eye." +
                                       "\n I.) Look away! His problems are not yours, continue towards the village center." + 
                                       "\n II.) Glare from afar, what's his problem?" +
                                       "\n III.) Start walking towards him, maybe he can give directions to an inn.");
                                       userSelection = input.nextLine();
                                       System.out.println(spaceBar);
                                       
                   if(userSelection.equals("I.)") || userSelection.equals("I"))
                   {
                       System.out.println("You start to walk quickly away, best to avoid trouble. You hear a faint harrumpf from the beggar, but pay him no mind. You pass under the gate, there's a guard standing off to the side half asleep." +
                                               "\n I.) Ask for directions to the nearest inn, it's growing dark quickly." +
                                               "\n II.) Well you don't want to bother him do you? He's obviously working hard. You keep walking, you'll figure out where to stay eventually.");
                                               userSelection = input.nextLine();
                                               System.out.println(spaceBar);

                   }
                   else if(userSelection.equals("II.") || userSelection.equals("II"))
                   {
                        System.out.println("The beggar raises an eyebrow slowly. Taunting." +
                                                "\n I.) He wants to fight, huh? You square your shoulders and stalk towards the beggar. You'll show him!" +
                                                "\n II.) You raise both your eyebrows at him." +
                                                "\n III.) You call out, 'Can I help you sir?'");
                                                userSelection = input.nextLine();
                                                System.out.println(spaceBar);

                   }
                   else if(userSelection.equals("III.") || userSelection.equals("III"))
                   {
                         System.out.println("The beggar holds your eye contact without blinking. Maybe this was a mistake...Before you can turn around the beggar jumps up and grabs your arm." +
                                                "'You...' he mumbles, up close you see his eyes have a sudden film come across them, 'You look like someone who could use this...' He reaches into his robe and pulls out a black box." +
                                                      "\nHe forces your palm up and places the box in your hand. 'You'll have many uses for it, I believe." +
                                               
                                                "\n I.) You smile nervously and nod, you quietly thank him for the gift. He gives you a toothy nod and steps back, releasing your hand. 'Good luck, you will need it out there'." +
                                                            "\nHe steps back to where he was crouched and hunches down once more. You decide it's best to leave and head into the village." +
                                               
                                                "\n II.) AHHHHHHHHHHH! You fling the box away! Your mother told you to stay away from that black magic nonsense! You scramble away from the old man and run into the village gates." +
                                                            "\nYou hear the old man yell, but you are already too far away to hear what he's saying. How exhausting. You need an inn." +
                                                
                                                "\n III.) You look down at the box. It's plain looking, probably not worth much. 'Thanks, I guess' you say, 'But I really need to find a place to stay. Where's the inn" +
                                                            "\n in this town?' The old man looks at you with disdain. He snatches back the box. 'Ungrateful wretch' he spits at you, and then storms off into the woods. How helpful... You head into the town.");
                                                 userSelection = input.nextLine();
                                                 System.out.println(spaceBar);

                    }
                   
                   
                   
                   
                   
                   
      }                          
                                       
                              
                              
                              
                              
                              
                              
                              
   }
}