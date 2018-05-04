/*
Program Name: Sparse
Author: Noah Webb
Class: AP Computer Science
Date: 04/06/17
Program description: Sparse converts a matrix into a new representation if sparse.
What I learned from this program: How to work with sparse matrices
Difficulties: Needed to add +1 to the new values in the new matrix representing
position.
*/


import java.util.*;
import java.io.*;
public class Sparse
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog465h.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
    for(int j = 0; j<3;j++)
        {
        int [][] arrayOG = new int [5][6];
        int [][] newArray = new int [50][3];
        int countOG = 0;
        int countNew = 0;
        int tossValue=scan.nextInt();
        tossValue=scan.nextInt();
        
        for (int x = 0;x<5;x++)
        {
            for (int y = 0; y<6; y++)
            {
                arrayOG[x][y]=scan.nextInt();
                countOG++;
            }
        }
        int b = 0;
        int c = 0;
        for (int x = 0;x<5;x++)
        {
            for (int y = 0; y<6; y++)
            {
                if(arrayOG[x][y]!=0)
                {
                    newArray[b][c]=x+1;
                    c++;
                    countNew++;
                    newArray[b][c]=y+1;
                    c++;
                    countNew++;
                    newArray[b][c]=arrayOG[x][y];
                    c=c-2;
                    countNew++;
                    b++;
                }
            }
        }
        System.out.println("Original Matrix\n");
        for (int x = 0;x<5;x++)
        {
            for (int y = 0; y<6; y++)
            {
                System.out.print(arrayOG[x][y]+"\t");
            }
            System.out.print("\n");
        }
        System.out.println("\n");
        
        if(countOG<countNew)
        {
            System.out.println("The Original Matrix is Abundant\n");
        }
        if(countOG>=countNew)
        {
        for (int x = 0;x<50;x++)
        {
            for (int y = 0; y<3; y++)
            {
                if(newArray[x][y]!=0)
                {
                    System.out.print(newArray[x][y]+"\t");
                    if(y==2)
                    {
                       System.out.print("\n"); 
                    }
                }
            }
            
        }
        }
        if(countOG==countNew)
        {
            System.out.println("The Original Matrix and the Sparse Matrix\nare Equally Efficient\n");
        }
        else if(countOG>countNew)
        {
            System.out.println("The Original Matrix is Sparse\n");
        }
    }
    }
}  

/*

Original Matrix

0	0	7	0	0	0	
0	0	0	0	-8	0	
0	0	0	0	0	0	
2	0	0	0	0	0	
0	0	0	0	0	0	


1	3	7	
2	5	-8	
4	1	2	
The Original Matrix is Sparse

Original Matrix

0	2	0	3	0	1	
8	0	4	0	1	0	
0	3	0	1	0	-7	
5	0	9	0	6	0	
0	2	0	-1	0	7	


The Original Matrix is Abundant

Original Matrix

0	0	1	0	0	2	
3	0	0	4	0	0	
0	0	5	0	0	6	
7	0	0	8	0	0	
0	0	9	0	0	1	


1	3	1	
1	6	2	
2	1	3	
2	4	4	
3	3	5	
3	6	6	
4	1	7	
4	4	8	
5	3	9	
5	6	1	
The Original Matrix and the Sparse Matrix
are Equally Efficient

  
 
 
  
 
*/
