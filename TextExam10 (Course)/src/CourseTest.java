public class CourseTest
{
  public static void main(String[] args)
  {
    // Creating some instructors
    Instructor inst1 = new Instructor("William", 120);
    Instructor inst2 = new Instructor("Sally", 121);
    Instructor inst3 = new Instructor("Johnathan", 124);

    // Creating some students
    Student stud1 = new Student("Billy", 2);
    Student stud2 = new Student("Wilma", 4);
    Student stud3 = new Student("Vishnu", 3);
    Student stud4 = new Student("Abigail", 2);
    Student stud5 = new Student("Loretta", 2);
    Student stud6 = new Student("Johnny", 3);
    Student stud7 = new Student("Alex", 3);
    Student stud8 = new Student("Phil", 4);

    // Creating a course
    Course course1 = new Course("Biology", inst1);

    // Adding a secondary instructor
    course1.setSecondaryInstructor(inst2);

    // Adding students to the course
    course1.addStudent(stud1);
    course1.addStudent(stud2);
    course1.addStudent(stud3);
    course1.addStudent(stud4);
    course1.addStudent(stud5);

    // Print out the course info
    System.out.println(course1);
  }
}
