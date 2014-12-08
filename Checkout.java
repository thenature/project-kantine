import java.util.Iterator;
/**
 * This class allows a checkout to be simulated. Objects of this class exist of a CheckoutLine object, and two other fields
 * it allows a total balance to be simulated and shows the total 
 * 
 * @author (Laurens op t Zandt, Joost van Woensel)  
 * @version 1 (1-12-2014)
 */
public class Checkout
{
    // instance variables
    private CheckoutLine checkoutLine;
    private int numberOfArticlesPassed;
    private double totalMoneyCollected;

    /**
     * Constructor for objects of class Checkout
     */
    public Checkout(CheckoutLine checkoutLine)
    {
        this.checkoutLine = checkoutLine;
        numberOfArticlesPassed = 0;
        totalMoneyCollected = 0;
    }
    
    /**
     * Allows a person to checkout at the checkout (pay for all articles on the tray)
     * The price is added to the total amount of money in the checkout
     * Also the number of Articles is increased
     */
    public void checkoutOrder(Person person)
    {
        double totalPrice = getTotalPriceOfCurrentPerson(person);
        totalMoneyCollected += totalPrice;
        int numberOfArticles = getNumberOfArticlesOfCurrentPerson(person);
        this.numberOfArticlesPassed += numberOfArticles;
    }
    
    /**
     * Returns the total amount of articles which passed the checkout since the last time it has been reset
     */
    public int getNumberOfArticlesPassed()
    {
        return numberOfArticlesPassed;
    }
    
    /**
     * Returns the total amount of money which has been earned since the last time it has been reset
     */
    public double getTotalMoneyCollected()
    {
        return totalMoneyCollected;
    }
    
    /**
     * Resets the total amount of money stored in the checkout.
     */
    public void resetCheckout()
    {
        totalMoneyCollected = 0;
    }
    
    /**
     * Resets the total amount of articles which passed the checkout.
     */
    public void resetValues()
    {
        numberOfArticlesPassed = 0;
    }
    
    /**
     * This method iterates through all Article objects stored in the tray Object of the class person.
     * It returns the total price of the articles
     */
    private double getTotalPriceOfCurrentPerson(Person person)
    {
        Iterator<Article> iterator = person.getTray().getIterator();
        double totalPriceOfCurrentPerson = 0;
        while(iterator.hasNext()){
            Article article = iterator.next();
            totalPriceOfCurrentPerson+=article.getArtikelPrice();
        }
        return totalPriceOfCurrentPerson;
    }
    
    /**
     * This method also iterates through all Article objects stored in the tray Object of the class person.
     * It returns the total amount of articles stored in the collection.
     */
    private int getNumberOfArticlesOfCurrentPerson(Person person)
    {
        Iterator<Article> iterator = person.getTray().getIterator();
        int numberOfArticles = 0;
        while(iterator.hasNext())
        {
            numberOfArticles++;
            iterator.next();
        }
        return numberOfArticles;
    }
}
