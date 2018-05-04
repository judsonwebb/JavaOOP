/*
Program Name: Number
Author: Noah Webb
Class: AP Computer Science
Date: 01/24/17
Program description: Number finds the individual digits of a number.
What I learned from this program: How to create classes.
Difficulties: Originally had the number class inside of another class called
DigitE. This made it fail to communicate with th test class.
*/


import java.util.*;
import java.io.*;

    public class Number
    {
        private int wholeNumber;
        
        public Number()
        {
            wholeNumber=0;
        }
        public Number(int x)
        {
            wholeNumber=x;
        }
    
    /****************ACCESSORS*********************/
        public int getUnit()
        {
            int z = wholeNumber;
            z = z%10;
            return z;
        }
        public int getTen()
        {
            int z = wholeNumber;
            z = z%100;
            int y = wholeNumber%10;
            z= z-y;
            z= z/10;
            return z;
        }
        public int getHundred()
        {
            int z = wholeNumber;
            z = z%1000;
            int y = wholeNumber%100;
            z= z-y;
            z= z/100;
            return z;
        }
        public int getThousand()
        {
            int z = wholeNumber;
            int y = wholeNumber%1000;
            z= z-y;
            z= z/1000;
            return z;
        }   
    }

/*
Which option?6
Invalid: retry 
1
The Units digit is 0
Enter a number (0 to 9999): 870
Options
1) Units
2) Tens
3) Hundreds
4) Thousands
5) Quit

Which option?4
The Thousands digit is 0
Enter a number (0 to 9999): 870
Options
1) Units
2) Tens
3) Hundreds
4) Thousands
5) Quit

Which option?2
The Tens digit is 7
Enter a number (0 to 9999): 870
Options
1) Units
2) Tens
3) Hundreds
4) Thousands
5) Quit

Which option?3
The Hundreds digit is 8
Enter a number (0 to 9999): 870
Options
1) Units
2) Tens
3) Hundreds
4) Thousands
5) Quit

Which option?5


  
 
*/