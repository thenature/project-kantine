
/**
 * This class is almost the top class of the project, it connects all other classes with each other to create a 'big' cafetaria
 * 
 * @author (Laurens op t Zandt, Joost van Woensel) 
 * @version 2 (8/12/2014)
 */
public class Cafetaria
{
    // instance variables
    private Checkout checkout;
    private CheckoutLine checkoutLine;
    private CafetariaOffer cafetariaOffer;

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
    public void walkGrabGetInLine(Person person, String[] articleNames)
    {
        for(String articleName : articleNames)
        {
             person.getTray().addArticle(cafetariaOffer.getArticle(articleName));
        }
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
     * This method returns the checkout associated with this instance of the cafetaria
     */
    public Checkout getCheckout()
    {
        return checkout;
    }
    
    /**
     * This method sets the CafetariaOffer.
     */
    public void setCafetariaOffer(CafetariaOffer cafetariaOffer)
    {
        this.cafetariaOffer = cafetariaOffer;
    }
    
    /**
     * This method returns the CafetariaOffer.
     */
    public CafetariaOffer getCafetariaOffer()
    {
        return this.cafetariaOffer;
    }
}
