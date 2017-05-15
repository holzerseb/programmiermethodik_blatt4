import java.util.List;

/**
 * Created by user on 24.04.2017.
 */
public interface Lecture
{
    /**
     * Returns the Employee
     *
     * @return
     */
    Employee getEmployee();

    /**
     * Returns a list of all students
     * @return
     */
    List<Student> getStudents();

    /**
     * Adds a student to the lecture
     * @param s
     */
    void addStudent(Student s);
    //Additional note here: all Methods in an interface are public and abstract by definition
}
