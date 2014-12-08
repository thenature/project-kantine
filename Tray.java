import java.util.Stack;
import java.util.Iterator;
/**
 * The class Tray creates a stack of Articles. This enables a Person to store and 'walk around' with multiple
 * Articles
 * 
 * @author (Laurens op 't  Zandt & Joost van Woensel) 
 * @version 1 (01-12-2014)
 */
public class Tray
{
    // instance variables, there is only one
    private Stack<Article> articles;

    /**
     * Constructor for objects of class Tray
     * It creates an empty stack to store objects of type Article
     */
    public Tray()
    {
        articles = new Stack<Article>();
    }
    
    /**
     * Adds an article to the stack
     * @param article, the article which needs to be added to the stack
     */
    public void addArticle(Article article)
    {
        articles.push(article);
    }
    
    /**
     * Returns the number of articles currently in the stack
     */
    public int getNumOfArticles()
    {
        return articles.size();
    }
    
    /**
     * Return the collective price of the articles stored in the stack
     */
    public double getTotalPrice()
    {
        double totalPrice = 0;
        for(Article article : articles)
        {
            totalPrice += article.getArtikelPrice();
        }
        return totalPrice;
    }
    
    /**
     * This method returns the iterator for the Stack articles.
     * This can be used to iterate through all articles collected in this Stack.
     */
    public Iterator<Article> getIterator()
    {
        return articles.iterator();
    }
}
