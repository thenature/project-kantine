
/**
 * Write a description of class Checkout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Checkout
{
    // instance variables - replace the example below with your own
    private CheckoutLine checkoutLine;
    private int numOfArticles;
    private double totalMoney;

    /**
     * Constructor for objects of class Checkout
     */
    public Checkout(CheckoutLine checkoutLine)
    {
        this.checkoutLine = checkoutLine;
        numOfArticles = 0;
        totalMoney = 0;
    }
    
    /**
     * Allows a person to checkout at the checkout (pay for all articles on the tray)
     * The price is added to the total amount of money in the checkout
     * Also the number of Articles is increased
     */
    public void checkoutOrder(Person person)
    {
        double totalPrice = person.getTotalPrice();
        totalMoney += totalPrice;
        int numOfArticles = person.getNumOfArticles();
        this.numOfArticles += numOfArticles;
    }
    
    /**
     * Returns the total amount of articles which passed the checkout since the last time it has been reset
     */
    public int getNumOfArticles()
    {
        return numOfArticles;
    }
    
    /**
     * Returns the total amount of money which has been earned since the last time it has been reset
     */
    public double getTotalMoney()
    {
        return totalMoney;
    }
    
    /**
     * Resets the total amount of money stored in the checkout.
     */
    public void resetCheckout()
    {
        totalMoney = 0;
    }
    
    /**
     * Resets the total amount of articles which passed the checkout.
     */
    public void resetValues()
    {
        numOfArticles = 0;
    }
}
