
/**
 * A class containing data about students.
 * 
 * @author (Laurens op t Zandt & Joost van Woensel)) 
 * @version (15/12/2014)
 */
public class Student extends Person
{
    //A variable holding the enumerated type of study direction
    private StudyDirection studyDirection;
    //A String holding the student number
    private String studentNumber;

    /**
     * Constructor for objects of class Student
     * It creates an empty student for testing purposes
     */
    public Student()
    {
        super();
        studyDirection = StudyDirection.UNKNOWN;
        studentNumber = "Unknown";
    }
    
    /**
     * Constructor for objects of class Student
     * It creates a Student object (Which extends a person object) holding all variables given.
     */
    public Student(int birthDay, int birthMonth, int birthYear, String firstName ,String lastName, char gender, int bsn, StudyDirection studyDirection,
    String studentNumber)
    {
        super(birthDay, birthMonth, birthYear, firstName, lastName, gender, bsn);
        this.studyDirection = studyDirection;
        this.studentNumber = studentNumber;
    }
    
    /**
     * Return the study direction a a student.
     */
    public StudyDirection getStudyDirection()
    {
        return studyDirection;
    }
    
    /**
     * Sets the studyDirection of a student, takes Enumerated type as input.
     */
    public void setStudyDirection(StudyDirection studyDirection)
    {
        this.studyDirection = studyDirection;
    }
    
    /**
     * Returns a students student number
     */
    public String getStudentNumber()
    {
        return studentNumber;
    }
    
    /**
     * Replaces the studentNumber by the given input String.
     */
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    
    /**
     * Prints all details about the student, overrides to printDetails method from person.
     */
    public void printDetails()
    {
        System.out.println("#######################################");
        System.out.println("Student:");
        System.out.println("Student number: " + getStudentNumber());
        System.out.println("Direction: " + studyDirection.getDirectionName());
        System.out.println("#######################################");
    }
}
