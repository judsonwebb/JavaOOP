/*
Program Name: Change
Author: Noah Webb
Class: AP Computer Science
Date: 03/01/17
Program description: Change tells a cashier how much change to return.
What I learned from this program: How to use arrays with methods.
Difficulties: Originally created without the use of a toString method. This
was overly complicated, so I added one.
*/


import java.util.*;
import java.io.*;
public class Change
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("Enter purchase price $");
        double purchase = keyboard.nextDouble();
        
        System.out.print("Enter amount given $");
        double amount = keyboard.nextDouble();
        
        TheChange change= new TheChange(purchase, amount);
        
        System.out.println("++++++++++++++");
        System.out.println("Correct Change");
        System.out.println("++++++++++++++");
        System.out.println(change.toString());
    }  
}
/*

Enter purchase price $576.23
Enter amount given $643.54
++++++++++++++
Correct Change
++++++++++++++
Ones =67
Quarters =1
Dimes =0
Nickels =1
Pennies =1
Total Amount =$67.31
 
  
 
 

     
 
*/