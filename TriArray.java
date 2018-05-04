/*
Program Name: TriArray
Author: Noah Webb
Class: AP Computer Science
Date: 04/05/17
Program description: Tri array creates three arrays, with the third array being 
comprised of the greater values of the other two.
What I learned from this program: How to create arrays with decision making.
Difficulties: Accidentally printed arrayTwo twice, and neglected arrayThree.
Fixed by changing print statement.
*/


import java.util.*;
import java.io.*;
public class TriArray
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog465a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        int [][] arrayOne = new int [4][4];
        int [][] arrayTwo = new int [4][4];
        int [][] arrayThree = new int [4][4];
        
        for (int x = 0;x<4;x++)
        {
            for (int y = 0; y<4; y++)
            {
                arrayOne[x][y]=scan.nextInt();
            }
        }
        for (int x = 0;x<4;x++)
        {
            for (int y = 0; y<4; y++)
            {
                arrayTwo[x][y]=scan.nextInt();
            }
        }
        int max=-1000000;
        for (int x = 0;x<4;x++)
        {
            for (int y = 0; y<4; y++)
            {
                max=-1000000000;
                if(arrayOne[x][y]>max)
                {
                    max=arrayOne[x][y];
                }
                if(arrayTwo[x][y]>max)
                {
                    max=arrayTwo[x][y];
                }
                arrayThree[x][y]=max;
            }
        }
        
        
        
        
        System.out.println("Matrix One");
        for (int x =0; x<4; x++)
        {
            for (int y = 0; y<4; y++)
            {
                System.out.print(arrayOne[x][y]+"\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("\nMatrix Two");
        for (int x =0; x<4; x++)
        {
            for (int y = 0; y<4; y++)
            {
                System.out.print(arrayTwo[x][y]+"\t");
            }
            System.out.print("\n");
        }
        
        System.out.println("\nLargest Elements");
        for (int x =0; x<4; x++)
        {
            for (int y = 0; y<4; y++)
            {
                System.out.print(arrayThree[x][y]+"\t");
            }
            System.out.print("\n");
        }
    }
}  

/*

Matrix One
2	7	6	4	
6	1	2	4	
9	7	2	6	
8	3	2	1	

Matrix Two
4	1	3	7	
6	2	3	8	
7	2	2	4	
4	2	3	1	

Largest Elements
4	7	6	7	
6	2	3	8	
9	7	2	6	
8	3	3	1	
  
 
*/
