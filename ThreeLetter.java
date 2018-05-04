/*
Program Name: ThreeLetter
Author: Noah Webb
Class: AP Computer Science
Date: 12/12/16
Program description: ThreeLetter counts words and tells how many words
have three letters.
What I learned from this program: How to check equality of chars.
Difficulties: Originally had the word counter before the y++, which
ruined the count.
*/

//This imports what I need to use a scanner.
import java.util.*;
import java.io.*;
public class ThreeLetter
{
    public static void main (String args[])
    {
        //This creates the scanner to read the file.
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog512h.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        //this initializes variables to be used later.
        int threeCount = 0;
        int wordCount = 0;
        int lineCount = 0;
        
        //This ensures all information in the file will be read.
        while(scan.hasNext())
        {
            //this counts the amount of lines.
            lineCount++;
            
            //These create the variables to be used and prints the words.
            String line = scan.nextLine();
            System.out.println(line);
            int len = line.length();
            int y = 0;
            
            //this checks the word count in each line using the characters
            for(int x = 0;x<len;x++)
            {
                
                char checker = line.charAt(x);
                y++;
                
                //this counts how many words are made assuming there is a space after.
                if ((checker+"").equals(" "))
                {
                    wordCount++;
                    y=0;
                }
                
                //this counts words with at least three characters.
                if (y==3)
                {
                    threeCount++;
                }
                
                //this subtracts words with more than three characters from the count.
                else if (y==4)
                {
                    threeCount--;
                }
                
            }
        }
        //this adds the count of words at the end of lines.
        wordCount = wordCount+lineCount;
        
        //this calculates the percentage of three letter words.
        double percent = (double) threeCount/(double)wordCount*100;
        percent = (int) (percent*100+.05)/100.0;
        
        //this prints the info.
        System.out.println("\nTotal Words = "+wordCount);
        System.out.println("Three Letter Words = "+threeCount);
        System.out.println("Percentage of Occurrence = "+percent+"%");
    }
}
/* Sample Output:

Good morning life and all
Things glad and beautiful
My pockets nothing hold
But he that owns the gold
The sun is my great friend
His spending has no end
Hail to the morning sky
Which bright clouds measure high
Hail to you birds whose throats
Would number leaves by notes
Hail to you shady bowers
And you green fields of flowers
Hail to you women fair
That make a show so rare
In cloth as white as milk
Be it calico or silk
Good morning life and all
Things glad and beautiful

Total Words = 93
Three Letter Words = 20
Percentage of Occurrence = 21.5%
  


*/