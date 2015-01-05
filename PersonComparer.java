
/**
 * Write a description of class PersonComparer here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class PersonComparer
{
    public static void main(String[] args)
    {
        Person person1 = new Person(3,7,1993,"Joost","van Woensel",'m',123456789);
        Person person2 = new Person(3,7,1993,"Joost","van Woensel",'m',123456789);
        Person person3 = person1;
        
        if(person1==person2)
        {
            System.out.println("Person 1 and 2 refer to the same person object");
        }
        
        if(person1.equals(person2))
        {
            System.out.println("Person 1 and 2 are identical");            
        }
        
        if(person1==person3)
        {
            System.out.println("Person 1 and 3 refer to the same person object");
        }
    }
}
