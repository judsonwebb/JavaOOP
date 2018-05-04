import java.util.*;
import java.io.*;
public class TestStudent
{
    public static void main(String args[])
    {
        Scanner theScanner = null;
        try 
        {
            theScanner = new Scanner(new File("Prog349f.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        System.out.print("Student\tQuiz1\tQuiz2\tMidTerm\tFinal\tFinal%\tGrade\n");
        int x = 0;
        while(theScanner.hasNext())
        {
            x++;
            Student theStudent = new Student();
            theStudent.setQuizOne(theScanner.nextInt());
            theStudent.setQuizTwo(theScanner.nextInt());
            theStudent.setMidTerm(theScanner.nextInt());
            theStudent.setTheFinal(theScanner.nextInt());
            
            int a=x;
            int b=theStudent.getQuizOne();
            int c=theStudent.getQuizTwo();
            int d=theStudent.getMidTerm();
            int e=theStudent.getTheFinal();
            double f= (((b+c)/20.0)/4.0+(d/100.0)/4.0+(e/100.0)/2.0)*100;
            String g;
            if(f>=90)
            {
                g="A";
            }
            else if(f>=80)
            {
                g="B";
            }
            else if(f>=70)
            {
                g="C";
            }
            else if(f>=60)
            {
                g="D";
            }
            else 
            {
                g="F";
            }
            System.out.print(a+"\t"+b+"\t"+c+"\t"+d+"\t"+e+"\t"+f+"\t"+g+"\n");
            theStudent.setLetter(g);
            theStudent.setFinalGrade(f);
        }
    }
}