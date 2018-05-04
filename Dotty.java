/*
Program Name: Dotty
Author: Noah Webb
Class: AP Computer Science
Date: 11/28/16
Program description: Dotty creates a dot leader format such as that which can be 
found in a table of contents.
What I learned from this program: How to find the length of a string.
Difficulties: Originally had non-uniform output due to differing page numbers. 
Fixed with decision-making.
*/

//these allow access to the Scanner Class
import java.io.*;
import java.util.*;
public class Dotty
{
    public static void main (String args[])
    {
        //This inputs a new scanner.
        Scanner keyboard = new Scanner(System.in);
        
        //This asks for and collects the title.
        System.out.print("Enter the title: ");
        String title = keyboard.nextLine();
        
        //This asks for and collects the page number.
        System.out.print("Enter the page number: ");
        int page = keyboard.nextInt();
        
        //This begins the final line of 50 characters.
        System.out.println("");
        System.out.print(title);
        
        //This stores the amount of characters in the title in numerical integer form.
        int len = title.length();
        
        //This for statement prints out the periods and spaces to fill the space between the title and page number.
        for (int x=(50-len-4)/2;x!=0;x--)
        {
            System.out.print(" .");
        }
        
        //The decison making below is to ensure the lines match up even with much larger page numbers.
        
        if (page<10)
        {
            System.out.println(" . "+page);
        }
        else if (page<100)
        {
            System.out.println(" ."+page);
        }
        else if (page<1000)
        {
            System.out.println(" "+page);
        }
        else
        {
            System.out.println(page);
        }
        
    }
}
/* Sample Output:
  
Enter the title: An Introduction to Java
Enter the page number: 5

An Introduction to Java . . . . . . . . . . . . 5
Enter the title: Simple Data Types
Enter the page number: 27

Simple Data Types . . . . . . . . . . . . . . .27
Enter the title: Cold Days
Enter the page number: 316

Cold Days . . . . . . . . . . . . . . . . . . 316

  
  
  
*/
