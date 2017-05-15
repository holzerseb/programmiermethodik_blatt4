_______________________________
a)
the following only applies when
payout == salary

#secretary.payout
is no valid call, we would access a member called "payout", which must be public as well
otherwise it would return the minPayout

#secretary.minPayout
is an invalid call as well, because the proper call would be Secretary.minPayout
IntelliJ was able to resolve the call though - don't know if thats proper or not, but it
accesses the static minPayout in both cases

#employee.minPayout
same as above

#seminar.getEmployee()
returns null, because the secretary assigned to the seminar is no professor

#seminar.students.size()
number of students in the seminar, which i guess is 30

#p2.getAge()
returns null, because the age was never assigned

#professor.toString()
returns "Doe John"

#p1.toString()
returns whatever the toString() method of java would return, if you don't implement your own
something like "java.whatever.Object.Student"

#p4.getFirstName()
Call goes to Employee.getFirstName(), which doesn't exist. Unfortunate, runtime error

#p4.firstName
actually goes through to Person.firstname, and is a direct access of the field.
Bad programming style, because no data-encapsulation

#p4.getClass()
prints the runtime class of p4, which is either
Person or
Professor


_______________________________
b)
p4.age accesses the variable directly
p4.getAge() calls a method and awaits a return-value.

This is called data-encapsulation and is a important part of OOP.


_______________________________
c)
For p2 it is:
	1. public Person();
	2. public Student(int studentId, String firstname, String lastname);
For p4 it is:
	1. public Person();
	2. public Person(String firstName, String surName);
	3. public Employee(String firstName, String surName);
	4. public Secretary(String firstName, String surName);

because thats the way java works or how i wrote the code to be executed...
base-class is called first, then the derived ones,
and in p4, we call the base-constructors on our own


_______________________________
d)
No, its not possible for any class. Abstract classes cannot be instantiated.
Yes, according to the previous task, p2 couldn't be instantiated, because Student doesn't inherit
the Person-Class. But because that's some pretty obvious thing, I just did it anyway.
Furthermore the Employee-Class cannot be instantiated, because it's an abstract class...


_______________________________
e)
The method
public void raisePayOut(double percentage);
in the class Employee, because p4 has a runtime-type of Employee.
We implicitly casted the secretary to a employee


_______________________________
f)
Uhm, yeah.. in fact it is already declared.
Professor inherits Employees, inherits Person, which has a age declared
We just didn't create a setter, but within Professor, we can access it.


_______________________________
g)
It would overload the Course.addTeacher Method.


_______________________________
h)
Sure you can.
You will have to implement this method in any class that implements this interface
or any class that derives from the class, which implements the interface.
So, you wouldn't have to change anything in our example, because the course
does already have the method implemented and Seminar inherits the method from course.

The only thing you have to consider is, that a method in an interface is always
"public abstract", which means, we must declare our addTeacher in Course public.


_______________________________
i)
the result would be "false", because the id's don't match anyway.

Other than that, the equal method would fail before we get to call it, because we would try to
pass a Person to the equals-Method, which awaits a Student.
Even when the object is in fact a student, the runtime does only know its a Person for sure, so
we have to explicitly cast the person to a student before handing it to the equal method and promising
the compiler that our person is a student.

so:    p1.equals((Student)p2)) == false; //though false, because Id's dont sum up



