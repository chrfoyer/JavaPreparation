import java.util.ArrayList;

public class Movie {
    private String title;
    private Director director;
    private ArrayList<Actor> cast;

    public Movie(String title, Director director){
        this.title = title;
        this.director = director;
        cast = new ArrayList<>();
    }

    public String getTitle(){
        return title;
    }

    public Director getDirector(){
        return director;
    }

    public void setDirector(Director director){
        this.director = director;
    }

    public void addActor(Actor actor){
        cast.add(actor);
    }

    public int getNumberOfActors(){
        return cast.size();
    }

    public Actor getActor(int index){
        return cast.get(index);
    }

    public Actor getActor(String name){
        for(int i =0; i<cast.size()-1;i++){
            if(cast.get(i).getName().equals(name)){
                return cast.get(i);
            }
        }

        return null;
    }

    public ArrayList<Actor> allFemaleActors(){

        ArrayList<Actor> females = new ArrayList<>();

        for(int i =0; i<cast.size()-1;i++){
            if(cast.get(i).getGender() == 'f' || cast.get(i).getGender() == 'F' ){
                females.add(cast.get(i));
            }
        }
        return females;
    }

}
