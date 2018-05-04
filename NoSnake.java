/*
Program Name: NoSnake
Author: Noah Webb
Class: AP Computer Science
Date: 02/27/17
Program description: NoSnake prints probabilities of dice rolls.
What I learned from this program: How to use arrays to determine probabilities.
Difficulties: Originally used decision making then determined it wasn't necessary.
*/


import java.util.*;
import java.io.*;
public class NoSnake
{
    public static void main (String args[])
    {        
        int outcome[] = new int[19];
        
        for (int x = 1; x<=6;x++)
        {
            for (int y = 1; y<=6;y++)
            {
                for (int z = 1; z<=6; z++)
                {
                    outcome[x+y+z]= outcome[x+y+z]+1;
                }
            }
        }
        System.out.println("Number\tPossible Combinations\tProbability of Rolling");
        for(int x = 1;x<19;x++)
        {
            double prob = ((outcome[x]*1.0)/216)*100;
            prob = (int)(prob*1000+.5)/1000.0;
            System.out.println(x+"\t\t"+outcome[x]+"\t\t\t"+prob+"%");
        }
        
    }  
}
/*

Number  Possible Combinations   Probability of Rolling
1               0                        0.0%
2               0                        0.0%
3               1                        0.463%
4               3                        1.389%
5               6                        2.778%
6               10                       4.63%
7               15                       6.944%
8               21                       9.722%
9               25                       11.574%
10              27                       12.5%
11              27                       12.5%
12              25                       11.574%
13              21                       9.722%
14              15                       6.944%
15              10                       4.63%
16              6                        2.778%
17              3                        1.389%
18              1                        0.463%
    

     


  
 
*/