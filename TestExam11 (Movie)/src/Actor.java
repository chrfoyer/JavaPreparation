public class Actor
{
  // Declaring variables
  private String name;
  private char gender;

  // Constructor
  public Actor(String name, char gender)
  {
    this.name = name;
    // Check if gender is m or f
    // Program is not very progressive
    if (gender == 'm' || gender == 'f')
    {
      this.gender = gender;
    }
  }

  // Getters
  public String getName()
  {
    return name;
  }

  public char getGender()
  {
    return gender;
  }

  // Briefly describe actor in a string
  public String toString()
  {
    return name + " (" + gender + ")"  +"\n";
  }

  // Compare two actors to see if they share a name and gender
  public boolean equals(Object obj)
  {
    if (!(obj instanceof Object))
    {
      return false;
    }
    Actor other = (Actor)obj;
    return (other.name == name && other.gender == gender);
  }
}
