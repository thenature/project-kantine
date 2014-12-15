
/**
 * Enumeration class DepartMents 
 * 
 * @author (Laurens op t Zandt & Joost van Woensel)
 * @version (15/12/2014)
 */
public enum Departments
{
    //All Departments with a nice String representation so it can be printed later
    SPORTS("Sports"), COUNSELING("Counseling"), ENGLISH("English"), MATH("Math"), UNKNOWN("Unknown");
    //The String holding the nice format of the department
    private String departmentName;
    
    /**
     * Make a new Enumerated type of Departments with a String direction Name as parameter
     */
    private Departments(String departmentName)
    {
        this.departmentName = departmentName;
    }
    
    /**
     * Returns the departmentName of an enumerated type Departments
     */
    public String getDepartmentName()
    {
        return departmentName;
    }
}
