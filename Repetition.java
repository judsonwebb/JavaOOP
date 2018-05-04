/*
Program Name: Repetition
Author: Noah Webb
Class: AP Computer Science
Date: 11/29/16
Program description: Repetition prints a given word once for every 
character within the word.
What I learned from this program: How to turn the length of a string 
into an integer.
Difficulties: The program originally printed one word less than 
intended. Fixed by changing int x = 1 to int x = 0.
*/

//these allow access to the Scanner Class
import java.io.*;
import java.util.*;
public class Repetition
{
    public static void main (String args[])
    {
        //This inputs a new scanner.
        Scanner keyboard = new Scanner(System.in);
        
        //This asks for and collects the word.
        System.out.print("Enter your word: ");
        String word = keyboard.nextLine();
        
        //This puts the character length of the word into integer form.
        int len = word.length();
        
        //This tells the user the amount of characters in the word.
        System.out.println("The length of your word is "+len+" characters.\n");
        
        //This prints the word one time for each character in the word.
        for (int x=0;x!=len;x++)
        {
            System.out.println(word);
        }
        
        //This tells the user how many times the word was printed.
        System.out.println("\nSo I printed it "+len+" times.");
        
        
    }
}
/* Sample Output:
  
Enter your word: serendipity
The length of your word is 11 characters.

serendipity
serendipity
serendipity
serendipity
serendipity
serendipity
serendipity
serendipity
serendipity
serendipity
serendipity

So I printed it 11 times.
Enter your word: Howdy
The length of your word is 5 characters.

Howdy
Howdy
Howdy
Howdy
Howdy

So I printed it 5 times.
Enter your word: I
The length of your word is 1 characters.

I

So I printed it 1 times.
Enter your word: Zeppelin
The length of your word is 8 characters.

Zeppelin
Zeppelin
Zeppelin
Zeppelin
Zeppelin
Zeppelin
Zeppelin
Zeppelin

So I printed it 8 times.

  
*/


