/*
Program Name: Expiration
Author: Noah Webb
Class: AP Computer Science
Date: 01/05/17
Program description: Expiration encodes and decodes expiration dates.
What I learned from this program: How to encode expirations.
Difficulties: Dividing the second date into two digits. Fixed with substring.
*/


import java.util.*;
import java.io.*;
public class Expiration
{
    public static void main (String args[])
    {
        int z = 0;
        while (z==0)
        {
        System.out.println("--menu--");
       
        System.out.println("1) Encode Date");
        System.out.println("2) Decode Date");
         System.out.println("3) Quit");
        
        System.out.print("Select an option ");
        Scanner keyboard= new Scanner(System.in);
        
        int statement = keyboard.nextInt();
        String clear = keyboard.nextLine();
        switch(statement)
        {
            case 3:
                break;
            case 1:
                System.out.print("enter date (mm/dd/yy)");
                
                String date=keyboard.nextLine();
                int month = Integer.parseInt(date.substring(0,2));
                int day = Integer.parseInt(date.substring(3,5));
                int year = Integer.parseInt(date.substring(6,date.length()));
                
                String theDay = day+"";
                if (theDay.length()==1)
                {
                    theDay="0"+theDay;
                }
                year=year-70;
                
                year= 27-year;
                char first = (char)(month + 64);
                char second;
                
                second = (char)(((int)(theDay.charAt(0))+32));
                
                
                char third = (char)(((int)theDay.charAt(1))+32);
                
                char fourth = (char)(year+64);
                
                System.out.print("The code is: "+first+second+third+fourth);
                
                break;
            case 2:
                System.out.print("What is the code? ");
                String code = keyboard.nextLine();
                char cFirst= code.charAt(0);
                char cSecond= code.charAt(1);
                char cThird= code.charAt(2);
                char cFourth= code.charAt(3);
                
                int dateOne=((int)(cFirst))-64;
                int secondC =((int)(cSecond))-80;
                int thirdC =((int)(cThird))-80;
                String dateTwoo= (Integer.toString(secondC).concat(Integer.toString(thirdC)));
                int dateTwo=Integer.parseInt(dateTwoo);
                int fourthC=((int)(cFourth))-64;
                fourthC= (27-fourthC)+70;
                int dateThree=fourthC;
                System.out.println("The date is: "+dateOne+"/"+dateTwo+"/"+dateThree);
                break;
        }
        System.out.println("Would you like to continue? Press 1 for yes.");
        int fin = keyboard.nextInt();
        if (fin!=1)
        {
            z++;
        }
    }
    }
}
/*

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
What is the code? AOQV
The date is: 1/1/75

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
What is the code? AQTM
The date is: 1/14/84

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 2
What is the code? IQTN
The date is: 9/14/83

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 3

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 1
enter date (mm/dd/yy)09/14/83
The code is: IQTN

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 1
enter date (mm/dd/yy)01/14/84
The code is: AQTM

--menu--
1) Encode Date
2) Decode Date
3) Quit
Select an option 1
enter date (mm/dd/yy)01/01/75
The code is: APQV


 
*/