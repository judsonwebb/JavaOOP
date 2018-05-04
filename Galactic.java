/*
Program Name: Galactic
Author: Noah Webb
Class: AP Computer Science
Date: 02/28/17
Program description: Galactic does weight conversions for various planets.
What I learned from this program: How to use arrays with different values and
the same index to create small databases.
Difficulties: Program originally continued to ask for weight after the user
asked to quit. Used decision-making to fix. 

*/


import java.util.*;
import java.io.*;
public class Galactic
{
    public static void main (String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        
        int y= 0;
        int weight = 0;
        
        double planetsRatio[]= {.27,.85,.16,.38,2.64,1.17,1.12,.25};
        String planets[]= {"Mercury","Venus","Moon","Mars","Jupiter","Saturn","Neptune","Pluto"};
        
        while (y!=1)
        {
            System.out.println("Convert your weight on Earth to:");
            System.out.println("1. Mercury");
            System.out.println("2. Venus");
            System.out.println("3. Moon");
            System.out.println("4. Mars");
            System.out.println("5. Jupiter");
            System.out.println("6. Saturn");
            System.out.println("7. Neptune");
            System.out.println("8. Pluto");
            System.out.println("9. Quit");
            
            System.out.print("Select a destination by number (or 9 to quit) ");
            int destination = keyboard.nextInt();
            
            if (destination<=8&&destination>=0)
            {
            System.out.print("Enter your weight (in pounds): ");
            weight = keyboard.nextInt();
            }
            
            if(destination>9||destination<1)
            {
                System.out.println("Your destination is invalid.");
            }
            else if(destination==9)
            {
                y++;
            }
            else
            {
                destination--;
                double newWeight= weight*planetsRatio[destination];
                System.out.println("Your weight on "+planets[destination]+" would be "+newWeight+" pounds.");
            }
        }
    }  
}
/*

Convert your weight on Earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number (or 9 to quit) 7
Enter your weight (in pounds): 122
Your weight on Neptune would be 136.64 pounds.
Convert your weight on Earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number (or 9 to quit) 123
Your destination is invalid.
Convert your weight on Earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number (or 9 to quit) 9
Convert your weight on Earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number (or 9 to quit) 5
Enter your weight (in pounds): 234
Your weight on Jupiter would be 617.76 pounds.
Convert your weight on Earth to:
1. Mercury
2. Venus
3. Moon
4. Mars
5. Jupiter
6. Saturn
7. Neptune
8. Pluto
9. Quit
Select a destination by number (or 9 to quit) 6
Enter your weight (in pounds): 212
Your weight on Saturn would be 248.04 pounds.


     
 
*/