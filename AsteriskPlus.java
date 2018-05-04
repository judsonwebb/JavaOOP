/*
Program Name: AsteriskPlus
Author: Noah Webb
Class: AP Computer Science
Date: 12/19/16
Program description: AsteriskPlus creates different triangles with varying
rows.
What I learned from this program: How to use switch decision making.
Difficulties: Had trouble with the third triangle, until I created a second 
print statement.
*/


import java.util.*;
import java.io.*;
public class AsteriskPlus
{
    public static void main (String args[])
    {
        System.out.println("Types of Triangles");
        System.out.println("1. Left");
        System.out.println("2. Right");
        System.out.println("3. Center");
        
        //This creates the scanner to read the file.
        Scanner keyboard = new Scanner(System.in);
        int z;
        System.out.print("\nEnter a number of Triangle Type: ");
        int x=keyboard.nextInt();
        System.out.print("How many rows? ");
        int rows = keyboard.nextInt();
        
        switch (x)
        {
            case 1:
            for(z=1;z<=rows;z++)
            {
                for(int a =0;a!=z;a++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            break;
            case 2:
            for(z=rows-1;z>=0;z--)
            {
                for(int a =0;a!=z;a++)
                {
                    System.out.print(" ");
                }
                for(int b=z;b!=rows;b++)
                {
                    System.out.print("*");
                }
                System.out.print("\n");
            }
            break;
            case 3:
            for(z=rows-1;z>=0;z--)
            {
                for(int a =0;a!=z;a++)
                {
                    System.out.print(" ");
                }
                for(int b=rows-1;b!=z;b--)
                {
                    System.out.print("**");
                }
                System.out.print("*");
                System.out.print("\n");
            }
            break;
        }
    }
}
/* Sample Output:

Types of Triangles
1. Left
2. Right
3. Center

Enter a number of Triangle Type: 3
How many rows? 8
       *
      ***
     *****
    *******
   *********
  ***********
 *************
***************

Types of Triangles
1. Left
2. Right
3. Center

Enter a number of Triangle Type: 2
How many rows? 6
     *
    **
   ***
  ****
 *****
******

Types of Triangles
1. Left
2. Right
3. Center

Enter a number of Triangle Type: 1
How many rows? 11
*
**
***
****
*****
******
*******
********
*********
**********
***********



*/