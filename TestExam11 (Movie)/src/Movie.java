import java.util.ArrayList;

public class Movie
{
  private String title;
  private Director director;
  // Declare cast array list with actors
  private ArrayList<Actor> cast;

  // Constructor
  public Movie(String title, Director director)
  {
    this.title = title;
    // There is always one director
    this.director = director;
    // Creating empty array list
    cast = new ArrayList<>();
  }

  // Getters and setters
  public String getTitle()
  {
    return title;
  }

  public Director getDirector()
  {
    return director;
  }

  // Fire the current director and hire a new one
  public void setDirector(Director director)
  {
    this.director = director;
  }

  // Add an actor to the cast
  public void addActor(Actor actor)
  {
    cast.add(actor);
  }

  // Count the actors in the cast
  public int getNumberOfActors()
  {
    return cast.size();
  }

  // Getting the actor object by the index they appear in the cast
  public Actor getActor(int index)
  {
    return cast.get(index);
  }

  // Get the actor object by their name (overloaded)
  public Actor getActor(String name)
  {
    for (int i = 0; i < cast.size(); i++)
    {
      if (cast.get(i).getName().equals(name))
      {
        return cast.get(i);
      }
    }
    // Return null if no actor with the specified name is found
    return null;
  }

  // Get an array list of all female actors in the cast
  public ArrayList<Actor> allFemaleActors()
  {
    // Create an empty array list to hold the female actors
    ArrayList<Actor> femaleActors = new ArrayList<>();

    // Read each cast member's gender and add them to the array list if female
    for (int i = 0; i < cast.size(); i++)
    {
      if (cast.get(i).getGender() == 'f')
      {
        femaleActors.add(cast.get(i));
      }
    }

    // Return the filled array list
    return femaleActors;
  }

  // toString not included in diagram, but it would be nice
  // Short description of movie
  public String toString()
  {
    // Start string to print
    String str =
        "Coming to a theater near you!" + "\n" + title + "\n" + director
            + "Starring: \n";

    // Add each actor
    for (int i = 0; i < cast.size(); i++)
    {
      str += cast.get(i);
    }

    // Return the filled string
    return str;
  }
}
