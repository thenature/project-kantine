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
    private LinkedList<Persoon> line;

    /**
     * Constructor for objects of class Checkout
     */
    public CheckoutLine()
    {
        line = new LinkedList<Persoon>();
    }

    /**
     * An example of a method - replace this comment with your own
     * 
     * @param  y   a sample parameter for a method
     * @return     the sum of x and y 
     */
    public void getBehindOfLine(Persoon person)
    {
        line.add(person);
    }
    
    public Persoon helpFirstPersonInLine()
    {
        return line.pollFirst();
    }
    
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
