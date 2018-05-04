/*
Program Name: VowelStar
Author: Noah Webb
Class: AP Computer Science
DAte: 11/29/16
Program description: VowelStar prints out names with asterisks replacing
all vowels.
What I learned from this program: How to make letter changes using loops.
Difficulties: Originally had trouble printing each letter one at a time. 
Fixed with a loop.
*/

//these allow access to the Scanner Class
import java.io.*;
import java.util.*;
public class VowelStar
{
    public static void main (String args[])
    {
        //This inputs a new scanner.
        Scanner keyboard = new Scanner(System.in);
        
        //This asks for and collects the name.
        System.out.print("Enter your name: ");
        String name = keyboard.nextLine();
        
        //This puts the character length of the word into integer form.
        int len = name.length();
        
        //This centers the name horizontally on the console. 
        for (int x=0;x!=(80-len)/2;x++)
        {
            System.out.print(" ");
        }
        
        //This prints out each letter of the name unless it is a vowel.
        for (int x=0;x!=len;x++)
        {
            if ((name.charAt(x)!='a')&&(name.charAt(x)!='e')&&(name.charAt(x)!='i')&&(name.charAt(x)!='o')&&(name.charAt(x)!='u'))
            {
                System.out.print(name.charAt(x));
            }
            else
            {
                System.out.print("*");
            }
        }
        System.out.println();
    }
}
/* Sample Output:
  
Enter your name: David Fisher
                                  D*v*d F*sh*r
Enter your name: Sarah Jones
                                  S*r*h J*n*s
Enter your name: Nathaniel Mandrake
                               N*th*n**l M*ndr*k*
Enter your name: Ian Todd
                                    I*n T*dd


*/
