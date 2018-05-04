/*
Program Name: Forensic
Author: Noah Webb
Class: AP Computer Science
Date: 02/27/17
Program description: Forensic finds height based on bones and gender.
What I learned from this program: How to use arrays to store factors.
Difficulties: Originally tried to put decision making inside array, but 
changed to determine printed line..
*/


import java.util.*;
import java.io.*;
public class Forensic
{
    public static void main (String args[])
    {
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog435t.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        String gender[] = {"F", "M"};
        String bone[] = {"F", "T","H","R"};
        
        String person = null;
        
        
        while(scan.hasNext())
        {
            
            person = scan.nextLine();
            int length = person.length();
            String gend = person.substring(0,1);
            String bo = person.substring(1,2);
            int age = Integer.parseInt(person.substring(2,4));
            double boneLength = Double.parseDouble(person.substring(5,length));
            
            if (gend.equals(gender[0]))
            {
                if (bo.equals(bone[0]))
                {
                    double height = 61.412+2.317*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else if (bo.equals(bone[1]))
                {
                    double height = 72.572+2.533*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else if (bo.equals(bone[2]))
                {
                    double height = 64.977+3.144*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else if (bo.equals(bone[3]))
                {
                    double height = 73.502+3.876*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else 
                {
                    
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\tWrong Bone Code");
                }
            }
            else if (gend.equals(gender[1]))
            {
                if (bo.equals(bone[0]))
                {
                    double height = 69.089+2.238*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else if (bo.equals(bone[1]))
                {
                    double height = 81.688+2.392*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else if (bo.equals(bone[2]))
                {
                    double height = 73.570+2.970*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else if (bo.equals(bone[3]))
                {
                    double height = 80.405+3.650*boneLength;
                    height = (int)(height*1000+.5)/1000.0;
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\t"+height);
                }
                else 
                {
                    
                    System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\tWrong Bone Code");
                }
            }
            else
            {
                System.out.println(gend+"\t"+bo+"\t"+age+"\t"+boneLength+"\tWrong Sex Code");
            }
        }
    }  
}
/*

F	H	45	36.266	178.997
M	F	18	46.967	174.201
M	H	29	33.309	172.498
Q	F	40	30.078	Wrong Sex Code
M	T	95	36.983	170.151
M	R	30	23.1768	165.0
F	F	31	42.55	160.0
M	Q	40	30.0	Wrong Bone Code
F	F	65	39.96	153.999
F	T	50	30.962	150.999
F	R	80	19.375	148.599
M	H	36	24.017	144.9

     


  
 
*/