import java.util.LinkedList;
import java.util.Iterator;
/**
 * Write a description of class Checkout here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class CheckoutLine
{
    // instance variables - replace the example below with your own
    private LinkedList<Person> line;

    /**
     * Constructor for objects of class Checkout
     */
    public CheckoutLine()
    {
        line = new LinkedList<Person>();
    }

    /**
     * Allows a person to get behind of the line, the object person is added to the linked  List. 
     */
    public void getBehindOfLine(Person person)
    {
        line.add(person);
    }
    
    /**
     * Allows the first person in the line to process their order.
     * The first person is deleted from the list and returned
     */
    public Person helpFirstPersonInLine()
    {
        return line.pollFirst();
    }
    
    /**
     * Returns true if there is at least one person in the line, else it returns false.
     */
    public boolean thereIsALine()
    {
        if(line.size()>0)
        {
            return true;
        }else
        {
            return false;
        }
    }
}
