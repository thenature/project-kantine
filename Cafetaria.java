
/**
 * Write a description of class Cafetaria here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Cafetaria
{
    // instance variables - replace the example below with your own
    private Checkout checkout;
    private CheckoutLine checkoutLine;

    /**
     * Constructor for objects of class Cafetaria
     */
    public Cafetaria()
    {
        checkoutLine = new CheckoutLine();
        checkout = new Checkout(checkoutLine);
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void walkGrabGetInLine()
    {
        Person person = new Person();
        Tray tray = new Tray();
        person.setTray(tray);
        tray.addArticle(new Article("Banana", 1.50));
        tray.addArticle(new Article("Sandwich with chicken", 3.50));
        checkoutLine.getBehindOfLine(person);
    }
    
    public void processLine()
    {
        while(checkoutLine.thereIsALine())
        {
            Person person = checkoutLine.helpFirstPersonInLine();
            checkout.checkoutOrder(person);
            
        }
    }
    
    public double amountOfMoneyInCheckout()
    {
        return checkout.getTotalMoney();
    }
    
    public int numOfArticlesPassed()
    {
        return checkout.getNumOfArticles();
    }
    
    public void resetCheckout()
    {
        checkout.resetCheckout();
        checkout.resetValues();
    }
}
