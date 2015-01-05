
/**
 * This class allows information about teachers to be stored.
 * 
 * @author (Laurens op t Zandt & Joost van Woensel))  
 * @version (15/12/2014)
 */
public class Teacher extends Person
{
    // A teacher has a department and abbreviation
    private Departments department;
    private String abbreviation;

    /**
     * Constructor for objects of class Teacher
     * It sets a unknown value for the enumerated type. This makes it clear this has not been set yet.
     */
    public Teacher()
    {
        super();
        department = Departments.UNKNOWN;
        abbreviation = "Unkn";
    }
    
    /**
     * Constructor for objects of class Teacher
     * It makes a call to the super with a lot of arguments
     */
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
    
    /**
     * Returns true if the given string is a valid abbreviation
     */
    private boolean isValidAbbreviation(String abbreviation)
    {
        if(abbreviation.length()==4)
        {
            return true;
        }
        return false;
    }
    
    /**
     * Generates an abbreviation from a given string if it contains at least four characters, if the string has less characters, it returns "ZZZZ"
     */
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
    
    /**
     * Returns the department assigned to this teacher
     */
    public Departments getDepartment()
    {
        return department;
    }
    
    /**
     * Sets the department for a teacher object
     */
    public void setDepartment(Departments department)
    {
        this.department = department;
    }
    
    /**
     * Returns the abbreviation of a teacher object
     */
    public String getAbbreviation()
    {
        return abbreviation;
    }
    
    /**
     * Sets the abbriviation for a teacher object
     */
    public void setAbbreviation(String abbreviation)
    {
        this.abbreviation = abbreviation;
    }
    
    /**
     * Prints all details about the teacher, overrides  toString method from person and object.
     */
    public String toString()
    {
        String stringToReturn = super.getPersonInfoWithoutLastHashtags();
        stringToReturn += ("Teacher:\n");
        stringToReturn += ("Department: " + getDepartment().getDepartmentName()+"\n");
        stringToReturn += ("Abbreviation: " + getAbbreviation().toUpperCase()+"\n");
        stringToReturn += "#######################################\n";
        return stringToReturn;
    }
    
}
