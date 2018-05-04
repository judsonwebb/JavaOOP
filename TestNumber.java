import java.util.*;
import java.io.*;
public class TestNumber
{
    public static void main(String args[])
    {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter a number (0 to 9999): ");
        Begin();
    }
        public static void Begin()
    { 
        Scanner keyboard=new Scanner(System.in);
        int number = keyboard.nextInt();
        Number theNumber = new Number(number);
        System.out.println("Options");
        System.out.println("1) Units");
        System.out.println("2) Tens");
        System.out.println("3) Hundreds");
        System.out.println("4) Thousands");
        System.out.println("5) Quit");
        
        System.out.print("\nWhich option?");
        int choose = keyboard.nextInt();
        while(choose>5||choose<0)
        {
            System.out.println("Invalid: retry ");
            choose = keyboard.nextInt();
        }
        
        
        switch(choose)
        {
            case 1:
            int a = theNumber.getUnit();
            System.out.println("The Units digit is "+a);
            break;
            case 2:
            int b = theNumber.getTen();
            System.out.println("The Tens digit is "+b);
            break;
            case 3:
            int c = theNumber.getHundred();
            System.out.println("The Hundreds digit is "+c);
            break;
            case 4:
            int d = theNumber.getThousand();
            System.out.println("The Thousands digit is "+d);
            break;
            case 5:
            break;
        }
    }
}