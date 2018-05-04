/*
Program Name: Transpose
Author: Noah Webb
Class: AP Computer Science
Date: 04/04/17
Program description: Transpose prints two 2d arrays, one the transpose of the
other.
What I learned from this program: How to transpose a 2d array.
Difficulties: Originaly made two separate arrays instead of just changing
the print. This was wasteful.
*/


import java.util.*;
import java.io.*;
public class Transpose
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
        
        int [][] array = new int [5][5];
        
        for (int x = 0;x<5;x++)
        {
            for (int y = 0; y<5; y++)
            {
                array[x][y]=scan.nextInt();
            }
        }
        System.out.println("Original Matrix");
        for (int x =0; x<5; x++)
        {
            for (int y = 0; y<5; y++)
            {
                System.out.print(array[x][y]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("");
        System.out.println("Transpose");
        for (int x =0; x<5; x++)
        {
            for (int y = 0; y<5; y++)
            {
                System.out.print(array[y][x]+"\t");
            }
            System.out.print("\n");
        }
    }
}  

/*

Original Matrix
45	67	89	12	-3	
-3	-6	-7	-4	-9	
96	81	-8	52	12	
14	-7	72	29	-1	
19	43	28	63	87	

Transpose
45	-3	96	14	19	
67	-6	81	-7	43	
89	-7	-8	72	28	
12	-4	52	29	63	
-3	-9	12	-1	87	



  
 
*/