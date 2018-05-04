/*
Program Name: Salesman
Author: Noah Webb
Class: AP Computer Science
Date: 02/26/17
Program description: Salesman prints the frequency of salary ranges.
What I learned from this program: How to use arrays for frequencies.
Difficulties: Originally tried to print with switch statement but it
turned out to be impractical.
*/


import java.util.*;
import java.io.*;
public class Salesman
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog412a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        double pay[] = new double[100];
        int x=0;
        
        while(scan.hasNext())
        {
            x++;
            int sales = scan.nextInt();
            double newSales = sales *.09+200;
            pay[x]=newSales;
        }
        System.out.println("Salary\tFrequency");
        int count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=200&&pay[x]<300)
            {
                count++;
            }
        }
        System.out.println("$200-$299\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=300&&pay[x]<400)
            {
                count++;
            }
        }
        System.out.println("$300-$399\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=400&&pay[x]<500)
            {
                count++;
            }
        }
        System.out.println("$400-$499\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=500&&pay[x]<600)
            {
                count++;
            }
        }
        System.out.println("$500-$599\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=600&&pay[x]<700)
            {
                count++;
            }
        }
        System.out.println("$600-$699\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=700&&pay[x]<800)
            {
                count++;
            }
        }
        System.out.println("$700-$799\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=800&&pay[x]<900)
            {
                count++;
            }
        }
        System.out.println("$800-$899\t"+ count);
        
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=900&&pay[x]<1000)
            {
                count++;
            }
        }
        System.out.println("$900-$999\t"+ count);
    
        count = 0;
        for (x = 0;x<100;x++)
        {
            if (pay[x]>=1000&&pay[x]<1100)
            {
                count++;
            }
        }
        System.out.println("$1000-$1099\t"+ count);
    }  
}
/*

Salary	Frequency
$200-$299	5
$300-$399	2
$400-$499	2
$500-$599	1
$600-$699	3
$700-$799	1
$800-$899	2
$900-$999	1
$1000-$1099	2

 
     


  
 
*/