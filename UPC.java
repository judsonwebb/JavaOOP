/*
Program Name: UPC
Author: Noah Webb
Class: AP Computer Science
Date: 12/6/16
Program description: UPC checks the validity of UPC codes.
What I learned from this program: How to call integers from a string.
Difficulties:Had difficulty printing each number separately. Eventually
gave each number its own print statement.
*/
import java.util.*;
import java.io.*;
public class UPC
{
    public static void main (String args[])
    {
        //This creates the scanner to read the file.
        Scanner scan = null;
        try 
        {
            scan = new Scanner(new File("prog512.dat"));
        } 
        catch (FileNotFoundException e) 
        {
             System.out.println ("File not found!");
             System.exit (0);
        }
        
        //This ensures all information in the file will be read.
        
        while (scan.hasNext())
        {
            //reads a UPC code
        String upc=scan.nextLine();
        
        //makes numbers appropriate for checking code.
        int numOne= ((int) upc.charAt(0))-48;
        int numSeven= ((int) upc.charAt(1))-48;
        int numTwo= ((int) upc.charAt(2))-48;
        int numEight= ((int) upc.charAt(3))-48;
        int numThree= ((int) upc.charAt(4))-48;
        int numNine= ((int) upc.charAt(5))-48;
        int numFour= ((int) upc.charAt(6))-48;
        int numTen= ((int) upc.charAt(7))-48;
        int numFive= ((int) upc.charAt(8))-48;
        int numEleven= ((int) upc.charAt(9))-48;
        int numSix= ((int) upc.charAt(10))-48;
        int numTwelve= ((int) upc.charAt(11))-48;
            
        //finds information to determine validity.
        int check= (3*(int)((numOne+numTwo+numThree+numFour+numFive+numSix))+numSeven+numEight+numNine+numTen+numEleven+numTwelve);  
        check = check/10;
        
        //prints UPC Codes
        char charNumOne= (char)(numOne+48);
        char charNumSeven= (char)(numSeven+48);
        char charNumTwo= (char)(numTwo+48);
        char charNumEight= (char)(numEight+48);
        char charNumThree= (char)(numThree+48);
        char charNumNine= (char)(numNine+48);
        char charNumFour= (char)(numFour+48);
        char charNumTen= (char)(numTen+48);
        char charNumFive= (char)(numFive+48);
        char charNumEleven= (char)(numEleven+48);
        char charNumSix= (char)(numSix+48);
        char charNumTwelve= (char)(numTwelve+48);
        
        System.out.println("UPC Code\tValidity\n");
        System.out.print(charNumOne);
        System.out.print(charNumSeven);
        System.out.print(charNumTwo);
        System.out.print(charNumEight);
        System.out.print(charNumThree);
        System.out.print(charNumNine);
        System.out.print(charNumFour);
        System.out.print(charNumTen);
        System.out.print(charNumFive);
        System.out.print(charNumEleven);
        System.out.print(charNumSix);
        System.out.print(charNumTwelve);
        
        //checks validity of codes
        System.out.print("\t");
        if (check==9)
        {
            System.out.print("Valid\n");
        }
        else
        {
        System.out.print("Invalid\n");
        }
    }
    }
}
/*

UPC Code	Validity

016499215511	Valid
UPC Code	Validity

372415613274	Invalid
UPC Code	Validity

155512994610	Valid
UPC Code	Validity

011165459192	Invalid
UPC Code	Validity

838241762110	Invalid



*/