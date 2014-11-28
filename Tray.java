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
    private Stack<Artikel> articles;

    /**
     * Constructor for objects of class Tray
     */
    public Tray()
    {
        articles = new Stack<Artikel>();
    }

    public void addArticle(Artikel article)
    {
        articles.push(article);
    }
    
    public int getNumOfArticles()
    {
        return articles.size();
    }
    
    public double getTotalPrice()
    {
        double totalPrice = 0;
        for(Artikel article : articles)
        {
            totalPrice += article.getArtikelPrice();
        }
        return totalPrice;
    }
}
