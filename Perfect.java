/*
Program Name: Perfect
Author: Noah Webb
Class: AP Computer Science
Date: 01/05/17
Program description: Expiration encodes and decodes expiration dates.
What I learned from this program: The definition of a perfect number.
Difficulties: Creating the boolean method. Originally believed it
was formatted like the .length(). Changed use to regular method to fix.
*/


import java.util.*;
import java.io.*;
public class Perfect
{
    public static boolean isPerfect(int base)
    {
        int factors= 0;
        for(int x = 1; x!=51;x++)
        {
            if ((base%x==0)&&(base != x))
            {
                factors = factors + x;
            }
        }
        if (factors == base)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main (String args[])
    {
        System.out.println("The following numbers between 1 and 100 are Perfect Integers:");
        System.out.println();
        for (int y= 1; y!=101;y++)
        {
            if(isPerfect(y)==true)
            {
                System.out.println(y);
            }
        }
    }
}
/*
The following numbers between 1 and 100 are Perfect Integers:

6
28

 
*/