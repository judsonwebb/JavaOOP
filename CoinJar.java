/*
Program Name: CoinJar
Author: Noah Webb
Class: AP Computer Science
Date: 11/02/16
Program description: CoinJar prints the possible coin combinations of 14 coins
that have a value of 1.05$.
What I learned from this program: How to use decision making within heavily 
nested loops.
Difficulties: originally gave variable z its own loop. Fixed by making z equal
to 14 - w - x - y.
*/


public class CoinJar
{
    public static void main (String args[])
    {
        System.out.println("The possible combinations of coins are:");
        System.out.println();
        
        int quarter, dime, nickel, penny, w, x, y, z;
        
        {
            for (w = 0; w<15;w++)
            {
                quarter = w*25;
                for (x = 0;x<15-w;x++)
                {
                    dime = x*10;
                    for (y=0;y<15-x-w;y++)
                    {
                        nickel = y*5;
                        z= 14-y-x-w;                        
                        penny = z;
                            
                        if ((penny+nickel+dime+quarter) == 105)
                        {
                           System.out.println(w+" quarters "+x+" dimes "+y+" nickels "+z+" pennies");
                        }
                        
                    }
                }
            }
        }
       
    }
}

/*Sample Output:
The possible combinations of coins are:

0 quarters 7 dimes 7 nickels 0 pennies
1 quarters 3 dimes 10 nickels 0 pennies
1 quarters 7 dimes 1 nickels 5 pennies
2 quarters 3 dimes 4 nickels 5 pennies


*/