/**
 * Created by user on 24.04.2017.
 */
public class Secretary extends Employee
{
    /* Statics */
    public static double minSalary = 2000.00;
    public static double maxSalary = 5000.00;


    /* Constructors */

    /**
     * Constructor
     */
    public Secretary()
    {
        super();
    }

    /**
     * Constructor
     * @param firstName
     * @param surName
     */
    public Secretary(String firstName, String surName)
    {
        super(firstName, surName);
        this.salary = Secretary.minSalary;
    }

    /**
     * Constructor
     * @param firstName
     * @param surName
     * @param salary
     */
    public Secretary(String firstName, String surName, double salary)
    {
        super(firstName, surName, salary);

        //because we don't want to take advantage of our secretaries
        if(salary < Secretary.minSalary)
            this.salary = Secretary.minSalary;
    }


    /* Methods */

    /**
     * Raises the payout
     * @param percentage
     */
    public void raisePayOut(float percentage)
    {
        //here would probably be some validation like, if(percentage < 0)

        double newSalary = this.salary * (100/percentage);

        if(newSalary > Secretary.maxSalary)
            this.salary = Secretary.maxSalary;
        else
            this.salary = newSalary;
    }
}
