/*
Program Name: Duplicate
Author: Noah Webb
Class: AP Computer Science
Date: 02/28/17
Program description: Duplicate removes a copy of info that has a duplicate.
What I learned from this program: How to use arrays to remove duplicate 
information.
Difficulties: Originally deleted duplicates entirely instead of just one copy. 
Changed decision making to fix.
*/


import java.util.*;
import java.io.*;
public class Duplicate
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog415h.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        System.out.print("The original set of numbers are: ");
       int theArray[]= new int[101];
       
       while (scan.hasNext())
       {
           int a = scan.nextInt();
           System.out.print(a+" ");
           theArray[a]=theArray[a] + 1;
       }
       System.out.print("\nThe different numbers from the set of integers are: ");
         
       for (int x=0; x<101;x++)
       {
           if (theArray[x]>0)
           {
           System.out.print(x+" ");
           }
       }
        
    }  
}
/*

The original set of numbers are: 12 12 30 12 45 66 78 30 82 19 99 11 11 15 31 18 51 17 12 17 
The different numbers from the set of integers are: 11 12 15 17 18 19 30 31 45 51 66 78 82 99 


     
 
*/