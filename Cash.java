
/**
 * Cash is used to pay cash, it is only used to define the payment method and handle the payment.
 * 
 * @author (Laurens op 't Zandt & Joost van Woensel) 
 * @version (9-1-2015)
 */
public class Cash extends PaymentMethod
{
    /**
     * decrease the balance with the amount payable
     */
    public boolean pay(double toPay)
    {
        if(balance>=toPay)
        {
            balance-=toPay;
            return true;
        }
        return false;
    }
    
    /**
     * return the class as string.
     */
    public String toString()
    {
        return "Cash";
    }
}
