/*
Program Name: Payroll
Author: Noah Webb
Class: AP Computer Science
Date: 12/19/16
Program description: Payroll does time unit conversions, and calculates 
elapsed time.
What I learned from this program: How to calculate elapsed time using
a program.
Difficulties: Originally printed the hours as negatives due to misplaced
variables.
*/


import java.util.*;
import java.io.*;
public class Payroll
{
    public static void main (String args[])
    {
        System.out.println("Conversion Tasks");
        System.out.println("1. hours --> minutes");
        System.out.println("2. days --> hours");
        System.out.println("3. minutes --> hours");
        System.out.println("4. hours --> days");
        System.out.println("5. elapsed time between two times");
        //This creates the scanner to read the file.
        Scanner keyboard = new Scanner(System.in);
        
        System.out.print("\nEnter a number: ");
        int x=keyboard.nextInt();
        
        switch (x)
        {
        
        case 1:
        System.out.print("\nEnter hours: ");
        int hoursOne=keyboard.nextInt();
        int minutesOne=hoursOne*60;
        System.out.println("\n"+minutesOne+" minutes");
        break;
        case 2:
        System.out.print("\nEnter days: ");
        int daysTwo=keyboard.nextInt();
        int hoursTwo=daysTwo*24;
        System.out.println("\n"+hoursTwo+" hours");
        break;
        case 3:
        System.out.print("\nEnter minutes: ");
        int minutesThree=keyboard.nextInt();
        double hoursThree= minutesThree/60.0;
        System.out.println("\n"+hoursThree+" hours");
        break;
        case 4:
        System.out.print("\nEnter hours: ");
        int hoursFour=keyboard.nextInt();
        double daysFour= hoursFour/24.0;
        System.out.println("\n"+daysFour+" days");
        break;
        case 5:
        System.out.print("\nElapsed Time Conversion\n");
        
        System.out.print("Enter the beginning hour: ");
        int hourS = keyboard.nextInt();
        System.out.print("Enter the beginning minutes: ");
        int minuteS=keyboard.nextInt();
        System.out.print("Enter am/pm: ");
        String clearOne=keyboard.nextLine();
        String dayS=keyboard.nextLine();
        
        
        System.out.print("\nEnter the ending hour: ");
        int hourE = keyboard.nextInt();
        System.out.print("Enter the ending minutes: ");
        int minuteE=keyboard.nextInt();
        System.out.print("Enter am/pm: ");
        String clearTwo=keyboard.nextLine();
        String dayE=keyboard.nextLine();
        
        if (dayE.toLowerCase().equals(dayS.toLowerCase()))
        {
            if(minuteE>minuteS)
            {
            
                int endMin = minuteE-minuteS;
                int endHour= hourE-hourS;
                System.out.println("\nThe elapsed time is: "+endHour+" hrs "+endMin+" min");
            }
            else
            {
                int endMin = minuteE+60-minuteS;
                int endHour= hourE-1-hourS;
                System.out.println("\nThe elapsed time is: "+endHour+" hrs "+endMin+" min");
            }
            
        }
        else
        {
            int endMin= minuteE+(60-minuteS);
            if(endMin>=60)
            {
                endMin=endMin-60;
                hourE++;
            }
            hourE--;
            int endHour= hourE + (12-hourS);
            System.out.println("\nThe elapsed time is: "+endHour+" hrs "+endMin+" min");
        }
    }
    }
}
/* Sample Output:

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 5

Elapsed Time Conversion
Enter the beginning hour: 8
Enter the beginning minutes: 14
Enter am/pm: am

Enter the ending hour: 2
Enter the ending minutes: 47
Enter am/pm: pm

The elapsed time is: 6 hrs 33 min

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 1

Enter hours: 5

300 minutes

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 2

Enter days: 5

120 hours

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 3

Enter minutes: 500

8.333333333333334 hours

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 4

Enter hours: 27

1.125 days

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 5

Elapsed Time Conversion
Enter the beginning hour: 6
Enter the beginning minutes: 13
Enter am/pm: am

Enter the ending hour: 11
Enter the ending minutes: 54
Enter am/pm: am

The elapsed time is: 5 hrs 41 min

Conversion Tasks
1. hours --> minutes
2. days --> hours
3. minutes --> hours
4. hours --> days
5. elapsed time between two times

Enter a number: 5

Elapsed Time Conversion
Enter the beginning hour: 8
Enter the beginning minutes: 14
Enter am/pm: am

Enter the ending hour: 2
Enter the ending minutes: 9
Enter am/pm: pm

The elapsed time is: 5 hrs 55 min
 


*/