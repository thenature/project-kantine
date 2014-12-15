
/**
 * Enumeration class DepartMents - write a description of the enum class here
 * 
 * @author (your name here)
 * @version (version number or date here)
 */
public enum Departments
{
    SPORTS("Sports"), COUNSELING("Counseling"), ENGLISH("English"), MATH("Math"), UNKNOWN("Unknown");
    private String departmentName;
    
    private Departments(String departmentName)
    {
        this.departmentName = departmentName;
    }
    
    public String getDepartmentName()
    {
        return departmentName;
    }
}
