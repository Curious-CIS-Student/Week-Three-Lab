import java.util.Calendar;

/**
 * A class to manage romantic dates.
 * CLASS: CIS222 Object Oriented Programming
 * INSTRUCTOR: Dr. Neumann
 * ASSIGNMENT: Week-Three-Lab
 * 
 * @author Isaac Blasiman 
 * @version 2.2.16
 */

// What should the input for the Calendars be?
// SetWhen(when) constructor
// ToString for the RDATE: should it use the Calendar.toString, or something else?
public class RDate
{
    private Calendar when;
    private String where;
    private Person person1;
    private Person person2;

    /**
     * Default constructor for objects of class RDate
     * Resource used for this constructor: http://www.mkyong.com/java/java-date-and-calendar-examples/
     */
    public RDate()
    {
        setWhen();
        setWhere("Here");
        setPerson1(null);
        setPerson2(null);
    }
    
    /**
     * Constructor that sets the time and location of the date, but doesn't specify the participants.
     * @param  when  specifies the time of the date
     * @param  where  specifies the location for the date.
     */
    public RDate(Calendar when, String where)
    {
        setWhen(when);
        setWhere(where);
        setPerson1(null);
        setPerson2(null);
    }

    /**
     * Constructor to specify the time, location, and participants of the date.
     * @param  when  specifies the time of the date.
     * @param  where  specifies the location for the date.
     * @param  person1  the first person involved in the date.
     * @param  person2  the second person involved in the date.
     */
    public RDate(Calendar when, String where, Person person1, Person person2)
    {
        setWhen(when);
        setWhere(where);
        setPerson1(person1);
        setPerson2(person2); 
    }
    
    //ACCESSORS
    
    /**
     * Accessor method to get the time of the date.
     * @return    the time of the date.
     */
    public String getWhen()
    {
        return (
                (this.when.get(Calendar.MONTH) + 1) + "/" + 
                this.when.get(Calendar.DAY_OF_MONTH) + "/" + 
                this.when.get(Calendar.YEAR)
               );
    }
    
    /**
     * Accessor method to get the location of the date.
     * @return   the date's location.
     */
    public String getWhere()
    {
        return this.where;
    }
    
    /**
     * Accessor method to get the first person involved in the date.
     * @return   the first person involved in the date.
     */
    public Person getPerson1()
    {
        return this.person1;
    }
    
    /**
     * Accessor method to get the second person involved in the date.
     * @return   the second person involved in the date.
     */
    public Person getPerson2()
    {
        return this.person2;
    }
    
    // MUTATORS
    
    /**
     * Mutator method to set the time of a date (without using parameters).
     */
    public void setWhen()
    {
        this.when = Calendar.getInstance();
    }
    
    /**
     * Mutator method to set the time of a date.
     * @param  when   the date's desired time
     */
    public void setWhen(Calendar when)
    {
        this.when = when;
    }
    
    /**
     * Mutator method to set the location for the date.
     * @param  where  the date's desired location
     */
    public void setWhere(String where)
    {
        this.where = where;
    }
    
    /**
     * Mutator method to set the first person involved in the date, provided that the second person is not the same gender.
     * @param  person1   the first person to be involved in the date
     */
    public void setPerson1(Person person1)
    {
        if (thisIsIWU(person1, this.person2))
        {
            this.person1 = person1;
        }
    }
   
    /**
     * Mutator method to set the second person involved in the date, provided that the first person is not the same gender.
     * @param  person2   the second person to be involved in the date
     */
    public void setPerson2(Person person2)
    {
        if (thisIsIWU(this.person1, person2))
        {
            this.person2 = person2;
        }
    }
   
    // PUBLIC FUNCTIONS
    public String toString()
    {
        return "Romantic date for " + getPerson1() + " and " + getPerson2() + " at " + getWhere() + " on " + getWhen();
    }
    
    public void printInfo()
    {
        System.out.println(this.toString());
    }
    
    // PRIVATE FUNCTIONS
    private boolean thisIsIWU(Person person1, Person person2)
    {
        if (person1 == null || person2 == null)
        {
            return true;
        }
        else if (person1.getGender().equals(person2.getGender()))
        {
            return false;
        }
        return true; // If execution gets to here we know that neither person is null, and their genders are unequal.
    }
}
