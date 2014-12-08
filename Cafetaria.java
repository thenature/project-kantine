
/**
 * This class is almost the top class of the project, it connects all other classes with each other to create a 'big' cafetaria
 * 
 * @author (Laurens op t Zandt, Joost van Woensel) 
 * @version 1 (1/12/2014)
 */
public class Cafetaria
{
    // instance variables
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
     * This method creates a person, connects a tray to it and adds two articles to the tray, then the person is added to the line.
     */
    public void walkGrabGetInLine()
    {
        Person person = new Person();
        Tray tray = new Tray();
        person.setTray(tray);
        person.getTray().addArticle(new Article("Banana", 1.50));
        person.getTray().addArticle(new Article("Sandwich with chicken", 3.50));
        checkoutLine.getBehindOfLine(person);
    }
    
    /**
     * This method processes the line, it uses checkout.checkoutOrder on each person in the line until the line is gone.
     */
    public void processLine()
    {
        while(checkoutLine.thereIsALine())
        {
            Person person = checkoutLine.helpFirstPersonInLine();
            checkout.checkoutOrder(person);
            
        }
    }
    
    /**
     * This method returns the total amount of money in the checkout.
     *
    public double amountOfMoneyInCheckout()
    {
        return checkout.getTotalMoney();
    }
    
     /**
     * This method returns the total number of articles the checkout has passed.
     *
    public int numOfArticlesPassed()
    {
        return checkout.getNumberOfArticles();
    }
    
    /**
     * This method resets the total money and number of articles passed fields of the checkout.
     *
    public void resetCheckout()
    {
        checkout.resetCheckout();
        checkout.resetValues();
    }
    */
    
    /**
     * This method returns the checkout associated with this instance of the cafetaria
     */
    public Checkout getCheckout()
    {
        return checkout;
    }
}
