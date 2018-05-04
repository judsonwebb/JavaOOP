/*
Program Name: Binary
Author: Noah Webb
Class: AP Computer Science
Date: 03/09/17
Program description: Binary finds a numbers index in a series of numbers 
using the binary search method.
What I learned from this program: How to use the binary search method.
Difficulties: Had trouble setting up an array without excess information.
Added a second array.
*/


import java.util.*;
import java.io.*;
public class Binary
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("sort.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        int sort[] = new int[1000];
        
        int x=0;
        
        while(scan.hasNext())
        {
           sort[x]=scan.nextInt();
           x++;
        }
        int newSort[] = new int[x];
        int y =0;
            for (int z=0; z<1000;z++)
            {
                
                if (sort[z]>0)
                {
                    newSort[y]=sort[z];
                    y++;
                }
            }
        
        Scanner scanTwo = new Scanner(System.in);
        
        System.out.print("Enter a number to search for: ");
        int choose = scanTwo.nextInt();
        
        int position =find(newSort, choose)+1;
        
        if (position==0)
        {
            System.out.println("Your number does not occur in this list.");
        }
        else
        {
            System.out.println("Your number occurs at position "+position+".");
        }
    }
        
        
        private static int find (int a[], int choose)
        {
            int lb =0;
            int ub=a.length-1;
            
            while(lb<=ub)
            {
                int mid = (lb+ub)/2;
                if(a[mid]==choose)
                {
                    return mid;
                }
                else if (choose>a[mid])
                {
                    lb=mid+1;
                }
                else
                {
                    ub=mid-1;
                }
            }
            return-1;
        }
    }  

/*

Enter a number to search for: 50
Your number occurs at position 33.
Enter a number to search for: 8
Your number occurs at position 7.
Enter a number to search for: 80
Your number does not occur in this list.
Enter a number to search for: 42
Your number does not occur in this list.
Enter a number to search for: 67
Your number does not occur in this list.
Enter a number to search for: 98
Your number does not occur in this list.
Enter a number to search for: 97
Your number occurs at position 58.
Enter a number to search for: 46
Your number does not occur in this list.
Enter a number to search for: 11
Your number occurs at position 9.

     


  
 
*/
