/*
Program Name: Student
Author: Noah Webb
Class: AP Computer Science
Date: 01/25/17
Program description: Student displays and calculates student data.
What I learned from this program: How to use mutators with objects.
Difficulties: Had trouble with mutators until I remembered they were
void methods. 
*/


import java.util.*;
import java.io.*;

    public class Student
    {
        private int quizOne;
        private int quizTwo;
        private int midTerm;
        private int theFinal;
        private double finalGrade;
        private String letter;
        
        public Student()
        {
            quizOne=0;
            quizTwo=0;
            midTerm=0;
            theFinal=0;
            finalGrade=0;
            letter=null;
        }
        public Student(int a,int b, int c, int d)
        {
            quizOne=a;
            quizTwo=b;
            midTerm=c;
            theFinal=d;
            finalGrade=(((a+b)/20.0)/4.0+(c/100.0)/4.0+(d/100.0)/2.0)*100;
            letter=null;
        }
    
    /****************ACCESSORS*********************/
        public int getMidTerm()
        {
           return midTerm;
        }
        public int getQuizOne()
        {
            return quizOne;
        }
        public int getQuizTwo()
        {
            return quizTwo;
        }
        public int getTheFinal()
        {
            return theFinal;
        }   
        public double getFinalGrade()
        {
            return finalGrade;
        }   
        public String getLetter()
        {
            return letter;
        }   
    /****************MUTATORS*************************/
        public void setQuizOne(int a)
        {
            quizOne = a;
        }
        public void setQuizTwo(int a)
        {
            quizTwo = a;
        }
        public void setMidTerm(int a)
        {
            midTerm = a;
        }
        public void setTheFinal(int a)
        {
            theFinal = a;
        }
        public void setFinalGrade(double a)
        {
            finalGrade = a;
        }
        public void setLetter(String a)
        {
            letter = a;
        }
    }

/*

Student	Quiz1	Quiz2	MidTerm	Final	Final%	Grade
1	      8   	 7	      89	94	    88.0	B
2	      9	     6	      77	90	    83.0	B
3	      10	 10       65	88	    85.25	B
4	      7  	 5	      80	81	    75.5	C

  
 
*/