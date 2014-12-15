/**
 *A class containing calculations usefull for business practices
 * like avarages by day of the week
 *
 *@author (Laurens op 't Zandt & Joost van Woensel
 *@version (15-12-2014)
 */

public class Administration { 
    
    private static final int DAYS_IN_WEEK = 7;
    
    /**
     * this constructor is used to obstruct the creation of an object because this is a class with just static methods.
     */
    private Administration(){}
    
    /** 
     * this method calculates the avarage value of the int array
     * @param amount     
     * @return the avarage (collectiveAmounts/days)     
     */    
    public static double calculateAverageAmount(int[] amount) 
    {    
        int days = 0;
        //Make it a double so it doesn't have to be casted when dividing
        double collectiveAmounts = 0;
        for(int amountDay : amount)
        {
            days++;
            collectiveAmounts+= amountDay;
        }
        
        return collectiveAmounts / days;
    }
    
    /**     
     * this method calculates the avarage value of the double array salesVolume   
     * @param salesvolume 
     * @return the avarage (collectiveAmounts/days)  
     */
    public static double calculateAverageSalesVolume(double[] salesVolume)
    {      
        int days = 0;
        //Make it a double so it doesn't have to be casted when dividing
        double collectiveAmounts = 0;
        for(double amountDay : salesVolume)
        {
            days++;
            collectiveAmounts+= amountDay;
        }
        
        return collectiveAmounts / days;
    } 
    
     /** 
      * method to calculate the daily sales volume     
      * @param salesVolume     
      * @return array (7 elements) with daily sales volumes     
      */   
     public static double[] calculateDailySalesVolume(double[] salesVolume) 
     {       
         double[]
         temp=new double[DAYS_IN_WEEK];
        //Make sure the array has enough elements to prevent nullPointerException. If the length would have been seven it would have worked with the loop below
        //But the above returns the same result so there is no use to use the last loop
      
        for(int i=0;i<DAYS_IN_WEEK;i++) {
            int j=0;           
            while(i+j*DAYS_IN_WEEK<salesVolume.length) {               
                 temp[i]+=salesVolume[i+DAYS_IN_WEEK*j];               
                 j++;       
            }
        }
        return temp;    
    }
}