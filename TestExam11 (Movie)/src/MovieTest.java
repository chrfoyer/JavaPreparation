public class MovieTest
{
  public static void main(String[] args)
  {
    // Create some actors (in a family friendly way)
    Actor actor1 = new Actor("Ryan Reynolds", 'm');
    Actor actor2 = new Actor("Meg Ryan", 'f');
    Actor actor3 = new Actor("Jim Carrey", 'm');
    Actor actor4 = new Actor("Megan Fox", 'f');
    Actor actor5 = new Actor("Shia Le Beouf", 'm');

    // Create a couple of directors
    Director director1 = new Director("Will Wheaton", "American");
    Director director2 = new Director("Lars von Trier", "Danish");

    // Studio greenlights a terrible movie idea
    Movie movie1 = new Movie("Star Wars 23: Birth of an X-Wing", director1);

    // Gotta have some star power to float this POS
    movie1.addActor(actor1);
    movie1.addActor(actor2);
    movie1.addActor(actor3);
    movie1.addActor(actor4);

    // Test of what the poster would say
    System.out.println(movie1);

    // Uh oh! Test audiences hate Will Wheaton for being happy
    // Quick! New director and 100 mil in reshoots!
    movie1.setDirector(director2);

    // Print the new poster
    System.out.println("Breaking News!");
    System.out.println("The director for the 23rd Star Wars has changed!");
    System.out.println(
        "Let's give them free publicity by showing this new poster\n");
    System.out.println(movie1);
  }
}
