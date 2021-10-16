public class Director
{
  private String name;
  private String nationality;

  // Constructor
  public Director(String name, String nationality)
  {
    this.name = name;
    this.nationality = nationality;
  }

  // Getters
  public String getName()
  {
    return name;
  }

  public String getNationality()
  {
    return nationality;
  }

  // Briefly describe director in a string
  public String toString()
  {
    return "Director: " + name + "\nNationality: " + nationality
        + "\n";
  }
}
