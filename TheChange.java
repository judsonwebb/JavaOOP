
public class TheChange
{
    private int ones;
    private int quarters;
    private int dimes;
    private int nickels ;
    private int pennies;
    private double total;
    
    public TheChange()
    {
        ones=0;
        quarters=0;
        dimes=0;
        nickels=0;
        pennies=0;
        total=0;
    }
    
    public TheChange(double purchase, double amount)
    {
        int coins[] ={100,25,10,5,1};
        total = amount - purchase; 
        total = (int)(total*100+.5)/100.0;
        int workingT= (int)(total*100);
        ones = workingT/coins[0];
        workingT=workingT%coins[0];
        quarters=workingT/coins[1];
        workingT=workingT%coins[1];
        dimes=workingT/coins[2];
        workingT=workingT%coins[2];
        nickels=workingT/coins[3];
        workingT=workingT%coins[3];
        pennies=workingT;
        
       
    }
    public String toString()
    {
        String str="Ones ="+ones+"\n";
        str+="Quarters ="+quarters+"\n";
        str+="Dimes ="+dimes+"\n";
        str+="Nickels ="+nickels+"\n";
        str+="Pennies ="+pennies+"\n";
        str+="Total Amount =$"+total+"\n";
        return str;
    }

    /***********************Accessors (getters)***************/
    
    public int getOnes()
    {
        return ones;
    }
    public int getQuarters()
    {
        return quarters;
    }
    public int getDimes()
    {
        return dimes;
    }
    public int getNickels()
    {
        return nickels;
    }
     public int getPennies()
    {
        return pennies;
    }
    public double getTotal()
    {
        return total;
    }
    
}
/*


 
*/