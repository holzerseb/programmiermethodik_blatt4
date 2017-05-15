/**
 * Created by user on 24.04.2017.
 */
public class Seminar extends Course
{
    //we ought to make our attributes "private final static", but somehow I didn't cross
    //any attribute. Unfortunate.
    //because the question will still popup: final on a attribute (field) basically means it can only be set once.
    //and yeah, the static makes it associated with the type, rather then the instance

    /* Constructors */

    /**
     * Constructor
     * @param courseId
     * @param room
     */
    public Seminar(int courseId, Room room)
    {
        super(courseId, room);
    }

    /**
     * Constructor
     * @param courseId
     * @param room
     * @param employee
     */
    public Seminar(int courseId, Room room, Employee employee)
    {
        super(courseId, room, employee);
    }


    /* Methods */

    /**
     * Adds a student to this Seminar
     * @param s
     */
    public void addStudent(Student s)
    {
        //I tend to place abort conditions ahead, instead of placing the "to execute-code" inside all the ifs
        int maxAllowedStudents = 30; //i dont see, why it must be a local variable, but who am i to judge the assignment
        if(this.getStudents().contains(s) ||
                this.getStudents().size() >= this.getRoom().getCapacity() ||
                this.getStudents().size() >= maxAllowedStudents)
            return;

        //If we got up to this place, we still good
        this.getStudents().add(s);
    }
}
