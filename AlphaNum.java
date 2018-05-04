/*
Program Name: AlphaNum
Author: Noah Webb
Class: AP Computer Science
DAte: 11/30/16
Program description: AlphaNum converts phone numbers with letters 
into typical phone numbers
What I learned from this program: How to convert characters into 
different characters.
Difficulties:Originally printed out the wrong numbers. Modified 
the decision making to fix.
*/

//these allow access to the Scanner Class
import java.io.*;
import java.util.*;
public class AlphaNum
{
    public static void main (String args[])
    {
        //This inputs a new scanner.
        Scanner keyboard = new Scanner(System.in);
        
        //This asks for and collects the number.
        System.out.print("Enter the number (no caps): ");
        String number = keyboard.nextLine();
        
        //This puts the character length of the word into integer form.
        int len = number.length();
        
        
        
        System.out.print("The number to dial is ");

        for (int x=0;x!=len;x++)
        {
            if (number.charAt(x)=='a'||number.charAt(x)=='b'||number.charAt(x)=='c')
            {
                System.out.print("2");
            }
            else if (number.charAt(x)=='d'||number.charAt(x)=='e'||number.charAt(x)=='f')
            {
                System.out.print("3");
            }
            else if (number.charAt(x)=='g'||number.charAt(x)=='h'||number.charAt(x)=='i')
            {
                System.out.print("4");
            }
            else if (number.charAt(x)=='j'||number.charAt(x)=='k'||number.charAt(x)=='l')
            {
                System.out.print("5");
            }
            else if (number.charAt(x)=='m'||number.charAt(x)=='n'||number.charAt(x)=='o')
            {
                System.out.print("6");
            }
            else if (number.charAt(x)=='p'||number.charAt(x)=='r'||number.charAt(x)=='s')
            {
                System.out.print("7");
            }
            else if (number.charAt(x)=='t'||number.charAt(x)=='u'||number.charAt(x)=='v')
            {
                System.out.print("8");
            }
            else if (number.charAt(x)=='w'||number.charAt(x)=='x'||number.charAt(x)=='y')
            {
                System.out.print("9");
            }
            else
            {
                System.out.print(number.charAt(x));
            }
        }
        System.out.println();
    }
}
/* Sample Output:
  
Enter the number (no caps): 1800callatt
The number to dial is 18002255288
Enter the number (no caps): 18004swbyps
The number to dial is 18004792977
Enter the number (no caps): 816weteach
The number to dial is 8169383224



*/
