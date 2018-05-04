/*
Program Name: TwentyRand
Author: Noah Webb
Class: AP Computer Science
Date: 02/21/17
Program description: TwentyRand generates random numbers and then orders them 
from least to greatest.
What I learned from this program: How to reverse an array of values.
Difficulties: Tried to adapt the ordering process from Prog408a. Ended up
having to change it to accommodate a second array.
*/


import java.util.*;
import java.io.*;
public class TwentyRand
{
    public static void main (String args[])
    {
        Random dent = new Random();
        
        
        int a[] = new int[20];
        int b[] = new int[20];
        for (int x = 0;x<20;x++)
    {
        int count =0;
        int c = dent.nextInt(30)+1;
        for (int y = 0;y<20;y++)
        {
            int f= a[y];
            if (c==f)
            {
                count--;
            }
        }
        if (count==0)
        {
            a[x]=c;
        }
        else
        {
           x--; 
        }
        
    }
    for (int y=0;y<20;y++)
        {
            int greatest=0;
            int count = 20;
            for (int z= 0;z<20;z++)
            {
                if (a[z] > greatest)
                {
                    greatest= a[z];
                    b[y]=a[z];
                    count=z;
                }
            }
            if (!(count>=20))
            {
                a[count]=0;
            }
        }
    int c[]=new int[20];
    for (int y=0;y<20;y++)
    {
        c[y]=b[19-y];
        if ((y+1)%5==0)
        {
            System.out.print(c[y]+"\n");
        }
        else
        {
            {
            System.out.print(c[y]+"\t");
            }
        }
    }
        
    }
}
/*

1	2	5	6	9
10	11	12	14	15
18	19	20	22	23
24	25	28	29	30

1	3	5	6	7
9	10	14	15	16
18	19	20	22	23
24	25	27	28	29

2	3	5	7	8
9	11	12	13	15
16	17	18	19	21
23	24	25	26	27

  
 
*/