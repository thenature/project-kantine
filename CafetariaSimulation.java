import java.util.*;
/**
 * This class creates a new Cafetaria Object and simulates a real cafetaria
 * 
 * 
 * @author (Laurens op 't Zandt & Joost van Woensel) 
 * @version (1) 01-12-2014
 */
public class CafetariaSimulation
{
    // cafetaria
    private Cafetaria cafetaria;
    //number of articles
    private static final int NUMBER_OF_ARTICLES = 4;
    //Cafetaria Offer
    private CafetariaOffer cafetariaOffer;
    //Random Generator
    private Random random;
    // Articles
    private static final String[] articleNames = new String[] {"Coffee", "Sandwich with Chicken and BBQ Sauce", "Peanut butter jelly sandwich", "Whiskey"};
    //Prices
    private static double[] articlePrices = new double[] {1.50,4.00,3.50,4.00};
    //Minimum and maximum articles per type
    private static final int MIN_ARTICLES_PER_TYPE = 10000;
    private static final int MAX_ARTICLES_PER_TYPE = 20000;
    //Minimum and maximum number of persons per day
    private static final int MIN_PERSONS_PER_DAY = 50;
    private static final int MAX_PERSONS_PER_DAY = 100;
    //Minimum and maximum number of articles per person
    private static final int MIN_ARTICLES_PER_PERSON = 1;
    private static final int MAX_ARTICLES_PER_PERSON = 4;

    /**
     * Constructor for objects of class CafetariaSimulation
     */
    public CafetariaSimulation()
    {
        cafetaria = new Cafetaria();
        random = new Random();
        int[] amounts = getRandomAray(NUMBER_OF_ARTICLES, MIN_ARTICLES_PER_TYPE, MAX_ARTICLES_PER_TYPE);
        cafetariaOffer = new CafetariaOffer(articleNames,articlePrices,amounts);
        cafetaria.setCafetariaOffer(cafetariaOffer);
    }

    /**
     * Allows the simulation to be started
     * It takes a number of days and simulates them.
     */
    public void simulate(int days)
    {
        for(int currentDay = 1 ; currentDay <= days ; currentDay++)
        {
            int numberOfPersonsToday = getRandomValue(MIN_PERSONS_PER_DAY, MAX_PERSONS_PER_DAY);
            for(int j=0;j<numberOfPersonsToday;j++){
                int numberOfArticles = getRandomValue(MIN_ARTICLES_PER_PERSON, MAX_ARTICLES_PER_PERSON);
                int[] articlesToGrab = getRandomAray(numberOfArticles,0,NUMBER_OF_ARTICLES-1);
                String[] articles = giveArticleNames(articlesToGrab);
                cafetaria.walkGrabGetInLine(makeNewPersonWithTray(),articles);
            }
            cafetaria.processLine();
            System.out.println("Day "+currentDay +": Articles passed: "+cafetaria.getCheckout().getNumberOfArticlesPassed()
            + " Money collected: "+ cafetaria.getCheckout().getTotalMoneyCollected() + " Number of Customers: " + numberOfPersonsToday);
            cafetaria.getCheckout().resetCheckout();
            cafetaria.getCheckout().resetValues();
        }
    }
    
    private Person makeNewPersonWithTray()
    {
        Person person = new Person();
        Tray tray = new Tray();
        person.setTray(tray);
        return person;
    }
    
    private int[] getRandomAray(int length, int min, int max)
    {
        int[] tempArray = new int[length];
        for(int i = 0 ; i<length;i++)
        {
            tempArray[i] = getRandomValue(min,max);
        }
        return tempArray;
    }
    
    private int getRandomValue(int min, int max)
    {
        return random.nextInt(max-min+1)+min;
    }
    
    private String[] giveArticleNames(int[] indices)
    {
        String[] articles = new String[indices.length];
        for(int i = 0; i<indices.length ; i++)
        {
            articles[i] = articleNames[indices[i]];
        }
        return articles;
    }
    
    
}
