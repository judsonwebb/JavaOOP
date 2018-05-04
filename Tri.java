/*
Program Name: Tri
Author: Noah Webb
Class: AP Computer Science
Date: 01/04/17
Program description: Tri prints out the sides and the area of triangles using 
Heron's Formula.
What I learned from this program: How to determine the area of an nonright 
triangle.
Difficulties: Had trouble determining whether triangles existed. Determined
with A!>=B+C.
*/


import java.util.*;
import java.io.*;
public class Tri
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("Prog610a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        System.out.println("A\tB\tC\tAREA");
        
        while(scan.hasNext())
        {
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            int x = 0;
            if(a>=c+b)
            {
                x++;
            }
            if(c>=a+b)
            {
                x++;
            }
            if(b>=c+a)
            {
                x++;
            }
           
            double s = (a+b+c)/2.0;
            
            double area= Math.sqrt(s*(s-a)*(s-b)*(s-c));
            area= (int)(area*10000+.5)/10000.0;
            
            if (x==0)
            {
                System.out.println(a+"\t"+b+"\t"+c+"\t"+area);
            }
            else
            {
                System.out.println(a+"\t"+b+"\t"+c+"\tThis is not a triangle");
            }
        }
    }
}
/*

A	B	C	AREA
3	4	5	6.0
3	4	50	This is not a triangle
7	8	9	26.8328
9	9	12	40.2492
6	5	21	This is not a triangle
24	7	25	84.0
13	12	5	30.0
50	40	30	600.0
10	10	10	43.3013
82	34	48	This is not a triangle
4	5	6	9.9216
  
 
*/