/*
Program Name: Income
Author: Noah Webb
Class: AP Computer Science
Date: 02/28/17
Program description: Income calculates information from a survey.
What I learned from this program: How to use multiple arrays to create banks 
of information.
Difficulties: Originally had problems determining the info for lowCount.
Changed the decision making processes to get correct output.
*/


import java.util.*;
import java.io.*;
public class Income
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("survey2.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        System.out.println("id\tincome\tmembers");
        
        int id[] = new int[100];
        int income[] = new int[100];
        int members[] = new int[100];
        
        int x = 0;
        
        while(scan.hasNext())
        {
        x++;
        id[x]=scan.nextInt();
        income[x]=scan.nextInt();
        members[x]=scan.nextInt();
        System.out.println(id[x]+"\t"+income[x]+"\t"+members[x]);
        }
        System.out.println();
        
        int count = 0;
        int sum = 0;
        for (x = 0; x<100;x++)
        {
            int a = income[x];
            if (a>0)
            {
                count++;
                sum = sum +a;
            }
        }
        int lowCount=0;
        double average = sum*1.0/count;
        average = (int)(average*100+.5)/100.0;
        System.out.println("Households with income exceeding an average income of");
        System.out.println(average);
        System.out.println("\nid\tincome\tmembers");
        
        for (x = 0; x<100;x++)
        {
            if (income[x]>average)
            {
                System.out.println(id[x]+"\t"+income[x]+"\t"+members[x]);
            }
            if (income[x]<average&&income[x]!=0)
            {
                lowCount++;
            }
        }
        
        double below = lowCount*1.0/count*100;
        System.out.println("Percent of households below poverty level = "+below+"%");
        
    }  
}
/*

id	income	members
1041	12180	4
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
3210	3200	6
3600	6500	5
3601	11970	2
4725	8900	3
6217	10000	2
9280	6200	1

Households with income exceeding an average income of
12707.38

id	income	members
1062	13240	3
1327	19800	2
1483	22458	8
1900	17000	2
2112	18125	7
2345	15623	2
Percent of households below poverty level = 53.84615384615385%


     
 
*/