import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 * Tester of Person and RDate classes.
 * CLASS: CIS222 Object Oriented Programming
 * INSTRUCTOR: Dr. Neumann
 * ASSIGNMENT: Week-Three-Lab
 *
 * @author Isaac Blasiman
 * @version 2.3.16
 * Resources used: http://www.mkyong.com/java/java-date-and-calendar-examples/
 */
public class Main
{

    public static void main(String[] args)
    {
	    // Test of Person and RDate classes.
        System.out.println("TEST OF PERSON CLASS");
        System.out.println();

        // Test 1 will create an instance of the Person class and call getter methods.
        System.out.println("TEST 1: Creating an instance of class Person and calling methods to ensure that the " +
                           "correct values were added.");
        System.out.println("Creating a Person person1 with name 'Bob,' age of 20, and gender 'male.'");
        Person person1 = new Person("Bob", 20, "male");
        System.out.println("The description for person1 is:");
        person1.printInfo();
        System.out.println();

        System.out.println("TEST 2: Verifying that object fields are set correctly:");
        System.out.println("The name for person1 is " + person1.getName() + ".");
        System.out.println("The age for person1 is " + person1.getAge() + ".");
        System.out.println("The gender for person1 is " + person1.getGender() + ".");
        System.out.println();

        System.out.println("TEST 3: Trying to create an instance of class person with incorrect fields.");
        System.out.println("Currently, this should return an object with null or 0 values for all incorrectly set fields.");
        System.out.println("A new implementation with exceptions would prevent the object from being created.");
        System.out.println();
        System.out.println("Creating Person incorrectPerson with name '', age of 0, and gender 'apple'.");
        Person incorrectPerson = new Person("", 0, "apple");
        System.out.println("The name for incorrectPerson is " + incorrectPerson.getName() + ".");
        System.out.println("The age for incorrectPerson is " + incorrectPerson.getAge() + ".");
        System.out.println("The gender for incorrectPerson is " + incorrectPerson.getGender() + ".");
        System.out.println();

        System.out.println("#########################################################################################");

        System.out.println("TEST OF RDATE CLASS");
        System.out.println();

        System.out.println("TEST 1: Creating an RDate defaultRDate with default values and verifying that object " +
                           "fields have been set correctly:");
        RDate defaultRDate = new RDate();
        System.out.println("The time for defaultRDate is " + defaultRDate.getWhen() + ".");
        System.out.println("The location for defaultRDate is " + defaultRDate.getWhere() + ".");
        System.out.println("The first person involved in defaultRDate is " + defaultRDate.getPerson1() + ".");
        System.out.println("The second person involved in defaultRDate is " + defaultRDate.getPerson2() + ".");
        System.out.println();

        System.out.println("TEST 2: Creating an RDate RDate1 with time of 3/14/17, location of 'The Olive Garden,' ");
        System.out.println("and with 'John' and 'Jane' as the people involved.");
        System.out.println("Verifying that object fields have been set correctly:");
        Person John = new Person("John", 39, "male");
        Person Jane = new Person("Jane", 38, "female");
        Calendar myDate = new GregorianCalendar(2017, 3, 14); // Resource listed above was used for this line.
        RDate RDate1 = new RDate(myDate, "The Olive Garden", John, Jane);
        System.out.println("The time for RDate1 is " + RDate1.getWhen() + ".");
        System.out.println("The location for RDate1 is " + RDate1.getWhere() + ".");
        System.out.println("The first person involved in RDate1 is " + RDate1.getPerson1() + ".");
        System.out.println("The second person involved in RDate1 is " + RDate1.getPerson2() + ".");
        System.out.println();

        System.out.println("TEST3: Testing the thisIsIWU() method.");
        System.out.println("Creating an RDate testRDate with time of 11/7/16 and location of 'Ruby Tuesdays'");
        Calendar newDate = new GregorianCalendar(2016, 11, 17); // Resource listed above was used for this line.
        RDate testDate = new RDate(newDate, "Ruby Tuesdays");
        System.out.println("Creating two people, 'Bob' and 'George, both having 'male' as their gender attribute.");
        Person Bob = new Person("Bob", 22, "male");
        Person George = new Person("George", 23, "male");
        System.out.println("Adding 'Bob' to the testDate.");
        testDate.setPerson1(Bob);
        System.out.println("Attempting to add 'George' to testDate. Since 'Bob' is the other participant in the date, ");
        System.out.println("this should  not be allowed, and testDate should only have 'Bob' included as a participant.");
        testDate.setPerson2(George);
        System.out.println();
        System.out.println("Verifying that testDate has not allowed 'George' to participate in the date testDate.");
        System.out.println("The time for testDate is " + testDate.getWhen() + ".");
        System.out.println("The location for testDate is " + testDate.getWhere() + ".");
        System.out.println("The first person involved in testDate is " + testDate.getPerson1() + ".");
        System.out.println("The second person involved in testDate is " + testDate.getPerson2() + ".");
        System.out.println();

        System.out.println("TEST 4: Creating a person 'Jane,' with a gender attribute of 'female,' and attempting to ");
        System.out.println("add her to the testDate described above. Since 'Jane' and 'Bob' have opposite gender ");
        System.out.println("attributes, testDate should accept 'Jane' as the second participant.");
        Person Janet = new Person("Janet", 24, "female");
        testDate.setPerson2 (Janet);
        System.out.println();
        System.out.println("Verifying that testDate has allowed 'Janet' to participate in the date testDate.");
        System.out.println("The time for testDate is " + testDate.getWhen() + ".");
        System.out.println("The location for testDate is " + testDate.getWhere() + ".");
        System.out.println("The first person involved in testDate is " + testDate.getPerson1() + ".");
        System.out.println("The second person involved in testDate is " + testDate.getPerson2() + ".");
        System.out.println();

        System.out.println("END OF TESTING");
    }
}
