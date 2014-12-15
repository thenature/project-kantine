
/**
 * Write a description of class Student here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Student extends Person
{
    //A variable holding the enumerated type of study direction
    private StudyDirection studyDirection;
    private String studentNumber;

    /**
     * Constructor for objects of class Student
     */
    public Student()
    {
        super();
        studyDirection = StudyDirection.UNKNOWN;
        studentNumber = "Unknown";
    }
    
    public Student(int birthDay, int birthMonth, int birthYear, String firstName ,String lastName, char gender, int bsn, StudyDirection studyDirection,
    String studentNumber)
    {
        super(birthDay, birthMonth, birthYear, firstName, lastName, gender, bsn);
        this.studyDirection = studyDirection;
        this.studentNumber = studentNumber;
    }
    
    public StudyDirection getStudyDirection()
    {
        return studyDirection;
    }
    
    public void setStudyDirection(StudyDirection studyDirection)
    {
        this.studyDirection = studyDirection;
    }
    
    public String getStudentNumber()
    {
        return studentNumber;
    }
    
    public void setStudentNumber(String studentNumber)
    {
        this.studentNumber = studentNumber;
    }
    
    public void printDetails()
    {
        System.out.println("#######################################");
        System.out.println("Student:");
        System.out.println("Student number: " + getStudentNumber());
        System.out.println("Direction: " + studyDirection.getDirectionName());
        System.out.println("#######################################");
    }
}
