/**
 * This class allows details about a person to be entered and stored. 
 * There are Getters and Setters to mutate and access details of the object
 * There is a printDetails method to print all information about a person (object)
 * 
 * @author (Laurens op t Zandt, Joost van Woensel) 
 * @version (11/21/2014)
 */
public class Person
{
    //For the BSN variable, the type int is chosen because it can only be a number and never starts with a zero
    private int bsn;
    private String firstName;
    private String lastName;
    private int birthDay;
    private int birthMonth;
    private int birthYear;
    private char gender;
    private Tray tray;

    /**
     * Constructor for objects of class Persoon
     * It sets default values for all field variables. 
     * Some of the variables are set via methods, this is to make sure the tests are made.
     */
    public Person(int birthDay, int birthMonth, int birthYear,String firstName ,String lastName, char gender, int bsn)
    {
        setBirthday(birthDay, birthMonth, birthYear);
        this.gender = gender;
        this.firstName=firstName;
        this.lastName=lastName;
        this.bsn = bsn;
        this.tray = null;
      
    }
    
    /**
     * Constructor for objects of class Persoon
     * It sets default values for all field variables. 
     * No meaningfull value is assigned here, this has to be done via the setters methods.
     */
    public Person()
    {
        this.birthDay = 0;
        this.birthMonth = 0;
        this.birthYear = 0;
        this.gender= '-';
        this.firstName="";
        this.lastName="";
        this.bsn = 0;
        this.tray = null;
    }
    
    /**
     * This method sets a birthday.
     * It performs tests to make sure the birthDay exists.
     */
    public void setBirthday(int birthDay, int birthMonth, int birthYear)
    {

        //This if statement does two different things dependending on the outpout: bool. If bool is true, the client has entered a valid date, else 
        //the information wont be remembered and the birthday will be set to 0 - 0 - 0
        if(isCorrectDay(birthDay, birthMonth, birthYear)){
            this.birthDay = birthDay;
            this.birthMonth = birthMonth;
            this.birthYear = birthYear;
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
    public void setGender(char gender)
    {
       if(gender!='m'&&gender!='v')
       {
           this.gender= '-';
           System.out.println("The gender character has to be a m or a v");
       }else
       {
           this.gender = gender;
       }
    }
    
     /**
     * The setFirstName method allows the client to set their first name
     */
    public void setFirstName(String firstName)
    {
        this.firstName=firstName;
    }
    
     /**
     * The setLastName method allows the client to set their last name
     */
    public void setLastName(String lastName)
    {
        this.lastName=lastName;
    }
    
    /**
     * The setBsn method allows the client to enter a BSN number, it will be stored in the field variable.
     */
    public void setBsn(int bsn)
    {
        this.bsn=bsn;
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
    
    /**
     * Getter for Birth Day
     * @return Birth Day
     */
    public String getBirthDay()
    { 
        String temp;
        if (birthDay==0 && birthMonth==0 && birthYear==0) {
            temp="Unknown";
        } else {
            temp=birthDay+"/"+birthMonth+"/"+birthYear;
        }
        return temp;
    }
    
     /**
     * Getter for BSN number
     * @return BSN number
     */
    public int getBsn()
    { 
        return bsn;
    }
    
     /**
     * Getter for First Name
     * @return First Name
     */
    public String getFirstName()
    { 
        return firstName;
    }
    
     /**
     * Getter for Last Name
     * @return Last Name
     */
    public String getLastName()
    { 
        return lastName;
    }
    
    /**
     * Getter for Gender
     * @return Gender
     */
    public char getGender()
    { 
        return gender;
    }
    
    /**
     * This method turns a character (m or v) into the word Male or Female, this looks nicer when the details about the objects state are printed
     */
    public String charToStringGender(char gender)
    {
        String tempGender;
        if(gender=='m'){
            tempGender="Male";
        }else if(gender=='v'){
            tempGender="Female";
        }else{
            tempGender="Unknown";
        }
        return tempGender;
    }
    
     /**
     * This method prints all details about the objects state
     */
    public void printDetails()
    {
        System.out.println("#######################################");
        System.out.println("First name: "+firstName);
        System.out.println("Last name: "+lastName);
        System.out.println("BSN: "+bsn);
        System.out.println("Birth Date: "+getBirthDay());
        System.out.println("Gender: "+charToStringGender(gender));
        System.out.println("#######################################");
    }
    
    /**
     * Assigns a tray to a person
     */
    public void getTray(Tray tray)
    {
        this.tray = tray;
    }
    
    /**
     * Allows a person to add an article to their tray
     * 
     */
    public void grabArticle(Article article)
    {
        this.tray.addArticle(article);
    }
    
    /**
     * Returns the collective price of the articles stored on a plate
     */
    public double getTotalPrice()
    {
        return this.tray.getTotalPrice();
    }
    
    /**
     * Returns to number of articles stored on a persons plate
     */
    public int getNumOfArticles()
    {
        return this.tray.getNumOfArticles();
    }
}