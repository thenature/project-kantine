
/**
 * This class is an extention of the people class,
 * it describes the specific person of type cafetaria employee.
 * this person has an employeeNumber and has (or hasn't) the ability to man the register.
 * 
 * @author (Laurens op 't Zandt) 
 * @version (15-12-2014)
 */

public class CafetariaEmployee extends Person implements DiscountCardHolder
{
    private int employeeNumber;
    private boolean canCheckout;
    private static final double MAX_DISCOUNT = Double.MAX_VALUE;
    private static final boolean HAS_MAXIMUM = false;
    private static final double DISCOUNT_PERCENTAGE = 0.25;

    /**
     * Constructor for objects of class CanteenEmployee
     * standard values from the super class are used, standard employee has number -1
     * to make obvious that this employee has not been properly set up yet.
     */
    public CafetariaEmployee()
    {
        super();
        employeeNumber = -1;
        canCheckout = false;
    }
    
    /**
     * Constructor for objects of class CanteenEmployee
     * you can add your own values to this one.
     */
    public CafetariaEmployee(int birthDay, int birthMonth, int birthYear, String firstName ,String lastName, char gender, int bsn, int employeeNumber, boolean canCheckout)
    {
        super(birthDay, birthMonth, birthYear, firstName, lastName, gender, bsn);
        this.employeeNumber = employeeNumber;
        this.canCheckout = canCheckout;
    }
    
    /**
     * returns the employeenumber
     */
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    /**
     * sets the employeenumber
     */
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
    
    
    /**
     * returns if the cassier is capable of checking out.
     */
    public boolean getCanCheckout()
    {
        return canCheckout;
    }
    
    
    /**
     * sets if the cassier is capable of checking out.
     */
    public void setCanCeckout(boolean canCheckout)
    {
        this.canCheckout = canCheckout;
    }
    
    /**
     * Prints all details about the teacher, overrides  toString method from person and object.
     */
    public String toString()
    {
        String stringToReturn = super.getPersonInfoWithoutLastHashtags();
        stringToReturn += "Cafetaria employee:\n";
        stringToReturn += ("Employee number: " + getEmployeeNumber()+"\n");
        stringToReturn += ("Is able to checkout: " + canCheckoutToString()+"\n");
        stringToReturn += ("#######################################"+"\n");
        return stringToReturn;
    }
    
    /**
     * returns an easier to read answer to the question "can this employee work at the register"
     */
    private String canCheckoutToString()
    {
        if(getCanCheckout())
        {
            return "Yes";
        }
        return "No";
    }
    
    public double giveMaximum()
    {
        return MAX_DISCOUNT;
    }
    
    public boolean hasMaximum()
    {
        return HAS_MAXIMUM;
    }
    
    public double giveDiscountPercentage()
    {
        return DISCOUNT_PERCENTAGE;
    }
}
