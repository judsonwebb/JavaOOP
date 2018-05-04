/*
Program Name: Jailer
Author: Noah Webb
Class: AP Computer Science
Date: 02/21/17
Program description: Jailer computes the cells from which prisoners
are to be released.
What I learned from this program: How to use multivariable loop decision making
with arrays.
Difficulties: Originally misprinted each number by 1. Added 1 to the final 
output loop.
*/


import java.util.*;
import java.io.*;
public class Jailer
{
    public static void main (String args[])
    {

        int a[] = new int[1000];
        boolean b[] = new boolean[1000];
        
        for (int x=0;x<1000;x++)
        {
            for (int y=2;y<=1000;y++)
            {
                if(((x+1)%y)==0)
                {
                    a[x]= a[x]+1;
                } 
            }
            
        }
        for(int x=0;x<1000;x++)
        {
            if (((a[x]+2)%2)==0)
            {
                b[x]=true;
            }
            else
            {
                b[x]=false;
            }
        }
        int count = 0;
        System.out.println("The free prisoners are");
        for(int x=0;x<1000;x++)
        {
            if (b[x]==true)
            {
                count++;
                if(count%5==0)
                {
                    System.out.print(x+1+"\n");
                }
                else
                {
                    System.out.print(x+1+"\t");
                }
            }
        }
        System.out.println("\nor they all escaped after storming the jailer");
        System.out.println("when he first unlocked the doors!");
    }
}
/*

The free prisoners are
1	4	9	16	25
36	49	64	81	100
121	144	169	196	225
256	289	324	361	400
441	484	529	576	625
676	729	784	841	900
961	
or they all escaped after storming the jailer
when he first unlocked the doors!

 


  
 
*/