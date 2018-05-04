/*
Program Name: BoxMaker
Author: Noah Webb
Class: AP Computer Science
Date: 12/6/16
Program description: BoxMaker prints strings with boxes around them.
What I learned from this program: How to format strings in various boxes.
Difficulties: Accidentally printed six lines instead of five. Fixed by changing
for statement.
*/
import java.util.*;
import java.io.*;
public class BoxMaker
{
    public static void main (String args[])
    {
        //This creates the scanner to accept input.
        System.out.println();
        Scanner scan = new Scanner(System.in);
        
        String word = scan.nextLine();
        
        //this puts the string length in int form.
        int len = word.length();
        
        
        //this prints all five lines of the box using decision making.
        for(int x=0; x<5;x++)
        {
            if ((x== 0)||( x==4))
            {
                System.out.print("****");
                for(int y=0; y<len;y++)
                {
                    System.out.print("*");
                }
                System.out.println();
            }
            else if ((x==1)||(x==3))
            {
                System.out.print("* ");
                for(int y=0; y<len;y++)
                {
                    System.out.print(" ");
                }
                System.out.println(" *");
            }
            else if (x==2)
            {
                System.out.println("* "+word+" *");
            }
        }
    }
}
/*

Thinking
************
*          *
* Thinking *
*          *
************

Lumpy
*********
*       *
* Lumpy *
*       *
*********

Abysmal
***********
*         *
* Abysmal *
*         *
***********

Escape the
**************
*            *
* Escape the *
*            *
**************

How much wood would a woodchuck chuck if a woodchuck was bored easily?
**************************************************************************
*                                                                        *
* How much wood would a woodchuck chuck if a woodchuck was bored easily? *
*                                                                        *
**************************************************************************

  



*/