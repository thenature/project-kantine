import java.util.*;
/**
 * this class simulates the offers of the cafetaria, it contains the articles that are sold, their prices and the amount left in stock.
 * @author (Laurens op 't Zandt & Joost van Woensel) 
 * @version (1) 08-12-2014
 */
public class CafetariaOffer {
    // this Hashmap containts all the articles, their prices and the amount left in stock
    private HashMap<String, ArrayList<Article>> offer;
    //This hashMap makes sure it knows what articles to add in case the arraylist stored in offer is empty
    private HashMap<String, Article> backupHashMap;
   
    
    /**
     * Constructor. the first variable is a list of articles,
     * the second is a list of prices and the third is a list of the ammounts in stock of the articles
     * Notice, the size of the three arrays has to be the same!
     */
    public CafetariaOffer(String[] articleName, double[] price, int[] amount) {
        offer = new HashMap<String, ArrayList<Article>>();
        backupHashMap = new HashMap<>();
        for(int i=0;i<articleName.length;i++) 
        {
            ArrayList<Article> articles = new ArrayList<Article>();
            backupHashMap.put(articleName[i], new Article(articleName[i], price[i]));
            for(int j=0;j<amount[i];j++) 
            {
                articles.add(new Article(articleName[i], price[i]));
            }
            offer.put(articleName[i], articles);
        }
    }

    /**
     * Private method to get a list of articles, based on the name of the article
     * will return null if the article doesnt exist.
     */
    private ArrayList<Article> getArrayList(String productName) {
         return offer.get(productName); 
    }

    /**
     * Private method to grab an article from the stack
     * returns null if the stack is empty.
     */
    private Article getArticle(ArrayList<Article> stack) {
        if (stack==null) { 
            return null;
        }
        if (stack.size()==0)
        {
           return null;
        }
        else 
        {
            Article temp = stack.get(0);
            stack.remove(0);
            return temp;
        }
    }

    /**
     * public method to grab an article from the stack by its name
     * returns null if the article doesn't exist or is not in stock
     * @param name (of article)
     * @return article (or null)
     */
    public Article getArticle(String name) {
        return getArticle(getArrayList(name));
    }
    
    /**
     * public method to get the ammount of articles left of a certain article.
     * @param articleName
     */
    public int getCurrentStock(String articleName)
    {
        return offer.get(articleName).size();
    }
    
    /**
     * public method to restock an article to the desired level.
     * @param articleName (name of the article you want to restock)
     * @param restocklevel (the amount of the article we want to have in stock, as specified by the cafetaria simulator)
     */
    public int restockArticle(String articleName, int restockLevel)
    {
        Article articleToRestock = backupHashMap.get(articleName);
        int counter=0;
        for(int currentStock = getCurrentStock(articleName); currentStock < restockLevel ; currentStock++)
        {
            offer.get(articleName).add(articleToRestock);
            counter++;
        }
        //Return how many articles have been added
        return counter;
    }
}
