
/**
 * This class creates a new Cafetaria Object and simulates a real cafetaria
 * 
 * 
 * @author (Laurens op 't Zandt & Joost van Woensel) 
 * @version (1) 01-12-2014
 */
public class CafetariaSimulation
{
    // instance variables, basically just a cafetaria. 
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
            System.out.println("Day "+currentDay +": Articles passed: "+cafetaria.getCheckout().getNumberOfArticlesPassed()
            + " Money collected: "+ cafetaria.getCheckout().getTotalMoneyCollected());
            cafetaria.getCheckout().resetCheckout();
            cafetaria.getCheckout().resetValues();
        }
    }
}
