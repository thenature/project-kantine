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
     * It sets default values for all field variables. 
     * No meaningfull value is assigned here, this has to be done via the setters methods.
     */
    public Persoon(int day, int month, int year,String newFirstName ,String newLastName, char newGender, int newBsn)
    {
        setBirthday(day, month, year);
        setGender(newGender);
        setFirstName(newFirstName);
        setLastName(newLastName);
        setBsn(newBsn);
      
    }
    
    /**
     * This method sets a birthday.
     * It performs tests to make sure the birthDay exists.
     */
    public void setBirthday(int day, int month, int year)
    {

        //This if statement does two different things dependending on the outpout: bool. If bool is true, the client has entered a valid date, else 
        //the information wont be remembered and the birthday will be set to 0 - 0 - 0
        if(isCorrectDay(day, month, year)){
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
     * This method allows the user to set their gender. it takes a character, namely m or v
     * It has a check to make sure the character entered is valid.
     */
    public void setGender(char newGender)
    {
       if(newGender!='m'&&newGender!='v')
       {
           this.gender= '-';
           System.out.println("The gender character has to be a m or a v");
       }else
       {
           this.gender=newGender;
       }
    }
    
     /**
     * The setFirstName method allows the client to set their first name
     */
    public void setFirstName(String newFirstName)
    {
        this.firstName=newFirstName;
    }
    
     /**
     * The setLastName method allows the client to set their last name
     */
    public void setLastName(String newLastName)
    {
        this.lastName=newLastName;
    }
    
    /**
     * The setBsn method allows the client to enter a BSN number, it will be stored in the field variable.
     */
    public void setBsn(int newBsn)
    {
        this.bsn=newBsn;
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
    
    /**
     * This method checks whether or not a date exists.
     * It returns a boolean, true when the date exists) false when it does not.
     */
    public boolean isCorrectDay(int day, int month, int year)
    {
        boolean correctDay = true;
        //The first if statement is to make sure some of the requirements are met, a simple test that covers a lot.
        if(day>31||day<1||month<1||month>12||year<1900||year>2100)
        {
            correctDay=false;
        }
        //The else statement covers all other options
        else{
            //This if statement covers months containing 30 days
            if(month==4||month==6||month==9||month==11){
                if(day>30){
                    correctDay=false;
                }
            }
            //This if statement covers the second month, february, containing 28 days in a normal year, and 29 days in a leap year
            if(month==2){
                if(checkLeapYear(year)){
                    if(day>29){
                        correctDay=false;
                    }
                }else{
                    if(day>28){
                        correctDay=false;
                    }
                }
            }
        }
        
        return correctDay;
    }
}
