/*
Program Name: Mr_Na
Author: Noah Webb
Class: AP Computer Science
Date: 12/7/16
Program description: Mr_Na prints all three base combinations of the 
four bases found in mRNA.
What I learned from this program: How to use switch statements in 
combination printers.
Difficulties: Originally tried to use if else statements, but it 
was needlessly complex.
*/
import java.util.*;
import java.io.*;
public class Mr_Na
{
    public static void main (String args[])
    {
        
        //prints four columns of three letter sets.
        for(int x =0;x!=4;x++)
        {
            for(int y =0;y!=4;y++)
            {
                for(int z =0;z!=4;z++)
                {
                    //determines first letter
                    switch (x)
                    {
                        case 0:
                        System.out.print('A');
                        break;
                        case 1:
                        System.out.print('U');
                        break;
                        case 2:
                        System.out.print('C');
                        break;
                        case 3:
                        System.out.print('G');
                        break;
                    }
                    
                    //determines second letter
                    switch (y)
                    {
                        case 0:
                        System.out.print('A');
                        break;
                        case 1:
                        System.out.print('U');
                        break;
                        case 2:
                        System.out.print('C');
                        break;
                        case 3:
                        System.out.print('G');
                        break;
                    }
                    
                    //determines third letter.
                    switch (z)
                    {
                        case 0:
                        System.out.print("A\t");
                        break;
                        case 1:
                        System.out.print("U\t");
                        break;
                        case 2:
                        System.out.print("C\t");
                        break;
                        case 3:
                        System.out.print("G\n");
                        break;
                    }
                    
                }
            }
        }
        
      
    }
}
/*

AAA	AAU	AAC	AAG
AUA	AUU	AUC	AUG
ACA	ACU	ACC	ACG
AGA	AGU	AGC	AGG
UAA	UAU	UAC	UAG
UUA	UUU	UUC	UUG
UCA	UCU	UCC	UCG
UGA	UGU	UGC	UGG
CAA	CAU	CAC	CAG
CUA	CUU	CUC	CUG
CCA	CCU	CCC	CCG
CGA	CGU	CGC	CGG
GAA	GAU	GAC	GAG
GUA	GUU	GUC	GUG
GCA	GCU	GCC	GCG
GGA	GGU	GGC	GGG




*/