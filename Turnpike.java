/*
Program Name: Turnpike
Author: Noah Webb
Class: AP Computer Science
Date: 02/26/17
Program description: Turnpike finds the costs of varying cars and getes.
What I learned from this program: How to use switch statements with arrays.
Difficulties: Originally had running errors. had to subtract one from a and b to fix.
*/


import java.util.*;
import java.io.*;
public class Turnpike
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog435a.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        double gate[] = {1.35,2,2.5,3.25,4.10,4.8,5.5,6};
        double type[] = {1.0,1.3,1.6,2.0,2.4,2.7};
        System.out.println("Car Type\tBase Toll\tFactor\tCost");
        while(scan.hasNext())
        {
            int a =scan.nextInt();
            int b =scan.nextInt();
            double cost = type[a-1]*gate[b-1];
            cost = (int)(cost*100+.5)/100.0;
            switch(a)
            {
                case 0:
                System.out.println("Compact Car\t"+gate[b-1]+"\t\t"+type[a-1]+"\t$"+cost);
                break;
                case 1:
                System.out.println("Small Car\t"+gate[b-1]+"\t\t"+type[a-1]+"\t$"+cost);
                break;
                case 2:
                System.out.println("Mid Size Car\t"+gate[b-1]+"\t\t"+type[a-1]+"\t$"+cost);
                break;
                case 3:
                System.out.println("Full Size Car\t"+gate[b-1]+"\t\t"+type[a-1]+"\t$"+cost);
                break;
                case 4:
                System.out.println("Truck\t\t"+gate[b-1]+"\t\t"+type[a-1]+"\t$"+cost);
                break;
                case 5:
                System.out.println("16 Wheeler\t"+gate[b-1]+"\t\t"+type[a-1]+"\t$"+cost);
                break;
            }
        }
    }
}
/*

Car Type           Base Toll    Factor  Cost
Small Car          $1.35        1.0     $1.35
Mid Size Car       $2.5         1.3     $3.25
Full Size Car      $4.1         1.6     $6.56
Truck              $5.5         2.0     $11.0
16 Wheeler         $2.0         2.4     $4.8
Small Car          $4.8         1.0     $4.8
Mid Size Car       $6.0         1.3     $7.8
Full Size Car      $1.35        1.6     $2.16
Truck              $2.5         2.0     $5.0
16 Wheeler         $4.1         2.4     $9.84
Small Car          $6.0         1.0     $6.0
Mid Size Car       $1.35        1.3     $1.76
Full Size Car      $2.0         1.6     $3.2
Truck              $2.5         2.0     $5.0
16 Wheeler         $3.25        2.4     $7.8
     


  
 
*/