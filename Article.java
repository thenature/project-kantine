
/**
 * This class allows users to create different articles with their respective prices.
 * There are multiple setters and getters to alter the articles.
 * 
 * @author (Joost van Woensel & Laurens op 't Zandt) 
 * @version 2 (01-12-2014)
 */
public class Article
{
    // This is the name of the article
       private String artikelName;
    // This is the price of the article 
       private double artikelPrice;
    /**
     * Constructor for objects of class Article
     */
    public Article(String artikelName, double artikelPrice)
    {
        // initialise the articles name and price
       this.artikelName=artikelName;
       this.artikelPrice=artikelPrice;
    }

    /**
     * Constructor for objects of class Article
     */
    public Article()
    {
        // initialise the articles name and price
       this.artikelName="";
       this.artikelPrice=0.0;
    }
    
    /**
     * Give a new name to an article
     */
    public void setArtikelName(String name)
    {
        this.artikelName=name;
    }
    
    /**
     * Give a new price to an article.
     */
    public void setArtikelPrice (double price)
    {
        this.artikelPrice=price;
    }
    
    /**
     * prints the articles name
     */
    public String getArtikelName ()
    {
        return this.artikelName;
    }
    
    /**
     * prints the articles price
     */
    public double getArtikelPrice()
    {
        return this.artikelPrice;
    }
    
    /**
     * This method prints all details about the objects state
     */
    public void printDetails()
    {
        System.out.println("#######################################");
        System.out.println("Article: "+artikelName);
        System.out.println("Price  : "+artikelPrice);
        System.out.println("#######################################");
    }
}
