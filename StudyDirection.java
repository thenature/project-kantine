
/**
 * Enumeration class StudyDirection
 * It contains all Study directions Students can choose from.
 * 
 * @author (Laurens op t Zandt & Joost van Woensel)
 * @version (15/12/2014)
 */
public enum StudyDirection
{
    //All Study directions with a nice String representation so it can be printed later
    ECONOMICS("Economics"), MEDICAL("Medical"), SPORTS("Sports"), PHYSICS("Physics"), 
    UNKNOWN("Unknown");
    
    //The String holding the nice format of the study direction
    private String directionName;
    
    /**
     * Make a new Enumerated type of Study direction with a String direction Name as parameter
     */
    private StudyDirection(String directionName)
    {
        this.directionName = directionName;
    }
    
    /**
     * Returns the directionName of an enumerated type StudyDirection
     */
    public String getDirectionName()
    {
        return directionName;
    }
}
