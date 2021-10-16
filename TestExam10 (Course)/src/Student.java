public class Student
{
  String name;
  int semester;

  // 2 arg constructor
  public Student(String name, int semester)
  {
    this.name = name;
    this.semester = semester;
  }

  // Getters
  public String getName()
  {
    return name;
  }

  public int getSemester()
  {
    return semester;
  }

  // Compare two objects to see if they are students and have equal values
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Object))
    {
      return false;
    }
    Student other = (Student)obj;
    return (name.equals(other.name) && semester == other.semester);
  }

  // Print out information about the student
  public String toString()
  {
    return "Student Name: " + name + " Semester: " + semester;
  }
}
