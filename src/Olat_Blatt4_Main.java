public class Main {
	public static void main(String[] args) {
		Employee employee = new Professor("Bob", "Builder", 1400);
		Professor professor = new Professor("John", "Doe", 2000);
		Secretary secretary = new Secretary("Mary", "Jane");

		// create a room with capacity and a course with this room and a professor
		Room room1 = new Room(0, 35);
		Lecture course = new Course(1, room1, employee);
		// add 30 students to course
		for (int i = 0; i < 35; i++) {
			Student s = new Student(i);
			course.addStudent(s);
		}
		// professor gets a raise if more than 25 students are in the course
		if (course.getStudents().size() >= 25) {
			course.getEmployee().raisePayOut(11);
		}

		// try to add a secretary to a seminar
		Seminar seminar = new Seminar(1, room1, secretary);

		// add 30 students to seminar
		for (int i = 0; i < 30; i++) {
			Student s = new Student(i);
			seminar.addStudent(s);
		}

		// create some people
		Student p1 = new Student(1, "Jonny", "Depp");
		Person p2 = new Student(2, "Mary", "Poppins");
		Professor p3 = new Employee(1, "Harry", "Poppins");
		Employee p4 = new Secretary("Susan", "May");

		p4.raisePayOut(1.4f);
	}
}
