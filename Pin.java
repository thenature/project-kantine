
/**
 * Write a description of class Pin here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pin extends PaymentMethod
{
    private double creditLimit;
    
    public void setCreditLimit(double creditLimit)
    {
        this.creditLimit = creditLimit;
    }
    
    public boolean pay(double toPay)
    {
        if(toPay<=creditLimit&&balance>=toPay)
        {
            balance-=toPay;
            return true;
        }
        return false;
    }
}
