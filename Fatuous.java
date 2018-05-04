/*
Program Name: Fatuous
Author: Noah Webb
Class: AP Computer Science
Date: 11/15/16
Program description: Fatuous calculates the values of specific dice rolls.
What I learned from this program: How to use complex nested decision-making.
Difficulties: Arranging the nesting appropiately took some time.
*/
import java.util.*;
import java.io.*;
public class Fatuous
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        int value;
        
        System.out.print("Enter P: ");
        int p = keyboard.nextInt();
        
        System.out.print("Enter Q: ");
        int q = keyboard.nextInt();
        
        if (p%2==0)//even
        {
            if (q%2==0)//even
            {
                if (p == q)
                {
                    value = 3*p;
                }
                else
                {
                    value = p+q;
                }
            }
            else//odd
            {
                value = 2*p + q;
            }
        }
        else//odd
        {
            if (q%2==0)//even
            {
                value = p+ 2*q  ;
            }
            else//odd
            {
                if (p ==q)
                {
                    value = 3*q;
                }
                else
                {
                    value = p+q;
                }
            }
        }
        System.out.println("Value = "+value);
    }
}

/*Sample Output:

Enter P: 2
Enter Q: 5
Value = 9

Enter P: 4
Enter Q: 4
Value = 12

Enter P: 6
Enter Q: 2
Value = 8

Enter P: 1
Enter Q: 3
Value = 4

Enter P: 5
Enter Q: 5
Value = 15

Enter P: 1
Enter Q: 2
Value = 5




*/