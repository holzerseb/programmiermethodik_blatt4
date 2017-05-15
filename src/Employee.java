/**
 * Created by user on 24.04.2017.
 */
public abstract class Employee extends Person
{
    /* Statics */
    public static double minSalary = 1600.00;
    public static double maxSalary = 4000.00;


    /* Members */
    protected double salary;


    /* Constructors */

    /**
     * Is this constructor really necessary?
     * Because it does nothin in an abstract class
     * and even has a empty constructor in its base
     */
    public Employee()
    {
        super(); //...
    }

    /**
     * Constructor
     * @param firstName
     * @param surName
     */
    public Employee(String firstName, String surName)
    {
        super(firstName, surName);
        this.salary = salary;
    }

    /**
     * Constructor, with salary
     * @param firstName
     * @param surName
     * @param salary
     */
    public Employee(String firstName, String surName, double salary)
    {
        super(firstName, surName);
        this.salary = salary;
    }


    /* Methods */

    /**
     * Raises the payout
     * @param percentage
     */
    public void raisePayOut(double percentage)
    {
        //here would probably be some validation like, if(percentage < 0)

        double newSalary = this.salary * (100/percentage);

        if(newSalary > Secretary.maxSalary)
            this.salary = Secretary.maxSalary;
        else
            this.salary = newSalary;
    }
}
