public class Instructor
{
  String name;
  int officeNumber;

  public Instructor(String name, int officeNumber)
  {
    this.name = name;
    this.officeNumber = officeNumber;
  }

  // Getters
  public String getName()
  {
    return name;
  }

  public int getOfficeNumber()
  {
    return officeNumber;
  }

  // Compare two objects to see if they are both equal Instructor objects
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Instructor))
    {
      return false;
    }
    Instructor other = (Instructor)obj;
    return (name.equals(other.name) && officeNumber == other.officeNumber);
  }

  // String of teacher's name and office number
  public String toString()
  {
    return "Instructor name: " + name + "\nOffice number: " + officeNumber;
  }
}
