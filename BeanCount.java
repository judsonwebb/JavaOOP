/*
Program Name: BeanCount
Author: Noah Webb
Class: AP Computer Science
Date: 03/29/17
Program description: BeanCount counts beans of black and white, and simulates 
removal.
What I learned from this program: How to use ArrayLists and iterators.
Difficulties: Originally couldn't get my bean remover loop to work until I
realized I had set the .equals to check white & black instead of "White"
and "Black".
*/


import java.util.*;
import java.io.*;
public class BeanCount
{
    public static void main (String args[])
    {
        ArrayList<String> array = new ArrayList<String>();
        Random dent = new Random();
        System.out.println("Beans\tBlack\tWhite\tLast");
        for (int x = 10; x<51; x++)
        {
            array.clear();
            int y = x;
            int white=0;
            int black=0;
            fillList(array,y);
            
            Iterator<String> obl = array.iterator();
            while (obl.hasNext())
            {
                String word = obl.next();
                if(word =="Black")
                {
                    black++;
                }
                if(word =="White")
                {
                    white++;
                }
            }
           
            for (int c=1; c<y;c++)
            {
                int getOne = 100;
                int getTwo = 100;
                do
                {
                getOne = dent.nextInt(x+1-c);
                getTwo = dent.nextInt(x+1-c);
                }
                while(getOne==getTwo);
                
                if(getOne>getTwo)
                {
                    int temp = getOne;
                    getOne=getTwo;
                    getTwo=temp;
                }
                
                String beanOne = array.get(getOne);
                String beanTwo = array.get(getTwo);
                
                if(beanOne.equals("Black")&&beanTwo.equals("White"))
                {
                    array.remove(getOne);
                }
                else if(beanOne.equals("White")&&beanTwo.equals("Black"))
                {
                    array.remove(getTwo);
                }
                else if(beanOne.equals("Black")&&beanTwo.equals("Black"))
                {
                    array.remove(getTwo);
                }
                else if(beanOne.equals("White")&&beanTwo.equals("White"))
                {
                    array.remove(getTwo);
                    array.remove(getOne);
                    array.add("Black");
                }
            }
            String lastBean= array.get(0);
            System.out.println(x+"\t"+black+"\t"+white+"\t"+lastBean);
        }
        
    }
    public static void fillList(ArrayList<String> array, int p)
    {
        Random arthur = new Random();
        for (int z = 0; z<p;z++)
        {
            int n = arthur.nextInt(2);
            if (n==0)
            {
                array.add("White");
                
            }
            else if (n==1)
            {
                array.add("Black");
            }
        }
    }
}  

/*

Beans	Black	White	Last
10	5	5	White
11	5	6	Black
12	2	10	Black
13	8	5	White
14	5	9	White
15	8	7	White
16	8	8	Black
17	7	10	Black
18	9	9	White
19	13	6	Black
20	12	8	Black
21	13	8	Black
22	12	10	Black
23	15	8	Black
24	14	10	Black
25	17	8	Black
26	17	9	White
27	12	15	White
28	11	17	White
29	10	19	White
30	14	16	Black
31	17	14	Black
32	14	18	Black
33	15	18	Black
34	19	15	White
35	18	17	White
36	17	19	White
37	19	18	Black
38	20	18	Black
39	20	19	White
40	23	17	White
41	21	20	Black
42	18	24	Black
43	22	21	White
44	23	21	White
45	26	19	White
46	23	23	White
47	20	27	White
48	20	28	Black
49	28	21	White
50	23	27	White




  
 
*/
