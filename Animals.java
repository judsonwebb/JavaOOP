/*
Program Name: Animals
Author: Noah Webb
Class: AP Computer Science
Date: 12/5/16
Program description: Animals prints out a list of animals and whether 
they are between dinosaur and walrus in the dictionary.
What I learned from this program: How to order strings alphabetically.
Difficulties: Program originally always printed not between. Changed
ASCII values to fix.
*/
import java.util.*;
import java.io.*;
public class Animals
{
    public static void main (String args[])
    {
        //This creates the scanner to read the file.
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("Prog505c.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        //This ensures all information in the file will be read.
        while(scan.hasNext())
        {
            //This creates the variables to be checked.
            String animal = scan.nextLine();
            char aChar = animal.charAt(0);
            int aInt = (int)aChar;
            int len = animal.length();
            
            //This loop prints out the results using decision making.
            if(len <8)
            {
                if (aInt<=68 || aInt >=87)
                {
                    System.out.println(animal+"\t\tnot between");
                }
                if (aInt>68 && aInt <87)
                {
                    System.out.println(animal+"\t\tbetween");
                }
            }
            
            //This loop prints out the results for longer strings.
            else if(len >=8)
            {
                if (aInt<=68 || aInt >=87)
                {
                    System.out.println(animal+"\tnot between");
                }
                if (aInt>68 && aInt <87)
                {
                    System.out.println(animal+"\tbetween");
                }
            }
        }  
    }
}
/*

Vampire		    between
Monkey		    between
Elephant	    between
Ape		        not between
Lion		    between
Hippopotamus	between
Ant		        not between
Zebra		    not between
Yak		        not between
Antelope	    not between
Dingo		    not between
Whale		    not between

  



*/