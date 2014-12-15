public class Administration {     
    private static final int DAYS_IN_WEEK = 7;
    private Administration(){}
    /**     
     * Deze methode berekent van de int array aantal de      
     * gemiddelde waarde     
     * @param aantal     
     * @return het gemiddelde     
     */    
    public static double berekenGemiddeldAantal(int[] amount) 
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
     * Deze methode berekent van de double array omzet de    
     * gemiddelde waarde    
     * @param omzet 
     * @return Het gemiddelde  
     */
    public static double berekenGemiddeldeOmzet(double[] salesVolume)
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
      * Methode om dagomzet uit te rekenen     
      * @param omzet     
      * @return array (7 elementen) met dagomzetten     
      */   
     public static double[] berekenDagOmzet(double[] omzet) 
     {       
         double[]
         temp=new double[DAYS_IN_WEEK];
        //Make sure the array has enough elements to prevent nullPointerException. If the length would have been seven it would have worked with the loop below
        //But the above returns the same result so there is no use to use the last loop
        if(omzet.length<=DAYS_IN_WEEK){
            return omzet;
        }
        for(int i=0;i<DAYS_IN_WEEK;i++) {
            int j=0;           
            while(j*DAYS_IN_WEEK<omzet.length) {               
                 temp[i]+=omzet[i+DAYS_IN_WEEK*j];               
                 j++;       
            }
        }
        return temp;    
    }
}