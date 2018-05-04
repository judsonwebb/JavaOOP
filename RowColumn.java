/*
Program Name: RowColumn
Author: Noah Webb
Class: AP Computer Science
Date: 04/05/17
Program description: RowColumn adds an additional row and column to a 2d array
based on value sums.
What I learned from this program: How to create additional rows and columns.
Difficulties: Originally obtained 2X the correct amount for the final number.
This was because I inadvertently added both the bottom and the rightmost row
and column respectively.
*/


import java.util.*;
import java.io.*;
public class RowColumn
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
        
        int [][] array = new int [6][6];
        
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
        int sum = 0;
        for (int x =0; x<5; x++)
        {
            sum=0;
            for (int y = 0; y<5; y++)
            {
                sum = sum +array[x][y];
            }
            array[x][5]=sum;
        }
        for (int x =0; x<5; x++)
        {
            sum=0;
            for (int y = 0; y<5; y++)
            {
                sum = sum +array[y][x];
            }
            array[5][x]=sum;
        }
        sum=0;
        for (int x =0; x<6; x++)
        {
            sum = sum + array[x][5];
        }
        array[5][5]=sum;
        
        System.out.println("\nWith Totals");
        for (int x =0; x<6; x++)
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

Original Matrix
45	67	89	12	-3	
-3	-6	-7	-4	-9	
96	81	-8	52	12	
14	-7	72	29	-1	
19	43	28	63	87	

With Totals
45	67	89	12	-3	210	
-3	-6	-7	-4	-9	-29	
96	81	-8	52	12	233	
14	-7	72	29	-1	107	
19	43	28	63	87	240	
171	178	174	152	86	761	

  
 
*/