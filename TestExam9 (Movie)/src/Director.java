public class Director {
    private String name;
    private String nationality;

    public Director(String name, String nationality){
        this.name = name;
        this.nationality = nationality;
    }

    public String getName(){
        return name;
    }

    public String getNationality(){
        return nationality;
    }

    public String toString(){
        return "Director: " + name + ", " + nationality;
    }
}
