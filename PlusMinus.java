/*
Program Name: PlusMinus
Author: Noah Webb
Class: AP Computer Science
Date: 02/15/17
Program description: PlusMinus takes numbers and sorts them into positive
and negative.
What I learned from this program: How to create multiple arrays with a single 
loop.
Difficulties: Originally had trouble keeping the two data lists seperate. Fixed 
with decision-making.
*/


import java.util.*;
import java.io.*;
public class PlusMinus
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog404a1.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        int a[] = new int[100];
        int b[] = new int[100];
        
        System.out.println("Positive Negative");
        
        int countA=0;
        int countB=0;
        
        
        for (int x= 0; scan.hasNext();x++)
        {
            int z= scan.nextInt();
            if (z>0)
            {
                countA++;
                a[x-countB]=z;
            }
            else if (z<0)
            {
                countB++;
                b[x-countA]=z;
            }
        }
        for (int x= 0; x<100;x++)
        {
            int y=a[x];
            int z=b[x];
            
            if(y!=0||z!=0)
            {
            if (y!=0)
            {
                System.out.print(y);
            }
            System.out.print("\t");
            if (z!=0)
            {
                System.out.print(z);
            }
            System.out.print("\n");
            }
            
        }
        
        System.out.print("\n");
        System.out.print("\n");
        /***********SECOND RUN*****************************/
        
        Scanner scanTwo = null;
        try 
        {
            scanTwo = new Scanner(new File("prog404a2.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        int g[] = new int[100];
        int h[] = new int[100];
        
        System.out.println("Positive Negative");
        
        int countG=0;
        int countH=0;
        
        
        for (int x= 0; scanTwo.hasNext();x++)
        {
            int z= scanTwo.nextInt();
            if (z>0)
            {
                countG++;
                g[x-countH]=z;
            }
            else if (z<0)
            {
                countH++;
                h[x-countG]=z;
            }
        }
        for (int x= 0; x<100;x++)
        {
            int y=g[x];
            int z=h[x];
            
            if(y!=0||z!=0)
            {
            if (y!=0)
            {
                System.out.print(y);
            }
            System.out.print("\t");
            if (z!=0)
            {
                System.out.print(z);
            }
            System.out.print("\n");
            }
        }
    }
}
/*

Positive Negative
3	-8
66	-16
54	-56
22	-34
19	-22
21	-55
34	-3
64	-55
55	-76
9	-45
39	
54	
33	


Positive Negative
8	-3
10	-66
56	-54
34	-22
22	-19
55	-21
3	-34
55	-64
76	-55
45	-9
	-89
	-54
	-3
	-25


  
 
*/