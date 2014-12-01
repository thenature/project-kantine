
/**
 * Write a description of class CafetariaSimulation here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CafetariaSimulation
{
    // instance variables - replace the example below with your own
    private Cafetaria cafetaria;

    /**
     * Constructor for objects of class CafetariaSimulation
     */
    public CafetariaSimulation()
    {
        cafetaria = new Cafetaria();
    }

    /**
     * Allows the simulation to be started
     * It takes a number of days and simulates them.
     */
    public void simulate(int days)
    {
        for(int currentDay = 1 ; currentDay <= days ; currentDay++)
        {
            for(int j=0;j<10+currentDay;j++){
                cafetaria.walkGrabGetInLine();
            }
            cafetaria.processLine();
            System.out.println("Day "+currentDay +": Articles passed: "+cafetaria.numOfArticlesPassed()+ " Money collected: "+ cafetaria.amountOfMoneyInCheckout());
            cafetaria.resetCheckout();
        }
    }
}
