
/**
 * Enumeration class StudyDirection - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum StudyDirection
{
    ECONOMICS("Economics"), MEDICAL("Medical"), SPORTS("Sports"), PHYSICS("Physics"), 
    UNKNOWN("Unknown");
    
    private String directionName;
    
    private StudyDirection(String directionName)
    {
        this.directionName = directionName;
    }
    
    public String getDirectionName()
    {
        return directionName;
    }
}
