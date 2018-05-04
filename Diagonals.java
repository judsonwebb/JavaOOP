/*
Program Name: Diagonals
Author: Noah Webb
Class: AP Computer Science
Date: 04/04/17
Program description: Diagonals prints an array and the sum of its diagonals.
What I learned from this program: How to count diagonals of an array.
Difficulties: Originally used separate loops to count the diagonals, which
was unnecessary.
*/


import java.util.*;
import java.io.*;
public class Diagonals
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
        int mainSum=0;
        int otherSum=0;
        
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
        for (int y = 0; y<5; y++)
        {
            mainSum = mainSum + array[y][y];
            otherSum = otherSum + array[4-y][y];
        } 
        
        System.out.println("");
        System.out.println("Main Diagonal Sum: " +mainSum);
        System.out.println("Other Diagonal Sum: " +otherSum);
    }
}  

/*

Original Matrix
45	67	89	12	-3	
-3	-6	-7	-4	-9	
96	81	-8	52	12	
14	-7	72	29	-1	
19	43	28	63	87	

Main Diagonal Sum: 147
Other Diagonal Sum: -3


  
 
*/