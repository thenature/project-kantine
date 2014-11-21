
/**
 * Deze Klasse  
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Persoon
{
    //For the BSN variable, the type int is chosen because it can only be a number and never starts with a zero
    private int bsn;
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private char gender;

    /**
     * Constructor for objects of class Persoon
     */
    public Persoon()
    {
       this.bsn=0;
       this.firstName="";
       this.lastName="";
       this.birthDay=0;
       this.birthMonth=0;
       this.birthYear=0;
       gender= '-';
      
    }
    
    /**
     * This method sets a birthday.
     * It performs tests to make sure the birthDay exists.
     */
    public void setBirthday(int day, int month, int year)
    {
        boolean bool = true;
        //The first if statement is to make sure some of the requirements are met, a simple test that covers a lot.
        if(day>31||day<1||month<1||month>12||year<1900||year>2100)
        {
            bool=false;
        }
        //The else statement covers all other options
        else{
            //This if statement covers months containing 30 days
            if(month==4||month==6||month==9||month==11){
                if(day>30){
                    bool=false;
                }
            }
            //This if statement covers the second month, february, containing 28 days in a normal year, and 29 days in a leap year
            if(month==2){
                if(checkLeapYear(year)){
                    if(day>29){
                        bool=false;
                    }
                }else{
                    if(day>28){
                        bool=false;
                    }
                }
            }
        }
        //The last if statement does two different things dependending on the outpout: bool. If bool is true, the client has entered a valid date, else 
        //the information wont be remembered and the birthday will be set to 0 - 0 - 0
        if(bool){
            this.birthDay = day;
            this.birthMonth = month;
            this.birthYear = year;
        }else{
            this.birthDay = 0;
            this.birthMonth = 0;
            this.birthYear = 0;
        }
    }
    
        /**
     * The 
     */
    public void setGender(char newGender)
    {
        this.gender=newGender;
    }
    
        /**
     * The 
     */
    public void setFirstName(String newFirstName)
    {
        this.firstName=newFirstName;
    }
    
        /**
     * The 
     */
    public void setLastName(String newLastName)
    {
        this.lastName=newLastName;
    }
    
    /**
     * This method takes an integer Year as input and checks whether or not this year is a leap year. It returns a boolean
     * A true when the input year is a leap year and a false when the input year is not a leap year.
     */
    private boolean checkLeapYear(int leapYear)
    {
        boolean isLeapYear = ((leapYear % 4 == 0) && (leapYear % 100 != 0) || (leapYear % 400 == 0));
        return isLeapYear;
    }
}
