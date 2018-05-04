/*
Program Name: Pangram
Author: Noah Webb
Class: AP Computer Science
Date: 12/8/16
Program description: Pangram determines whether a sentence is a pangram.
What I learned from this program: How to use the .contains() method.
Difficulties: Originally had trouble checking the chars, added "" + x 
to fix. 
*/
import java.io.*;
import java.util.*;
public class Pangram
{
    public static void main(String[] args) 
    {
        //makes scanner
        Scanner keyboard = new Scanner(System.in);
        System.out.print ("The text: ");
       
        //takes input
        String sentence = keyboard.nextLine();
        String missingChars="";
        
        // all letters checked using loop
        for (char x = 'a'; x < 'z'; x++) 
        {
        
            
            // Makes string lowercase to check
            if ((sentence.toLowerCase()).contains(""+x)==false)
            { 
                missingChars=missingChars+x+" "; // puts all missing characters int one string.
            }
                    
         }
                
         System.out.print(sentence); // Prints string
                
         //decision making determines whether sentence is a pangram,
         System.out.print(": " + ((missingChars.isEmpty()) ? "Is a pangram" : "Is not a pangram")); 
         System.out.println();
                
         if (!missingChars.isEmpty()) 
         { // prints missing letters.
         System.out.print("\tMissing letters: "); 
                    
         System.out.print(missingChars.toUpperCase());
         }
         System.out.println();
               
    }

}
/* Sample Output:
  
The text: How daft jumping zebras vex.
How daft jumping zebras vex.: Is not a pangram
	Missing letters: C K L Q Y 
  
The text: The five boxing wizards jump quickly.
The five boxing wizards jump quickly.: Is a pangram

The text: Masterful quizzes are a rarity.
Masterful quizzes are a rarity.: Is not a pangram
	Missing letters: B C D G H J K N O P V W X 

  
  
  
  
 
*/