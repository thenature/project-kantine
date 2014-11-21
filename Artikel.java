
/**
 * Write a description of class Artikel here.
 * 
 * @author (Joost van Woensel & Laurens op 't Zandt) 
 * @version (20-11-2014)
 */
public class Artikel
{
    // Dit is de naam van het artikel
       private String artikelName;
    // Dit is de prijs van het artikel    
       private double artikelPrice;
    /**
     * Constructor for objects of class Artikel
     */
    public Artikel(String name, double price)
    {
        // initialise instance variables
       this.artikelName=name;
       this.artikelPrice=price;
    }


    /**
     * Geef een artikel een nieuwe naam.
     */
    public void setArtikelName(String name)
    {
        this.artikelName=name;
    }
    
    /**
     * Geef een artikel een nieuwe prijs.
     */
    public void setArtikelPrice (double price)
    {
        this.artikelPrice=price;
    }
    
    /**
     * print de naam van een artikel
     */
    public String getArtikelName ()
    {
        return this.artikelName;
    }
    
    /**
     * print de prijs van een artikel
     */
    public double getArtikelPrice()
    {
        return this.artikelPrice;
    }
}