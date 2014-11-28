
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
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void checkoutOrder(Persoon person)
    {
        double totalPrice = person.getTotalPrice();
        totalMoney += totalPrice;
        int numOfArticles = person.getNumOfArticles();
        this.numOfArticles += numOfArticles;
    }
    
    public int getNumOfArticles()
    {
        return numOfArticles;
    }
    
    public double getTotalMoney()
    {
        return totalMoney;
    }
    
    public void resetCheckout()
    {
        totalMoney = 0;
    }
    
    public void resetValues()
    {
        numOfArticles = 0;
    }
}
