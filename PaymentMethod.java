
/**
 * An abstract class containing info about payment methods.
 * 
 * @author (Laurens op t Zandt & Joost van Woensel) 
 * @version (Version 1)
 */
public abstract class PaymentMethod
{
    protected double balance;
    
    /**
     * This method allows a balance to be set
     */
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    /**
     * This method is used to pay
     */
    public abstract boolean pay(double toPay);
    
    /**
     * With this method the payment method must be returned as a string
     */
    public abstract String toString();
}
