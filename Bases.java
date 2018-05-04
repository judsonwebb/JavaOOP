/*
Program Name: Bases
Author: Noah Webb
Class: AP Computer Science
Date: 03/20/17
Program description: Bases converts numbers of base ten to numbers of a
different base.
What I learned from this program: How to convert bases and values.
Difficulties: Had to implement letters for bases greater than ten. Used
ASCII values to fix.
*/


import java.util.*;
import java.io.*;
public class Bases
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter the number base 10 to convert: ");
        int convo = keyboard.nextInt();
        
        System.out.print("Enter the new base: ");
        int base = keyboard.nextInt();
       
        System.out.print("The number "+convo+" [base 10] = ");
        
        baseChange(convo,base);
        
        System.out.print(" [base "+base+"]\n");
    }
        
        
    public static void baseChange(int a, int base)
    {
           char b;
           if(a<base)
           {
               if(a<10)
               {
               System.out.print(a);
               }
               else
               {
               b = (char)(a+55);
               System.out.print(b);
               }
               
           }
           else
           {
               baseChange(a/base,base);
               if(a%base<10)
               {
               System.out.print(""+(a%base));
               }
               else
               {
               b = (char)(a%base+55);
               System.out.print(""+(b));
               }
               
           }
    }
}  

/*

Enter the number base 10 to convert: 255
Enter the new base: 16
The number 255 [base 10] = FF [base 16]
Enter the number base 10 to convert: 256
Enter the new base: 16
The number 256 [base 10] = 100 [base 16]
Enter the number base 10 to convert: 34
Enter the new base: 8
The number 34 [base 10] = 42 [base 8]
Enter the number base 10 to convert: 100
Enter the new base: 3
The number 100 [base 10] = 10201 [base 3]
Enter the number base 10 to convert: 1034
Enter the new base: 12
The number 1034 [base 10] = 722 [base 12]
Enter the number base 10 to convert: 6
Enter the new base: 7
The number 6 [base 10] = 6 [base 7]
Enter the number base 10 to convert: 1000
Enter the new base: 6
The number 1000 [base 10] = 4344 [base 6]
Enter the number base 10 to convert: 34347
Enter the new base: 13
The number 34347 [base 10] = 12831 [base 13]
Enter the number base 10 to convert: 12
Enter the new base: 3
The number 12 [base 10] = 110 [base 3]
Enter the number base 10 to convert: 54
Enter the new base: 2
The number 54 [base 10] = 110110 [base 2]
Enter the number base 10 to convert: 16
Enter the new base: 5
The number 16 [base 10] = 31 [base 5]
Enter the number base 10 to convert: 47
Enter the new base: 12
The number 47 [base 10] = 3B [base 12]
     


  
 
*/
