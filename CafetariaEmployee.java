
/**
 * Write a description of class CanteenEmployee here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CafetariaEmployee extends Person
{
    private int employeeNumber;
    private boolean canCheckout;

    /**
     * Constructor for objects of class CanteenEmployee
     */
    public CafetariaEmployee()
    {
        super();
        employeeNumber = 0;
        canCheckout = false;
    }
    
    public CafetariaEmployee(int birthDay, int birthMonth, int birthYear, String firstName ,String lastName, char gender, int bsn, int employeeNumber, boolean canCheckout)
    {
        super(birthDay, birthMonth, birthYear, firstName, lastName, gender, bsn);
        this.employeeNumber = employeeNumber;
        this.canCheckout = canCheckout;
    }
    
    public int getEmployeeNumber()
    {
        return employeeNumber;
    }
    
    public void setEmployeeNumber(int employeeNumber)
    {
        this.employeeNumber = employeeNumber;
    }
    
    public boolean getCanCheckout()
    {
        return canCheckout;
    }
    
    public void setCanCeckout(boolean canCheckout)
    {
        this.canCheckout = canCheckout;
    }
    
    public void printDetails()
    {
        System.out.println("#######################################");
        System.out.println("Cafetaria employee:");
        System.out.println("Employee number: " + getEmployeeNumber());
        System.out.println("Is able to checkout: " + canCheckoutToString());
        System.out.println("#######################################");
    }
    
    private String canCheckoutToString()
    {
        if(getCanCheckout())
        {
            return "Yes";
        }
        return "No";
    }
}
