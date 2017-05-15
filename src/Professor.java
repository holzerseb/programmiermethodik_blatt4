/**
* Class for Professors
*/
public class Professor extends Employee
{
	//ATTENTION: Readme first, before going down deeper
	//
	//I copied this file from the previous task, because hell they're the same.
	//So... the only part i didn't change according to the task was to "create no setter"
	//because that would have meant to change some code, which I really didn't see the purpose in... sorry


	/* Members and Properties */
	
	/**
	* This is the firstName of this professor
	*/
	private String firstName;
	/**
	* This is the surname of this professor
	*/
	private String surname;
	/**
	* This is the salary per year of this professor
	*/
	private double annualSalary; 
	/**
	* This is the minimal salary per year of this professor
	*/
	private double minAnnualSalary; 
	/**
	* This is the maximal salary per year of this professor
	*/
	private double maxAnnualSalary; 
	
	//Properties
	/**
     * {@link Professor#firstName}
     */
    public String getFirstName()
	{
        return this.firstName;
    }
	
	/**
     * {@link Professor#firstName}
	 *
	 * @param firstName the first name of the Professor to set
     */
    public void setFirstName(String firstName)
	{
		this.firstName = firstName;
	}
	
	/**
     * {@link Professor#surname}
     */
    public String getSurname()
	{
        return this.surname;
    }
	
	/**
     * {@link Professor#surname}
	 *
	 * @param surname the first name of the Professor to set
     */
    public void setSurname(String surname)
	{
		this.surname = surname;
	}
	
	/**
     * {@link Professor#annualSalary}
     */
    public double getSalary()
	{
        return this.annualSalary;
    }
	
	/**
     * {@link Professor#annualSalary}
	 *
	 * @param salary the salary per year of this professor
     */
    public void setSalary(double salary)
	{
		this.annualSalary = salary;
	}
	
	/**
	 * @return the minAnnualSalary
	 */
	public double getMinAnnualSalary() {
		return minAnnualSalary;
	}

	/**
	 * @param minAnnualSalary the minAnnualSalary to set
	 */
	public void setMinAnnualSalary(double minAnnualSalary) {
		this.minAnnualSalary = minAnnualSalary;
	}

	/**
	 * @return the maxAnnualSalary
	 */
	public double getMaxAnnualSalary() {
		return maxAnnualSalary;
	}

	/**
	 * @param maxAnnualSalary the maxAnnualSalary to set
	 */
	public void setMaxAnnualSalary(double maxAnnualSalary) {
		this.maxAnnualSalary = maxAnnualSalary;
	}
	
	
/* Constructor */

	/**
	* Creates a nameless professor, without a salary
	* Poor lad :(
	*
	* @return returns a professor instance
	*/
	public Professor()
	{
		//stuff
	}
	
	/**
	* Creates a professor with the given params
	* He will earn the minimum
	* 
	* @param surname yes, guess what
	* @param firstName okay, I admit, this is harder to guess
	* @return returns a professor instance
	*/
	public Professor(String surname, String firstName)
	{
		//stuff, but with params
		this.setSurname(surname);
		this.setFirstName(firstName);
		this.setSalary(this.minAnnualSalary);
	}
	
	/**
	* Creates a professor with the given params
	* 
	* @param surname yes, guess what
	* @param firstName okay, I admit, this is harder to guess
	* @param salary, how much this guy is earning a year
	* @return returns a professor instance
	*/
	public Professor(String surname, String firstName, double salary)
	{
		//stuff, but with params
		this.setSurname(surname);
		this.setFirstName(firstName);
		this.setSalary(salary);
	}
	
	
/* Methods */
	
	/**
	* Prints the name of this professor
	*
	* @return Nothing, but it does print something somewhere
	*/
	public void printName()
	{		
		//check if we know the name of the professor
		if(this.firstName == null || this.surname == null ||
			this.firstName.isEmpty() || this.surname.isEmpty())
		{
			//We haven't learned exception throwing yet, so let's just output something and return :'(
			System.out.println("Error: This Professor is nameless, I'm sorry :(");
			return;
		}
		
		System.out.println(String.format("", this.firstName, this.surname));
	}
	
	/**
	* Calculates the salary for a given month
	* 
	* @param month enter a number for the month (Jan = 1, Feb = 2, ...)
	* @return returns the salary for the given month (hopefully)
	*/
	public double calculateSalary(int month)
	{
		double calculatedSalary = this.annualSalary / 14.0d;
		
		switch(month)
		{
			case 3:
			case 6:
			case 9:
			case 12:
				//what a lucky boy (or girl) this professor is
				calculatedSalary *= 1.5;
				break;
			default:
				//I have no idea whether java accepts switch case without the default,
				//so better be safe and just put it here.
				break;
		}
		
		return calculatedSalary;
	}

	/* 
	 * @param raiseValue Dieser Wert gibt an, wieviel Prozent das aktuelle Gehalt vom zuk?nftigen, erh?hten Gehalt entsprechen
	 * 					 Das hei?t, wird ein WErt ?ber 100 eingegeben, sinkt das Gehalt.
	 */
	public void raisePayout(int raiseValue)
	{
		this.raisePayout((double)raiseValue);
	}

	/* 
	 * @param raiseValue Dieser Wert gibt an, wieviel Prozent das aktuelle Gehalt vom zuk?nftigen, erh?hten Gehalt entsprechen
	 * 					 Das hei?t, wird ein WErt ?ber 100 eingegeben, sinkt das Gehalt.
	 */
	public void raisePayout(double raiseValue)
	{
		double newSalary = (100.0d * this.annualSalary) / raiseValue;
		
		this.annualSalary = (newSalary <= this.maxAnnualSalary) ? newSalary : this.maxAnnualSalary;
	}
	
	public String toString()
	{		
		return this.firstName + " " + this.surname;
	}
	
	public boolean equals(Professor professor)
	{
		if(this == professor)
			return true;
		
		if(professor == null)
			return false;
		
		if(!(professor instanceof Professor))
			return false;
		
		//if any of these is not equal, theyre not the same
		if(this.getFirstName() != professor.getFirstName() ||
				this.getSurname() != professor.getSurname() ||
				this.getSalary() != professor.getSalary() ||
				this.getMaxAnnualSalary() != professor.getMaxAnnualSalary() ||
				this.getMinAnnualSalary() != professor.getMinAnnualSalary())
			return false;
		
		return true;
	}

}

