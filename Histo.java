/*
Program Name: Histo
Author: Noah Webb
Class: AP Computer Science
Date: 01/03/17
Program description: Histo produces lines of a histogram based on float values.
What I learned from this program: How to create a program with multiple methods.
Difficulties: Initially made a rounding error by rounding to the tenths place. 
removed *10&/10 to fix.
*/


import java.util.*;
import java.io.*;
public class Histo
{
    public static void Histogram (float number,String icon)
    {
        int rounded = (int)(number+.5);
        for (int x=0; x!=rounded;x++)
        {
            System.out.print(icon);
        }
        System.out.print(" "+number);
    }
    public static void Histogram (float number)
    {
        int rounded = (int)(number+.5);
        for (int x=0; x!=rounded;x++)
        {
            System.out.print("*");
        }
        System.out.print(" "+number);
    }
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter value to chart: ");
        float value=keyboard.nextFloat();
        
        String clear = keyboard.nextLine();
        
        System.out.print("Do you wish to supply the graphing character (Y/N) ");
        String confirm=(keyboard.nextLine()).charAt(0)+"";
        
        
        
        if ((confirm.toUpperCase()).equals("Y"))
        {
            System.out.print("Enter the character: ");
            String character =(keyboard.nextLine()).charAt(0)+"";
            Histogram(value,character);
        }
        else
        {
            Histogram(value);
        }
        System.out.println();
    }
}
/* Sample Output:

Enter value to chart: 13.5
Do you wish to supply the graphing character (Y/N) n
************** 13.5
Enter value to chart: 3.2
Do you wish to supply the graphing character (Y/N) y
Enter the character: $
$$$ 3.2
Enter value to chart: 16.1
Do you wish to supply the graphing character (Y/N) y
Enter the character: @
@@@@@@@@@@@@@@@@ 16.1
Enter value to chart: 0
Do you wish to supply the graphing character (Y/N) n
 0.0
Enter value to chart: 32
Do you wish to supply the graphing character (Y/N) Y
Enter the character: X
XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX 32.0
Enter value to chart: 7.8
Do you wish to supply the graphing character (Y/N) y
Enter the character: 6
66666666 7.8
Enter value to chart: 7.4
Do you wish to supply the graphing character (Y/N) y
Enter the character: 8
8888888 7.4





*/