/**
 * Created by user on 24.04.2017.
 */

/**
 * A class for persons
 */
public class Person
{
    /* Members */

    protected String firstName;
    public String surName;
    private int age;


    /* Constructors */

    /**
     * Yeah, a constructor
     */
    public Person()
    {
    }

    /**
     * this time with first and surname
     * @param firstName
     * @param surName
     */
    public Person(String firstName, String surName)
    {
        this();
        this.firstName = firstName;
        this.surName = surName;
    }

    /**
     * and even an age, wow
     * @param firstName
     * @param surName
     * @param age
     */
    public Person(String firstName, String surName, int age)
    {
        this(firstName, surName);
        this.age = age;
    }


    /* Properties */

    /**
     * Gets the Surname
     * @return
     */
    public String getSurName()
    {
        return surName;
    }

    /**
     * Guess what this returns
     * @return
     */
    public int getAge()
    {
        return age;
    }


    /* Method-Overloads */

    /**
     * Transforms this person into a string
     * @return
     */
    public String toString()
    {
        return "Firstname: '" + this.firstName + "', Lastname: '" + getSurName() + "'";
    }

}
