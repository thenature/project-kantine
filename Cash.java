
/**
 * Write a description of class Cash here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cash extends PaymentMethod
{
    
    public boolean pay(double toPay)
    {
        if(balance>=toPay)
        {
            balance-=toPay;
            return true;
        }
        return false;
    }
}
