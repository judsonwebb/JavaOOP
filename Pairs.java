/*
Program Name: Pairs
Author: Noah Webb
Class: AP Computer Science
Date: 02/15/17
Program description: Pairs prints information about students from a file.
What I learned from this program: How to use arrays.
Difficulties: Wanted to create an array that could change its length to 
accomadate available data. Was unsure how, so I created a second pair.
*/


import java.util.*;
import java.io.*;
public class Pairs
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog402a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        int a[] = new int[100];
        int b[] = new int[000];
        
        System.out.println("ID/tScore");
        
        
        for (int x= 0; scan.hasNext();x++)
        {
            a[x]=scan.nextInt();
            b[x]=scan.nextInt();
            
        }
        for (int y=0;y<25;y++)
        {
            int greatest=0;
            int count = 25;
            for (int z= 0;z<25;z++)
            {
                if (b[z] > greatest)
                {
                    greatest= b[z];
                    count=z;
                }
            }
            if (!(count>24))
            {
                System.out.println(a[count]+"\t"+b[count]);
                b[count]=0;
            }
        }
        
        
    }
}
/*

Sum = 5095
Average = 242.62
Count = 21

Id  Score   Diff
115 257 14.38
123 253 10.38
116 246 3.38
113 243 0.38
112 239 -3.61
104 239 -3.61
110 238 -4.61
218 243 0.38
208 242 -0.61
222 223 -19.61
223 230 -12.61
213 229 -13.61
207 228 -14.61
203 224 -18.61
305 265 22.38
306 262 19.38
311 256 13.38
325 246 3.38
321 245 2.38
323 245 2.38
302 242 -0.61

  
 
*/