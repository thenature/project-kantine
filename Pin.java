
/**
 * Write a description of class Pin here.
 * 
 * @author (Joost van Woensel & Laurens op 't Zandt) 
 * @version (09-01-2015)
 */
public class Pin extends PaymentMethod
{
    //set the credit limit, this is standard for everyone, no one is rich enough in our simulation to
    //have a higher limit.
    private double creditLimit;
    private static final double DEFAULT_CREDIT_LIMIT = 200;
    
    public Pin()
    {
        setCreditLimit(200);
    }
    
    /**
     * sets the credit limit
     * @param (the credit limit)
     */
    public void setCreditLimit(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    
    /**
     * this method is used to simulate the payment
     * @param (the amount payable)
     * @return(succesfull or not)
     */
    public boolean pay(double toPay)
    {
        if(toPay<=creditLimit&&balance>=toPay)
        {
            balance-=toPay;
            return true;
        }
        return false;
    }
    
    /**
     * returns Pin
     */
    public String toString()
    {
        return "Pin";
    }
}
