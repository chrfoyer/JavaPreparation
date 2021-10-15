public class MovieTest {
    public static void main(String[] args) {
        Actor nina = new Actor("Nina", 'f');
        Actor dragos = new Actor("Dragos", 'm');

        Director director = new Director("Steffen", "danish");

        Movie movie = new Movie("SDJ", director);
        movie.addActor(nina);
        movie.addActor(dragos);

        System.out.println(movie.getTitle() +", "+ movie.getDirector()+ "\n number of actors: " + movie.getNumberOfActors());
        System.out.println(movie.getActor(1));
        System.out.println(movie.getActor("Nina"));
        System.out.println(movie.allFemaleActors());
    }

}
