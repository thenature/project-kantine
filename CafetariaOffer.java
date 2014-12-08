import java.util.*;
/**
 * 
 */
public class CafetariaOffer {
    // internal storage unit
    private HashMap<String, ArrayList<Article>> offer;
    //This hashMap makes sure it knows what articles to add in case the arraylist stored in offer is empty
    private HashMap<String, Article> backupHashMap;
   
    
    /**
     * Constructor. Het eerste argument is een lijst met artikelnamen,
     * het tweede argument is een lijst met prijzen en het derde argument
     * is een lijst met hoeveelheden. Let op: de dimensies van de drie arrays
     * moeten wel gelijk zijn!
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

    /*
     * Private methode om de lijst van artikelen te krijgen op basis van de    
     * naam van het artikel. Retourneert null als artikel niet bestaat.
     */
    private ArrayList<Article> getArrayList(String productName) {
         return offer.get(productName); 
    }

    /**
     * Private methode om een Artikel van de stapel artikelen af te pakken. 
     * Retourneert null als de stapel leeg is.
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
     * Publieke methode om een artikel via naam van de stapel te pakken.
     * Retouneert null als artikel niet bestaat of niet op voorraad is.
     * @param naam (van artikel)
     * @return artikel (of null)
     */
    public Article getArticle(String name) {
        return getArticle(getArrayList(name));
    }
    
    public int getCurrentStock(String articleName)
    {
        return offer.get(articleName).size();
    }
    
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
