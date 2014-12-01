import java.util.Stack;
/**
 * Write a description of class Tray here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Tray
{
    // instance variables - replace the example below with your own
    private Stack<Article> articles;

    /**
     * Constructor for objects of class Tray
     * It creates an empty stack to store objects of type Article in
     */
    public Tray()
    {
        articles = new Stack<Article>();
    }
    
    /**
     * Adds an artikel to the stack
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
     * Return the collective price of the articles stored on the tray
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
}
