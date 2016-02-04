
/**
 * A class to model people.
 * CLASS: CIS222 Object Oriented Programming
 * INSTRUCTOR: Dr. Neumann
 * ASSIGNMENT: Week-Three-Lab
 * 
 * @author Isaac Blasiman 
 * @version 2.1.16
 */
public class Person
{
    private String Name;
    private int Age;
    private String Gender;

    /**
     * Constructor for objects of class Person
     * We use private methods to set the name, age, and gender in order to simplify
     * the constructor and allow it to have greater cohesion. The constructor
     * shouldn't have to check the values and also  initialize them.
     * Currently the constructor simply leaves a null value for a field if there is
     * invalid input, but since we used private methods it will be easy to add an
     * exception setup later.
     */
    public Person(String name, int age, String gender)
    {
        setName(name);
        setAge(age);
        setGender(gender);       
    }

    // PUBLIC METHODS
    
    /**
     * Returns the Age of a person
     * @return   the person's Age
     */
    public int getAge()
    {
        return Age;
    }
    
    /**
     * Returns the Name of a person
     * @return   the person's Name
     */
    public String getName()
    {
        return Name;
    }
    
    /**
     * Returns the Gender of a person
     * @return   the person's Gender
     */
    public String getGender()
    {
        return Gender;
    }
    
    /**
     * Returns a formatted string with information about a person object
     * @return   information about the person in a string
     */
    public String toString()
    {
        return (this.getName() + ", a person who is " + this.getAge() + " years old and " +
                "is " + this.getGender());
    }
    
    public void printInfo()
    {
        System.out.println(this.toString());
    }
    
    // PRIVATE METHODS
    
    /**
     * Sets the name of the person object.
     * @param  name  the desired name for the person
     */
    private void setName(String name)
    {
        if (!(name.equals("")))
        {
            this.Name = name;
        }
    }
    
    /**
     * Sets the age of the person object.
     * @param  age  the desired age for the person
     */
    private void setAge(int age)
    {
        if (age > 0)
        {
            this.Age = age;
        }
    }
    
    /**
     * Sets the gender of the person object ("male" or "female").
     * @param  gender  the desired gender for the person
     */
    private void setGender(String gender)
    {
        // Account for capitalization anomalies.
        gender = gender.toLowerCase();
        if (gender.equals("male") || gender.equals("female"))
        {
            this.Gender = gender;
        }
    }
}