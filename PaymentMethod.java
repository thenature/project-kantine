
/**
 * Write a description of class PaymentMethod here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public abstract class PaymentMethod
{
    protected double balance;
    
    public void setBalance(double balance)
    {
        this.balance = balance;
    }
    
    public abstract boolean pay(double toPay);
}
