/**
 * The Main-Stuff
 */
public class MainClass
{
	
	public static void main(String[] args)
	{
		//Create two Professors
		System.out.println("[INFO] Creating Professors...");
		Professor lilly = new Professor("Lilly", "Bauer", 32000);
		Professor bobby = new Professor("Bob", "Builder", 32000);
		bobby.setMaxAnnualSalary(50000); //cuz otherwise he will be earning 0
		
		//Next we need a room ;)
		System.out.println("[INFO] Creating Room...");
		Room myRoom = new Room(14, 40);

		//And a course
		System.out.println("[INFO] Creating Course...");
		Course myCourse = new Course(301, myRoom, bobby);
		myCourse.setName("Vorlesung: Programmiermethodik");
		myCourse.setMaxStudents(40);

		//maybe a seminar?
		System.out.println("[INFO] Creating Seminar...");
		Seminar mySeminar = new Seminar(301, myRoom, lilly);
		mySeminar.setName("Proseminar: Programmiermethodik");

		//Create a secretary
		System.out.println("[INFO] Creating a secretary, and taking advantage of her, by setting the salary to 600,-");
		Secretary stacy = new Secretary("Stacy", "Sabrent", 600);

		//check
		System.out.println("[CHECK] Check if our exploit on her worked");
		MainClass.printProfessorSalary(stacy);
		System.out.println("[WARNING] Well, minimum salary worked, I guess");

		//Check how many students are in the course
		System.out.println("[CHECK] Printing the amount of students in the course...");
		MainClass.checkStudentsAmount(myCourse);
		System.out.println("[CHECK] Printing the amount of students in the seminar...");
		MainClass.checkStudentsAmount(mySeminar);
		
		//Now create some inquisitive students
		System.out.println("[INFO] Creating Students and adding them to the course and seminar...");
		for(int id = 10; id < 50; id++)
		{
			myCourse.addStudent(new Student(id));
			mySeminar.addStudent(new Student(id)); //not all will be able to be added. Unfortunate.
		}

		//Check how many students are in the course
		System.out.println("[CHECK] Printing the amount of students in the course...");
		MainClass.checkStudentsAmount(myCourse);
		System.out.println("[CHECK] Printing the amount of students in the seminar...");
		MainClass.checkStudentsAmount(mySeminar);

		//Check for some raise
		System.out.println("[INFO] Setting Stacys salary...");
		System.out.println(String.format("[CHECK] Stacys salary currently is %.2f", stacy.salary));
		System.out.println("[INFO] Raise Stacys salary...");
		stacy.raisePayOut(25);
		System.out.println(String.format("[CHECK] Stacys salary currently is %.2f", stacy.salary));

		//Remove some students from the seminar, because we dont like em
		System.out.println("[INFO] Removing 2 students from the seminar...");
		mySeminar.removeStudent(mySeminar.getStudents().get(5));
		mySeminar.removeStudent(mySeminar.getStudents().get(7)); //we actually delete student #8 here

		//Check for even more raise
		System.out.println("[INFO] Try to raise Stacys salary even more...");
		if(stacy == mySeminar.getEmployee())
			stacy.raisePayOut(79.87220447284345);
		stacy.raisePayOut(5);
		System.out.println(String.format("[CHECK] Stacys salary currently is %.2f", stacy.salary));

		//Create three students
		System.out.println("[INFO] Create more students...");
		Student s1 = new Student(100, "Johnny", "Depp");
		Student s2 = new Student(100, "Mary", "Poppins");
		Student s3 = new Student(101, "Mary", "Poppins");
		
		//Check how many students are in the course
		System.out.println("[INFO] Printing the amount of students in the seminar...");
		MainClass.checkStudentsAmount(mySeminar);
		
		//Add the three students
		System.out.println("[INFO] Adding a student to the course...");
		mySeminar.addStudent(s1);
		System.out.println("[INFO] Adding a student to the course...");
		mySeminar.addStudent(s2);
		System.out.println("[INFO] Adding a student to the course...");
		mySeminar.addStudent(s3);
		
		//Check how many students are in the course AGAIN
		System.out.println("[INFO] Printing the amount of students in this course...");
		MainClass.checkStudentsAmount(mySeminar);
	}
	
	/**
	 * Checks, how many students are in a course and prints the results
	 * 
	 * @param course
	 */
	private static void checkStudentsAmount(Course course)
	{
		/* Note: the name checkStudentsAmount does not imply to print something - but maybe we will change the usage
		 * of this method and won't print something in the future, which makes the name suit better imo */
		System.out.println(String.format("There are %d students in the course '%s'", course.getStudentAmount(), course.getName()));
	}

	/** Prints the salary of the professor and his name
	 *
	 * @param prof the professor
	 * */
	private static void printProfessorSalary(Professor prof)
	{
		System.out.println(String.format("Prof. '%s' currently earns ? %.2f", prof.toString(), prof.getSalary()));
	}

	/** Prints the salary of the Secretary and his name
	 *
	 * @param secretary the professor
	 * */
	private static void printProfessorSalary(Secretary secretary)
	{
		System.out.println(String.format("The secretary '%s' currently earns ? %.2f", secretary.toString(), secretary.salary));
	}

}
