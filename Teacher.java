
/**
 * Write a description of class Teacher here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Teacher extends Person
{
    // instance variables - replace the example below with your own
    private Departments department;
    private String abbreviation;

    /**
     * Constructor for objects of class Teacher
     */
    public Teacher()
    {
        super();
    }
    
    public Teacher(int birthDay, int birthMonth, int birthYear, String firstName ,String lastName, char gender, int bsn, Departments department, String abbreviation)
    {
        super(birthDay, birthMonth, birthYear, firstName, lastName, gender, bsn);
        this.department = department;
        if(isValidAbbreviation(abbreviation))
        {
            this.abbreviation = abbreviation;
        }else
        {
            this.abbreviation = generateAbbreviationFromName(lastName);
        }
        
    }
    
    private boolean isValidAbbreviation(String abbreviation)
    {
        if(abbreviation.length()==4)
        {
            return true;
        }
        return false;
    }
    
    private String generateAbbreviationFromName(String lastName)
    {
        if(lastName.length()<4)
        {
            return "ZZZZ";
        }
        else
        {
            return lastName.substring(0,4);
        }
    }
    
    public Departments getDepartment()
    {
        return department;
    }
    
    public void setDepartment(Departments department)
    {
        this.department = department;
    }
    
    public String getAbbreviation()
    {
        return abbreviation;
    }
    
    public void setAbbreviation(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }
}
