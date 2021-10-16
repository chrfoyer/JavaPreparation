import java.util.ArrayList;

public class Course
{
  String title;
  Instructor primaryInstructor;
  Instructor secondaryInstructor;
  ArrayList<Student> students;

  // Constructor
  public Course(String title, Instructor primaryInstructor)
  {
    this.title = title;
    this.primaryInstructor = primaryInstructor;
    // There is a setter for the secondary, so leave it empty for now
    this.secondaryInstructor = null;
    // Make an empty array list
    students = new ArrayList<>();
  }

  // Getters
  public String getTitle()
  {
    return title;
  }

  public Instructor getPrimaryInstructor()
  {
    return primaryInstructor;
  }

  public Instructor getSecondaryInstructor()
  {
    return secondaryInstructor;
  }

  // Setter for secondary instructor
  public void setSecondaryInstructor(Instructor instructor)
  {
    this.secondaryInstructor = secondaryInstructor;
  }

  // Add a new student to the array list
  public void addStudent(Student student)
  {

    {
      students.add(student);
    }
  }

  // Different getters
  public int getNumberOfInstructors()
  {
    // The primary instructor is set in the constructor and the UML diagram
    // shows there must be 1 or 2. So simply see if there is a secondary instructor
    if (secondaryInstructor == null)
    {
      return 1;
    }
    else
    {
      return 2;
    }
  }

  // See how many students are in a given semester in a course
  public int getNumberOfStudents(int semester)
  {
    int count = 0;
    // Loop through students array list and use get semester to see if it is
    // the same as the semester parameter
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getSemester() == semester)
      {
        count++;
      }
    }
    return count;
  }

  // Return an array of students in a given semester in a given course
  public Student[] getStudentsBySemester(int semester)
  {
    // Create the array
    Student[] studentArray = new Student[getNumberOfStudents(semester)];

    // Read the array list of students
    int arrayIndex = 0;
    for(int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getSemester() == semester)
      {
        studentArray[arrayIndex] = students.get(i);
        arrayIndex++;
      }
    }
    // Return the array
    return studentArray;
  }

  // See if there is a student with a given name in the course
  public boolean hasStudent(String name)
  {
    // Check each student name against the parameter
    // Return true as soon as there is the first hit
    for (int i = 0; i < students.size(); i++)
    {
      if (students.get(i).getName().equals(name))
      {
        return true;
      }
    }
    // If the whole loop runs without a hit, return false
    return false;
  }

  // String with the instructor(s) and student(s)
  public String toString()
  {
    // toString in instructor takes care of null check for secondary instructor
    String str = "" + primaryInstructor;

    if (!(secondaryInstructor == null))
    {
      str += "\n" + secondaryInstructor;
    }

    // Add each student to str
    for (int i = 0; i < students.size(); i++)
    {
      str += "\n" + students.get(i);
    }

    // Return the combined string
    return str;
  }
}
