/*
Program Name: Largest
Author: Noah Webb
Class: AP Computer Science
Date: 04/04/17
Program description: Largest creates a 6X5 array with 2 of the largest number.
What I learned from this program: How to use 2d arrays.
Difficulties: Originally formatted with 1 as the first array value instead of 1.
*/


import java.util.*;
import java.io.*;
public class Largest
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog464a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        int [][] array = new int [5][6];
        
        for (int x = 0;x<5;x++)
        {
            for (int y = 0; y<5; y++)
            {
                array[x][y]=scan.nextInt();
            }
        }
        for (int x =0; x<5; x++)
        {
            int max= -10000;
            for (int y = 0; y<5; y++)
            {
                if (array[x][y]>max)
                {
                    max = array[x][y];
                }
            }
            array[x][5]=max;
        }
        for (int x =0; x<5; x++)
        {
            for (int y = 0; y<6; y++)
            {
                System.out.print(array[x][y]+"\t");
            }
            System.out.print("\n");
        }
    }
}  

/*

45	67	89	12	-3	89	
-3	-6	-7	-4	-9	-3	
96	81	-8	52	12	96	
14	-7	72	29	-1	72	
19	43	28	63	87	87	



  
 
*/
